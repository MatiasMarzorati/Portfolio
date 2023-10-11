# PROG-36A
# Version 1.0
# Programa para realizar varias actividades con las matrices
# Autor: Matteozzi y Marzorati

# Importar librerias
import random

# Funciones
def cargarMatrizDesdeArchivo(rutaArchivo):
    archivo = open(rutaArchivo, encoding='utf8', mode='r')
    listaDeLineas = []
    linea = archivo.readline().replace('\n','').split(',')
    while linea != [""]:
        listaDeLineas.append(linea)
        linea = archivo.readline().replace('\n','').split(',')
    archivo.close()
    return listaDeLineas

# Mensaje inicio
opcionMenu = int(input("SELECCIONE LA OPCIÓN DEL MENU\n"
                       "1 - Imprimir tarjeta\n"
                       "2 - Probar ingreso de clave\n"
                       "0 - Salir del sistema\n"))
# Opción 0
if opcionMenu == 0:
    exit()
# Opción 1
matrizTarjeta = cargarMatrizDesdeArchivo("C:/ub/tarjeta.txt")
if opcionMenu == 1:
    print(matrizTarjeta)
# Opción 2
if opcionMenu == 2:
    # Generar valores random
    filaRandom = random.randint(1, 6)
    columnaRandom = random.randint(1, 9)
    # Ingresar un número
    numeroIngresado = input(f"Por favor ingresar el número ubicado en la fila {filaRandom} y en la columna {columnaRandom}: ")
    # Si el número ingresado es igual al valor que se encuentra en la matriz en esa posición devolver q es correcto
    if numeroIngresado == matrizTarjeta[filaRandom - 1][columnaRandom - 1]: # Se pone el valor - 1 porque la matriz empieza en 0
        print("El ingreso es correcto")
    else:
        print("Ingreso invalido")