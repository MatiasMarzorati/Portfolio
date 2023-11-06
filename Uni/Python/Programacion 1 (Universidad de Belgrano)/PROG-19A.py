# PROG-19A
# Version 1.0
# Programa para
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

valor1 = int(input("Ingresar valor 1: "))
valor2 = int(input("Ingresar valor 2: "))

if valor1 < valor2:

    print("DECIMAL HEXADECIMAL BINARIO\n======================================")
    for valor1 in range(valor1, valor2 + 1,1):
        print(valor1,"     ", hex(valor1),"    ", bin(valor1))
else:
    print("¡El valor 2 debe ser mayor al valor 1!")