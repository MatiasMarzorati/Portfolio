# PROG-08A
# Version 1.0
# Programa para calcular el promedio de los alumnos.
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Obtener datos
cantAlumnos = int(input("¿Cuantos alumnos rindieron el exámen?: "))
# Inicializar variable
totalNotas = 0
# Pedir la nota de todos los alumnos
for alumno in range(1, cantAlumnos +1, 1):
    # Ingresar notas
    print("Ingrese la nota del examen del alumno", alumno,":")
    nota = float(input())
    # Si la nota no es valida volver a pedirla
    if nota < 1 or nota > 10:
        print("Ingrese una nota valida")
        continue
    # Sumar notas al acumulador de notas totales
    totalNotas = totalNotas + nota
# Calculo del promedio
promedio = float(totalNotas / cantAlumnos)
# Imprimir resultados
print("El promedio es de :", promedio)