import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        // Input
        // Función para el input del teclado
        Scanner teclado = new Scanner(System.in);

        // Ingresar día
        System.out.println("Ingresar día: ");
        int ndia = teclado.nextInt();
        // Ingresar mes
        System.out.println("Ingresar el número de mes: ");
        int nmes = teclado.nextInt();
        // Ingresar año
        System.out.println("Ingresar el año: ");
        int nanio = teclado.nextInt();

        // Cerrar el teclado
        teclado.close();

        // Cargar fecha
        Fecha f1 = new Fecha(ndia, nmes, nanio);
        // Cargar a la funcíon la fecha para imprimirla
        f1.mostrarFecha();
    }
}
