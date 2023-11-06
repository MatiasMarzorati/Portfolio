# PROG-11A
# Version 1.0
# Programa que muestre la sumatoria de todos los múltiplos de un número ingresado por el usuario, que se encuentren entre el 0 y el 100.
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Obtener el número
numero = int(input("Ingrese un número: "))
# Acumulador
sumatoria = 0
# Sumar multiplos del 1 al 100 del número ingresado
for i in range(1,101,1):
    multiplo = numero * i
    sumatoria = sumatoria + multiplo
# Imprimir resultado
print("El resultado es:",sumatoria)