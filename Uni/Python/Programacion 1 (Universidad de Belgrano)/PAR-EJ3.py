# PAR-EJ-2
# Version 1.0
# Programa para realizar operaciones matemáticas
# Autor: Matteozzi y Marzorati

# Variable para volver a calcular
deseo = 1
while deseo == 1:
    # Obtencion de datos
    numA = float(input("Ingresar número 1: "))
    numB = float(input("Ingresar número 2: "))
    # Mensaje bienvenida
    operacion = input("Bienvenido a la calculadora! Que operacion desea realizar?\n[S] suma, [R] resta, [M] multiplicación o [D] división\n")
    # Realizar cálculo según operación
    if operacion == "S":
        resultado = numA + numB
    elif operacion == "R":
        resultado = numA - numB
    elif operacion == "M":
        resultado = numA * numB
    else:
        while numB == 0:
            numB = float(input("No se puede dividir por 0! Volver a ingresar número 2: "))
        resultado = numA / numB
    # Imprimir resultado
    print(f"El resultado es {resultado}")
    deseo = int(input("Desea realizar otro cálculo? [1] = Si ; [0] = No "))