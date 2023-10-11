# PROG-26A
# Version 1.0
# Programa para poner a los miles
# Autores: Matteozzi y Marzorati

# Obtener informacion
cifra = input("Ingrese numero: ")
salida = cifra[-3:]
for i in range(-3, -len(cifra), -3):
    terna = cifra[i-3:i]
    salida = terna + "." + salida
# Imprimir resultado
print(f"El número final es: {salida}")

