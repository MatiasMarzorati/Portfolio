import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        // Input
        // Función para el input del teclado
        Scanner teclado = new Scanner(System.in);

        // Input número factura
        System.out.println("Ingresar número de la factura: ");
        int nFactura = teclado.nextInt();
        // Input número artículo
        System.out.println("Ingresar el número del artículo: ");
        int nArticulo = teclado.nextInt();
        // Consumimos el carácter de nueva línea en el buffer (Para poder ingresar un string que contenga palabras unidas con espacios)
        teclado.nextLine();
        // Input descripción artículo
        System.out.println("Ingresar descripción del artículo: ");
        String dArticulo = teclado.nextLine();
        // Input cant artículo
        System.out.println("Ingresar la cantidad de artículos: ");
        int cArticulo = teclado.nextInt();
        // Input precio artículo
        System.out.println("Ingresar el precio del articulo: ");
        float pArticulo = teclado.nextFloat();

        // Cerrar el teclado
        teclado.close();

        // Condicionales
        // Si la cant no es positiva entonces dejarla en 0
        if (cArticulo < 0) {
            cArticulo = 0;
        }
        // Si el precio del articulo no es positivo entonces dejarla en 0
        if (pArticulo < 0) {
            pArticulo = 0;
        }

        // Hacer la factura
        Factura f1 = new Factura(nFactura, nArticulo, dArticulo, cArticulo, pArticulo);
        // Imprimir la factura
        System.out.println("NUMERO FACTURA: " + f1.getNumeroFactura() + ", NUMERO ARTICULO: " + f1.getNumeroArticulo());
        System.out.println("DESCRIPCIÓN DEL ARTICULO: " + f1.getDescripcionArticulo());
        System.out.println("CANTIDAD DE ARTICULOS: " + f1.getCantArticulo()+ ", PRECIO DEL ARTICULO: $" + f1.getPrecioArticulo());
        // Función para el precio Final
        Factura.obtenerMontoFactura(cArticulo, pArticulo);
    }
}
