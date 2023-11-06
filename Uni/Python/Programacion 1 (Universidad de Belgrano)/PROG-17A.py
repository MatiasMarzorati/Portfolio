# PROG-17A
# Version 1.0
# Programa para calcular las ventas de una tienda, según su tipo
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Obtener información
ventas = int(input("Ingresar el número de ventas: "))
# Inicializar tipos de ventas
ventasA = 0
ventasB = 0
ventasC = 0
# Inicializar total de ventas de cada tipo
subTotalA = 0
subTotalB = 0
subTotalC = 0
# Inicializar total de todas las variables
total = 0
# Contador de ventas
contador = 1
# Ingresar valores de cada venta
for contador in range (1,ventas +1, 1):
    monto = int(input(f"Ingresar el monto de la venta {contador}: "))
    # Si el monto es mayor a 1000 calcular la cantidad y subtotal A
    if monto > 1000:
        ventasA = ventasA +1
        subTotalA = subTotalA + monto
    # Si el monto es menor o igual a 1000 y mayor a 500 calcular la cantidad y subtotal b
    elif monto <= 1000 and monto > 500:
        ventasB = ventasB + 1
        subTotalB = subTotalB + monto
    # Si el monto es menor a 500 calcular la cantidad y subtotal C
    if monto < 500:
        ventasC = ventasC +1
        subTotalC = subTotalC + monto
    # Calcular el total final
    total = total + monto
# Imprimir resultados
print(f"Usted generó ${total} pesos:\n"
      f"La cantidad de compras mayores a 1000 son: {ventasA} y generaron: ${subTotalA}.\n"
      f"La cantidad de compras mayores a 500 y menores o iguales a 1000 son: {ventasB} y generaron: ${subTotalB}.\n"
      f"La cantidad de compras menores a 500 son: {ventasC} y generaron: ${subTotalC}.")

