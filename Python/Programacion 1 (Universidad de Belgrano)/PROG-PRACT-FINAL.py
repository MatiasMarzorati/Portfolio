# PROG-PRACT-FINAL
# Version 1.0
# Programa para realizar reservas
# Autor: Marzorati

# Librerias
import random

# Acumulador
montoTotal = 0

# Iniciar listas
mesas = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
personas = ["","","","","","","","","","","","","","","","","","","","",]
pagos = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
asignacion = []

# Cuerpo del programa
while True:
    # Elegir opciones
    opcion = int(input("ELIJA QUE DESEA REALIZAR\n"
                       "1 - Reservar mesa\n"
                       "2 - Fin reservas e imprimir\n"
                       "3 - Resetear para nuevas reservas\n"))
    # Realizar reserva
    if opcion == 1:
        # Pedir datos
        dni = input("Ingresá tu DNI: ")
        monto = int(input("Ingresar el monto de la reserva: "))
        mesasAReservar = int(input("ingrese cantidad de mesas a reservar: "))
        # Inicializar contador
        contador = 0
        # Mientras el contador sea menor a las mesas a reservar...
        while contador < mesasAReservar:
            # Generar número aleatorio
            numeroAleatorio = random.randint(0, 19)
            # Si el número aleatorio no se repite...
            if asignacion.count(numeroAleatorio) == 0:
                # Agregar a la asignación el número
                asignacion.append(numeroAleatorio)
                # Agregar en la posición del número aleatorio el dni y monto
                mesas[numeroAleatorio] = "Reservado con DNI: " + dni + ", y con un monto de $" + str(monto) + " pesos"
                # Sumar contador
                contador = contador + 1
                # Sumar monto al monto total
                montoTotal = montoTotal + monto

    # Finalizar reserva e imprimir
    if opcion == 2:
        # Imprimir resultados
        print(mesas)
        print(f"El monto total es de: ${montoTotal}")

    # Resetear para nuevas reservas (Vaciar todas las variables)
    if opcion == 3:
        montoTotal = 0
        contador = 0
        mesas = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        personas = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ]
        pagos = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        asignacion = []

    # Si la opción está fuera de rango terminar el programa
    if opcion not in [1,2,3]:
        break


