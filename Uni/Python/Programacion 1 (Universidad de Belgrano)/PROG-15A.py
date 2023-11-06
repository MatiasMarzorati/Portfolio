# PROG-15A
# Version 1.0
# Programa para calcular el pago de una empresa de viajes de egresados
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Obtención de datos
alumnos = int(input("¿Cuantos alumnos viajaran? "))
# Calculo del valor por alumno
if alumnos >= 100:
    valorAlumno = 120000
elif alumnos < 100 and alumnos >= 50:
    valorAlumno = 135000
elif alumnos < 50 and alumnos >= 30:
    valorAlumno = 150000
elif alumnos < 30:
    valorTotal = 4500000
    valorAlumno = valorTotal / alumnos
# Calculo del valor total
valorTotal = alumnos * valorAlumno
# Impresión de datos
print(f"El valor total del viaje es ${valorTotal}, y se divide entre {alumnos} alumnos, con un valor de ${valorAlumno} por alumno.")