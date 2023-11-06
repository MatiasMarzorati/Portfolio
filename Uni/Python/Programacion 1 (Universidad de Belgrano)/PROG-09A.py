# PROG-09A
# Version 1.0
# Programa para calcular el precio de un producto.
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

precio = 1
while precio != 0:
    # Ingresar el precio
    precio = int(input("Ingrese cual es el precio de lo que quiere comprar \n"))
    # Si el precio es 0 terminar
    if precio == 0:
        break
    # Imprimir los valores de los pagos
    print("El precio del producto en un pago en efectivo es: $", precio * 0.90)
    print("El precio del producto en un pago es: $", precio)
    print("El precio del producto en 3 cuotas es: $", precio * 1.05,"El valor de cada cuota es: $", precio * 1.05 / 3)
    print("El precio del producto en 6 cuotas es: $", precio * 1.10, "El valor de cada cuota es: $", precio * 1.10 / 6)
    print("El precio del producto en 12 cuotas es: $", precio * 1.15, "El valor de cada cuota es: $", precio * 1.15 / 12)
