# PROG-07A
# Version 1.0
# Programa para pedir uno por uno los precios de los productos comprados por el cliente en un mercado, y que al ingresar un precio igual a cero muestre el total de la compra y la cantidad de productos.
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Inicializar variables y contadores
precioTotal = 0
cantProductos = 0
# Pedir el valor del producto
while cantProductos >= 0:
    valorProducto = float(input("¿Cual es el valor del producto? "))
    # Si el valor del producto es "0" cortar el while
    if valorProducto == 0:
        break
    # Sumar el precio total
    precioTotal = precioTotal + valorProducto
    # Acumular productos
    cantProductos = cantProductos + 1
    # Preguntar si desea realizar otra compra
    otraCompra = int(input("Desea comprar otro producto? [Si = 1 / No = 0] "))
    if otraCompra == 0:
        break
# Imprimir resultados
print("El valor total de la compra es de: $", precioTotal, "y la cantidad de productos adquiridos es:", cantProductos)
