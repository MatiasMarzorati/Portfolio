# PAR-EJ4
# Version 1.0
# Programa para calcular promedio de alumnos
# Autor: Matteozzi y Marzorati

print("Bienvenido al calculador de alumnos")
notaAlumno = 1
acumuladorNota = 0
promedioNota = 0
contador = 0
while notaAlumno != 0:
    notaAlumno = int(input("¿Cuál es la nota del "+ str(contador + 1) + " ° alumno?"))
    contador = contador + 1
    acumuladorNota =  acumuladorNota + notaAlumno

contador = contador - 1
promedioNota = acumuladorNota / contador

print("la nota de los "+ str(contador) +" alumnos es de " + str(promedioNota) + " puntos")