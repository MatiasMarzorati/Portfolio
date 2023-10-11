import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila estacionamiento = new Pila(50);
        double recaudacion = 0;

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Llegada de un auto");
            System.out.println("2. Salida de un auto");
            System.out.println("3. Mostrar recaudación y salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consumir la línea en blanco
                    System.out.println("Ingrese la matrícula del auto que llega:");
                    String matricula = scanner.nextLine();
                    Auto nuevoAuto = new Auto(matricula);
                    estacionamiento.apilar(nuevoAuto);
                    System.out.println("Auto estacionado con éxito.");
                    break;
                case 2:
                    Auto autoSalida = estacionamiento.desapilar();
                    if (autoSalida != null) {
                        System.out.println("Auto con matrícula " + autoSalida.obtenerMatricula() + " ha salido.");
                        recaudacion += 5; // Se cobra $5 por auto
                    } else {
                        System.out.println("No hay autos en el estacionamiento.");
                    }
                    break;
                case 3:
                    System.out.println("Recaudación total del día: $" + recaudacion);
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}