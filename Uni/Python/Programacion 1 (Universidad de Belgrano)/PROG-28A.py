# PROG-28A
# Version 1.0
# Programa para modificar la lista reemplazando las temperaturas que son menores a 0 grados por la cadena “bajo cero”. Imprimir por pantalla la lista modificada.
# Autores: Matteozzi y Marzorati

# Lista
temperaturas = [15 , 13.5 , 5.1 , 3 , 2.2 , -2 , -5 , 8 , 10 , 7.3 , 6 , 3.3 , 0 , -1 , 10 , 8.5 , 0 , 2 , -4 , -3.7 , 0 , 4.6 , 5 , 3 , -0.5 , 1 , 0 , -1 , 4 , 2.9 , -3.1 ]
# Programa
for i in range(1, len(temperaturas), 1):
    if temperaturas[i] < 0:
        temperaturas[i] = "Bajo Cero"
# Imprimir el resultado
print(temperaturas)