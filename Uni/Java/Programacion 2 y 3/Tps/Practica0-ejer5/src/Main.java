import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Agregar scanner para input
        Scanner teclado = new Scanner(System.in);

        // Crear nuevos vendedores
        Vendedor[] vendedores = new Vendedor[4];
        for (int i = 0; i < 4; i++) {
            vendedores[i] = new Vendedor(i + 1);
        }

        // Atributos
        int numeroVendedor, numeroProducto;
        double valorVenta;

        // Input de cantidad de notas
        System.out.print("Ingrese la cantidad de notas de venta a procesar: ");
        int cantidadNotas = teclado.nextInt();

        // Ingresar por cada nota de venta, el número del vendedor, del producto e ingresar el valor total.
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Nota de venta " + (i + 1) + ":");
            System.out.print("Ingrese el número del vendedor (DEL 1 AL 4): ");
            numeroVendedor = teclado.nextInt();
            System.out.print("Ingrese el número del producto (DEL 1 AL 5): ");
            numeroProducto = teclado.nextInt();
            System.out.print("Ingrese el valor total de la venta: ");
            valorVenta = teclado.nextDouble();
            vendedores[numeroVendedor - 1].agregarVenta(numeroProducto, valorVenta);
        }

        // Imprimir las ventas por producto para cada uno de los vendedores en la tabla que se muestra al final del programa
        // Encabezado de la tabla
        System.out.print("\t\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal\n");
        // Atributo para sumar la venta total
        double ventaTotal;
        for (int i = 0; i < 5; i++) {
            ventaTotal = 0;
            System.out.print("Producto " + (i + 1) + "\t");
            for (int j = 0; j < 4; j++) {
                // Imprimir la venta de vendedor por producto
                System.out.print(vendedores[j].getVentas()[j][i] + "\t\t");
                // Sumar la venta a la venta total
                ventaTotal += vendedores[j].getVentas()[j][i];
            }
            // Imprimir la venta total de cada vendedor
            System.out.print(ventaTotal + "\n");
        }
        // Imprimir el total de ventas por vendedor
        System.out.print("Total\t\t");
        for (int i = 0; i < 4; i++) {
            System.out.print(vendedores[i].getVentaTotal() + "\t\t");
        }
        teclado.close();
    }
}