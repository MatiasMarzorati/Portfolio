import mysql.connector
from flask import jsonify
from mysql.connector import Error

class dbManager:
    def __init__(self, host, user, password, database):
        """Inicializa los parámetros de conexión a la base de datos."""
        self.host = host
        self.user = user
        self.password = password
        self.database = database
        self.connection = None

    def create_connection(self):
        """Crea una conexión a la base de datos especificada."""
        try:
            self.connection = mysql.connector.connect(
                host=self.host,
                user=self.user,
                password=self.password,
                database=self.database
            )
            if self.connection.is_connected():
                return "se conecto a la base de datos"
                print(f"Conectado a la base de datos {self.database}")
        except Error as e:
            print(f"Error al conectar a la base de datos: {e}")
            return "no se comecto"

    def close_connection(self):
        """Cierra la conexión a la base de datos."""
        if self.connection and self.connection.is_connected():
            self.connection.close()
            print("Conexión cerrada")

    def execute_query(self, query, params=None):
        """Ejecuta una consulta en la base de datos."""
        if self.connection and self.connection.is_connected():
            try:
                cursor = self.connection.cursor()
                if params:
                    cursor.execute(query, params)
                else:
                    cursor.execute(query)
                self.connection.commit()
                print("Consulta ejecutada correctamente")
            except Error as e:
                print(f"Error al ejecutar la consulta: {e}")

    def fetch_all(self, query, params=None):
        """Ejecuta una consulta SELECT y devuelve todos los resultados en formato JSON."""
        if self.connection and self.connection.is_connected():
            try:
                cursor = self.connection.cursor(dictionary=True)  # Cambia a cursor de tipo diccionario
                if params:
                    cursor.execute(query, params)
                else:
                    cursor.execute(query)
                rows = cursor.fetchall()
                return rows
            except Error as e:
                print(f"Error al ejecutar la consulta: {e}")
                return jsonify([])
