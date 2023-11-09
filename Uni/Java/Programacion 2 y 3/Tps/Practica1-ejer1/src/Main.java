import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Iniciar scanner para input
        Scanner teclado = new Scanner(System.in);
        // Iniciar un boolean para que termine el programa en falso para que pueda comenzar
        boolean salir = false;
        while (!salir) {
            // Imprimir menu de opciones
            System.out.println("1. Ingresar información sobre un DVD");
            System.out.println("2. Eliminar un DVD conociendo el título");
            System.out.println("3. Modificar los valores de uno o más atributos conociendo el título");
            System.out.println("4. Listar todos los DVD");
            System.out.println("5. Listar los DVD que tengo");
            System.out.println("6. Listar los DVD que duran menos de un tiempo dado en minutos");
            System.out.println("7. Listar los DVD de un determinado director");
            System.out.println("8. Listar todos los DVD ordenados por título");
            System.out.println("9. Informar la cantidad total de DVD");
            System.out.println("10. Informar la cantidad de DVD que tengo");
            System.out.println("11. Salir");

            // Input de la opción elegida
            System.out.print("Ingrese una opción: \n");
            int opcion = teclado.nextInt();
            // Limpiar el buffer de entrada
            teclado.nextLine();

            // Opciones
            switch (opcion) {
                // Ingresar información sobre un DVD
                case 1:
                    System.out.print("Ingrese el título del DVD: ");
                    String titulo = teclado.nextLine();
                    System.out.print("Ingrese el género del DVD: ");
                    String genero = teclado.nextLine();
                    System.out.print("Ingrese el nombre del director: ");
                    String director = teclado.nextLine();
                    System.out.print("Ingrese la duración en minutos del DVD: ");
                    int duracion = teclado.nextInt();
                    // Limpiar el buffer de entrada
                    teclado.nextLine();
                    System.out.print("¿Tiene el DVD? (s/n): ");
                    boolean posesion = teclado.nextLine().equalsIgnoreCase("s");
                    System.out.print("Ingrese un comentario (Excelente, Muy Buena, Buena, Regular, Mala): ");
                    String comentario = teclado.nextLine();
                    // Una vez ingresados los datos en el input se ingresa el nuevo DVD (Creandolo)
                    Coleccion.ingresarDVD(new Dvd(titulo, genero, duracion, posesion, comentario, director));
                    System.out.println("DVD agregado correctamente.\n");
                    break;
                // Eliminar un DVD conociendo el nombre
                case 2:
                    System.out.print("Ingrese el titulo del DVD a eliminar: ");
                    String tituloAEliminar = teclado.nextLine();
                    Coleccion.eliminarDVD(tituloAEliminar);
                    break;
                // Modificar los valores de uno o más atributos conociendo el título
                case 3:
                    System.out.print("Ingrese el título del DVD a modificar: ");
                    String tituloAModificar = teclado.nextLine();
                    Coleccion.modificarDvd(tituloAModificar);
                    break;
                // Listar todos los DVDs
                case 4:
                    Coleccion.listarDvds();
                    break;
                // Listar los DVDs que tengo
                case 5:
                    Coleccion.listarDvdEnPosesion();
                    break;
                // Listar los DVD que duran menos de un tiempo dado en minutos
                case 6:
                    System.out.print("Ingrese el tiempo máximo que debe durar el dvd (En minutos): ");
                    int tiempo = teclado.nextInt();
                    Coleccion.listarPorTiempo(tiempo);
                    break;
                // Listar los DVD de un determinado director
                case 7:
                    System.out.print("Ingrese el nombre del director del que deseas obtener el listado: ");
                    String directorListado = teclado.nextLine();
                    Coleccion.listarPorDirector(directorListado);
                    break;
                // Listar todos los DVD ordenados por título
                case 8:
                    Coleccion.listarDvdsOrdenados();
                    break;
                // Informar la cantidad total de DVDs
                case 9:
                    System.out.println("Cantidad total de DVD: " + Coleccion.coleccion.size() + "\n");
                    break;
                // Informar la cantidad de DVD que tengo en posesion
                case 10:
                    Coleccion.dvdsEnPosesion();
                    break;
                // Salir
                case 11:
                    salir = true;
                    break;
                default:
                    System.out.println();
            }
        }
        // Cerrar teclado
        teclado.close();
    }
}