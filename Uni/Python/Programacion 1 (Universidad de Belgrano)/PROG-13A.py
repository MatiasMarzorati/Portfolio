# PROG-13A
# Version 1.0
# Programa que muestre la sucesion de fibonacci hasta el n ingresado
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Obtener un número
numero = int(input("Ingresar un número: "))
# Asignar el valor obtenido a otras 2 variables
n = numero
n1 = numero
# Factorial
for i in range(1, numero, 1):
    n1 = n1 - 1
    n = n * n1
# Imprimir el resultado
print("El factorial es:",n)

