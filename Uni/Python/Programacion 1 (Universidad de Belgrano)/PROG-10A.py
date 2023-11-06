# PROG-10A
# Version 1.0
# Programa para iterar un número (n) y que se sume (n) cant. de veces
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Obtener datos
repeticiones = int(input("Ingresar un número: "))
# Declarar acumulador
sumaNumeros = 0
# Repetir la obtencion de numero la cantidad de veces ingresadas en "repetición"
for i in range(1, repeticiones +1, 1):
    print("Ingresar número", i,":")
    otroNumero = int(input())
    sumaNumeros = sumaNumeros + otroNumero
# Imprimir el resultado
print("El resultado final es:",sumaNumeros)
