import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciar coleccion
        Coleccion coleccion = new Coleccion();
        // Iniciar scanner para input
        Scanner teclado = new Scanner(System.in);
        // Iniciar un boolean para que termine el programa en falso para que pueda comenzar
        boolean salir = false;
        while (!salir) {
            System.out.println("Elegir un menú: \n1- Menú de DVD's \n2- Menú de CD's:\n3- Salir");
            int opcion = teclado.nextInt();
            // Limpiar el buffer de entrada
            teclado.nextLine();
            if (opcion == 1) {
                // Imprimir menu de opciones
                coleccion.imprimirMenuDvd();
                // Input de la opción elegida
                System.out.print("Ingrese una opción: \n");
                int opcionDvd = teclado.nextInt();
                // Limpiar el buffer de entrada
                teclado.nextLine();
                // Opciones
                switch (opcionDvd) {
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
                        coleccion.ingresarDVD(new Dvd(titulo, genero, duracion, posesion, comentario, director));
                        System.out.println("DVD agregado correctamente.\n");
                        break;
                    // Eliminar un DVD conociendo el nombre
                    case 2:
                        System.out.print("Ingrese el titulo del DVD a eliminar: ");
                        String tituloAEliminar = teclado.nextLine();
                        coleccion.eliminarDVD(tituloAEliminar);
                        break;
                    // Modificar los valores de uno o más atributos conociendo el título
                    case 3:
                        System.out.print("Ingrese el título del DVD a modificar: ");
                        String tituloAModificar = teclado.nextLine();
                        coleccion.modificarDvd(tituloAModificar);
                        break;
                    // Listar todos los DVDs
                    case 4:
                        coleccion.listarDvds();
                        break;
                    // Listar los DVDs que tengo
                    case 5:
                        coleccion.listarDvdsEnPosesion();
                        break;
                    // Listar los DVD que duran menos de un tiempo dado en minutos
                    case 6:
                        System.out.print("Ingrese el tiempo máximo que debe durar el dvd (En minutos): ");
                        int tiempo = teclado.nextInt();
                        coleccion.listarDvdsPorTiempo(tiempo);
                        break;
                    // Listar los DVD de un determinado director
                    case 7:
                        System.out.print("Ingrese el nombre del director del que deseas obtener el listado: ");
                        String directorListado = teclado.nextLine();
                        coleccion.listarDvdsPorDirector(directorListado);
                        break;
                    // Listar todos los DVD ordenados por título
                    case 8:
                        coleccion.listarDvdsOrdenados();
                        break;
                    // Informar la cantidad total de DVDs
                    case 9:
                        System.out.println("Cantidad total de DVD: " + coleccion.coleccionDvd.size() + "\n");
                        break;
                    // Informar la cantidad de DVD que tengo en posesion
                    case 10:
                        coleccion.dvdsEnPosesion();
                        break;
                    // Salir
                    case 11:
                        salir = true;
                        break;
                    default:
                        System.out.println();
                }
            }
            else if (opcion == 2) {
                // Imprimir menu de opciones
                coleccion.imprimirMenuCd();
                // Input de la opción elegida
                System.out.print("Ingrese una opción: \n");
                int opcionCd = teclado.nextInt();
                // Limpiar el buffer de entrada
                teclado.nextLine();

                // Opciones
                switch (opcionCd) {
                    // Ingresar información sobre un CD
                    case 1:
                        System.out.print("Ingrese el título del CD: ");
                        String titulo = teclado.nextLine();
                        System.out.print("Ingrese el género del CD: ");
                        String genero = teclado.nextLine();
                        System.out.print("Ingrese el nombre del interprete: ");
                        String interprete = teclado.nextLine();
                        System.out.print("Ingrese la duración del CD: ");
                        double duracion = teclado.nextDouble();
                        System.out.print("Ingrese la cantidad de temas en el CD: ");
                        int cantTemas = teclado.nextInt();
                        // Limpiar el buffer de entrada
                        teclado.nextLine();
                        System.out.print("¿Tiene el CD? (s/n): ");
                        boolean posesion = teclado.nextLine().equalsIgnoreCase("s");
                        System.out.print("Ingrese un comentario (Excelente, Muy Buena, Buena, Regular, Mala): ");
                        String comentario = teclado.nextLine();
                        // Una vez ingresados los datos en el input se ingresa el nuevo DVD (Creandolo)
                        coleccion.ingresarCd(new Cd(titulo, interprete, comentario, genero, cantTemas, duracion, posesion));
                        System.out.println("CD agregado correctamente.\n");
                        break;
                    // Eliminar un DVD conociendo el nombre
                    case 2:
                        System.out.print("Ingrese el titulo del CD a eliminar: ");
                        String tituloAEliminar = teclado.nextLine();
                        coleccion.eliminarCd(tituloAEliminar);
                        break;
                    // Modificar los valores de uno o más atributos conociendo el título
                    case 3:
                        System.out.print("Ingrese el título del DVD a modificar: ");
                        String tituloAModificar = teclado.nextLine();
                        coleccion.modificarCd(tituloAModificar);
                        break;
                    // Listar todos los CD
                    case 4:
                        coleccion.listarCds();
                        break;
                    // Listar los CD's que tengo
                    case 5:
                        coleccion.listarCdsEnPosesion();
                        break;
                    // Listar los CD que duran menos de un tiempo dado en minutos
                    case 6:
                        System.out.print("Ingrese el tiempo máximo que debe durar el cd (En minutos): ");
                        int tiempo = teclado.nextInt();
                        coleccion.listarCdsPorTiempo(tiempo);
                        break;
                    // Listar los DVD de un determinado director
                    case 7:
                        System.out.print("Ingrese el nombre del director del que deseas obtener el listado: ");
                        String directorListado = teclado.nextLine();
                        coleccion.listarCdsPorInterprete(directorListado);
                        break;
                    // Listar todos los DVD ordenados por título
                    case 8:
                        coleccion.listarCdsOrdenados();
                        break;
                    // Informar la cantidad total de DVDs
                    case 9:
                        System.out.println("Cantidad total de CD's: " + coleccion.coleccionCd.size() + "\n");
                        break;
                    // Informar la cantidad de DVD que tengo en posesion
                    case 10:
                        coleccion.cdsEnPosesion();
                        break;
                    // Informar la cantidad de temas en un CD
                    case 11:
                        System.out.print("Ingrese el título del CD para obtener la cantidad de temas: ");
                        String tituloParaTemas = teclado.nextLine();
                        if (coleccion.cantTemasCd(tituloParaTemas) == 0){
                            System.out.print("\n");
                            break;
                        }
                        else {
                            System.out.println("La cantidad de temas en el cd es: " + coleccion.cantTemasCd(tituloParaTemas) + "\n");
                            break;
                        }
                        // Salir
                    case 12:
                        salir = true;
                        break;
                    default:
                        System.out.println();
                }
            }
            else if (opcion == 3) {
                break;
            }
            else {
                System.out.println("¡Elegir opción 1 o 2!");
            }
        }
        // Cerrar teclado
        teclado.close();
    }
}