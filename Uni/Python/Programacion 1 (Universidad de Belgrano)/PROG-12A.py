# PROG-12A
# Version 1.0
# Programa que muestre la sucesion de fibonacci hasta el n ingresado
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Obtener un número
n = int(input("Ingresar un número: "))
# Valores iniciales
n1 = 0
n2 = 1
# Imprimir primeros 2 valores
print(n1)
print(n2)
# Fibonacci
for i in range(1, n-1 ,1):
    np = n1 + n2
    n1 = n2
    n2 = np
    print(np)


