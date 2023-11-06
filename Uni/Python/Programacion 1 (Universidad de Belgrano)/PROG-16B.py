# PROG-16B
# Version 2.0
# Programa para calcular el pago de cuota de gas CON MEJORAS
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Obtener datos
totalFacturado = float(input("¿Cual es el total facturado?: "))
# Realizar calculos mientras que el total facturado no sea nulo
while totalFacturado > 0:
    anio = int(input("¿De que año es la factura?: "))
    # Comprobar que el año sea mayor a 2000
    if anio < 2001:
        print("ingrese un valor de año mayor a 2000")
        continue
    mes = int(input("¿De qué mes es la factura?: "))
    # Comprobar que sea un mes valido
    if mes < 1 or mes > 12:
        print("ingrese un valor de mes valido")
        continue
    # BLOQUE para calcular cant. de días del mes del año
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
    # FIN DEL BLOQUE
    # Calcular el valor diario
    valorDiario = totalFacturado / cantidadDias
    # Imprimir resultados
    print(f"El valor díario es de un total de: ${valorDiario} para el mes {mes} del año {anio}")
    break
# Si el valor de la factura es nulo avisarlo
else:
    # Imprimir mensaje de error
    print("El valor de la factura es nulo")