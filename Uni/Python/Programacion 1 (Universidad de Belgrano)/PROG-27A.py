# PROG-27A
# Version 1.0
# Programa para listar por pantalla todas las materias.
# Autores: Matteozzi y Marzorati

# Abrir lista
materias = []
# Obtener datos
cantMaterias = int(input("¿Cuantas materias estás cursando?\n"))
for i in range(1, cantMaterias + 1, 1):
    materia = input(f"Escribir el nombre de la materia {i}:\n")
    materias.append(materia)
# Imprimir resultado
print(f"Las materias son:\n {materias}")

