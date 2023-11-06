# PROG-18A
# Version 1.0
# Programa para calcular el sueldo semanal de los trabajadores y el sueldo total a pagar para todos
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Inicializar variables (Acumulador de sueldo total)
total = 0
# Obtener datos
trabajadores = int(input("Ingrese la cantidad de trabajadores: "))
# Para cada trabajador pedir la cantidad de días trabahados y el total a pagar por hora
for i in range(1, trabajadores + 1, 1):
    #Obtener días trabajados y valor por hora
    dias = int(input(f"Ingresar la cantidad de dìas trabajados del empleado {str(i)}:" ))
    valorHora = float(input("Ingresar el valor a pagar por hora del empleado: "))
    # Acumulador de horas totales
    totalHoras = 0
    # Para cada día pedir la cantidad de horas trabajadas
    for j in range(1, dias + 1, 1):
        # Obtener horas trabajadas
        horas = int(input(f"Ingresar la cantidad de horas trabajadas para el dìa {str(j)}:"))
        # Sumar horas al acumulador
        totalHoras = totalHoras + horas
    # Calculo del sueldo semanal
    sueldoSemanal = totalHoras * valorHora
    # Imprimir sueldo semanal del empleado
    print(f"El sueldo del empleado es ${sueldoSemanal}")
    # Sumar sueldos al acumulador
    total = total + sueldoSemanal
# Imprimir el total a pagar de todos los empleados en total
print(f"El total a pagar en la semana es: ${total}")