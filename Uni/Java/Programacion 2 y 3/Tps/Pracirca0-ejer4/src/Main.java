import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Definimos el array que contiene los valores de los artículos vendidos
        double[] valores = {7239.99, 9129.75, 6899.95, 13150.89};
        double totalVentas = 0;

        // Imprimir catálogo
        System.out.println("CATÁLOGO: \nArticulo 1: $7239.99; Articulo 2: 9129.75; Articulo 3: 6899.95; Articulo 4: $13150.89\n");

        // Pedir articulos por día de la semana
        for (int i = 1; i <= 7; i++) {
            System.out.println("Día " + i + ":");
            // Solicitamos al usuario que ingrese la cantidad de artículos vendidos durante la última semana
            System.out.println("Ingrese el número de artículos vendidos en el día: ");
            int cantidadArticulos = teclado.nextInt();
            // Pedir al usuario que ingrese el valor de cada artículo vendido y sumarlo al total de ventas
            for (int j = 0; j < cantidadArticulos; j++) {
                System.out.println("Ingrese el numero del artículo " + (j+1) + ": ");
                int articulo = teclado.nextInt();
                double valorArticulo = valores[articulo - 1];
                totalVentas += valorArticulo;
            }
        }

        // Calculamos la comisión y el salario total del vendedor
        double comision =  totalVentas * 0.06;
        double salarioTotal = 2000 + comision;

        // Mostramos el salario total en la consola
        System.out.println("EL total de ventas es: $" + totalVentas + ". \nEl salario total del vendedor es: $" + salarioTotal);

        // Cerrar el teclado
        teclado.close();
    }
}