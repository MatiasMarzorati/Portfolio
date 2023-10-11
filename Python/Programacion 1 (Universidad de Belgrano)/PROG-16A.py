# PROG-16A
# Version 1.0
# Programa para calcular el pago de cuota de gas
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Obtener datos
totalFacturado = float(input("¿Cual es el total facturado?: "))
mes = int(input("¿De qué mes es la factura?: "))
anio = int(input("¿De que año es la factura?: "))
"""
Código para devolver la cantidad de días de cualquier mes de cualquier año
Un año es bisiesto si es: divisible por 4 y no divisible por 100, pero si es divisible por 400 siempre es bisiesto
2000 y 2400 son bisiestos pues aún siendo divisibles por 100 lo son también por 400
1900, 2100, 2200 y 2300 no lo son porque sólo son divisibles por 100
"""
cantidadDias = 0
if mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12:
    cantidadDias = 31
elif mes == 4 or mes == 6 or mes == 9 or mes == 11:
    cantidadDias = 30
elif mes == 2:
    if ((anio % 4 == 0) and not(anio % 100 == 0)) or (anio % 400 == 0):
        cantidadDias = 29
    else:
        cantidadDias = 28
# Calcular el valor diario
valorDiario = totalFacturado / cantidadDias
# Imprimir resultados
print(f"El valor díario es de un total de: ${valorDiario} para el mes {mes} del año {anio}")