# PAR-EJ-5
# Version 1.0
# Programa para consultar por sushi
# Autor: Matteozzi y Marzorati

# Mensaje de bienvenida
print("Bienvenido al restaurant de Sushi!")
# Variable para volver a ejecutar el programa
deseo = 1

while deseo == 1:
    # Obtencion de datos
    salmon = int(input("¿Desea salmón en su rol? [1] = Si ; [0] = No\n"))
    palta = int(input("¿Desea palta en su rol? [1] = Si ; [0] = No\n"))
    pepino = int(input("¿Desea pepino en su rol? [1] = Si ; [0] = No\n"))
    queso = int(input("¿Desea queso en su rol? [1] = Si ; [0] = No\n"))
    atun = int(input("¿Desea atún en su rol? [1] = Si ; [0] = No\n"))
    # Deduccion de roll según ingredientes
    if salmon == 1 and palta == 1 and pepino == 0 and queso == 0 and atun == 0:
        print("El nombre del roll es NEW YORK ROLL.")
    elif salmon == 1 and palta == 0 and pepino == 1 and queso == 0 and atun == 0:
        print("El nombre del roll es KAPPA ROLL.")
    elif salmon == 1 and palta == 1 and pepino == 1 and queso == 0 and atun == 0:
        print("El nombre del roll es MEX ROLL.")
    elif salmon == 1 and palta == 1 and pepino == 0 and queso == 1 and atun == 0:
        print("El nombre del roll es PHILADELPHIA ROLL.")
    elif salmon == 0 and palta == 0 and atun == 1 and pepino == 1 and queso == 1:
        print("El nombre del roll es TUNA ROLL.")
    elif salmon == 1 and palta == 1 and atun == 0 and pepino == 1 and queso ==1:
        print("El nombre del roll es CALIFORNIA ROLL.")
    else:
        print("No contamos con ningun rol con esos ingredientes!")
    # Pregunta para volver a comenzar
    deseo = int(input("¿Desea volver a consultar por otro roll? [1] = Si ; [0] = No\n"))
    # Vaciar variables
    salmon = 0
    palta = 0
    pepino = 0
    queso = 0
    atun = 0