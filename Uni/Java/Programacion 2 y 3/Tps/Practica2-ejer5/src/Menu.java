import java.util.Scanner;
import superior.Coleccion;
public class Menu {
    public Menu(){
    }
    public void nuevoMenu(){
        // Instanciar coleccion
        Coleccion coleccion = new Coleccion();
        // Iniciar scanner para input
        Scanner teclado = new Scanner(System.in);
        // Iniciar un boolean para que termine el programa en falso para que pueda comenzar
        boolean salir = false;
        while (!salir) {
            // Imprimir menu de opciones
            coleccion.imprimirMenuOpciones();
            // Input de la opción elegida
            System.out.print("Ingrese una opción: \n");
            int opcion = teclado.nextInt();
            // Limpiar el buffer de entrada
            teclado.nextLine();

            // Opciones
            switch (opcion) {
                // Ingresar información sobre un disco
                case 1:
                    System.out.print("Ingrese una opción: \n1- Ingresar DVD\n2- Ingresar CD \n");
                    int opcionIngreso = teclado.nextInt();
                    coleccion.agregarDisco(opcionIngreso);
                    break;
                // Eliminar un disco conociendo el nombre
                case 2:
                    System.out.print("Ingrese el titulo del disco a eliminar: ");
                    String tituloAEliminar = teclado.nextLine();
                    coleccion.eliminarDisco(tituloAEliminar);
                    break;
                // Modificar los valores de uno o más atributos del disco conociendo el título
                case 3:
                    System.out.print("Ingrese una opción \n1- Modificar DVD\n2- Modificar CD \n");
                    int opcionModificar = teclado.nextInt();
                    // Limpiar el buffer de entrada
                    teclado.nextLine();
                    System.out.print("Ingrese el título del disco a modificar: ");
                    String tituloAModificar = teclado.nextLine();
                    coleccion.modificarDisco(tituloAModificar, opcionModificar);
                    break;
                // Listar todos los Discos
                case 4:
                    coleccion.listarDiscos();
                    break;
                // Listar los Discos que tengo
                case 5:
                    coleccion.listarDiscosEnPosesion();
                    break;
                // Listar los discos que duran menos de un tiempo dado en minutos
                case 6:
                    System.out.print("Ingrese el tiempo máximo que debe durar el dvd (En minutos): ");
                    int tiempo = teclado.nextInt();
                    coleccion.listarDiscosPorTiempo(tiempo);
                    break;
                // Listar todos los Discos ordenados por título
                case 7:
                    coleccion.listarDiscosOrdenados();
                    break;
                // Informar la cantidad total de DVDs
                case 8:
                    coleccion.informarTotal();
                    break;
                // Informar la cantidad de DVD que tengo en posesion
                case 9:
                    coleccion.discosEnPosesion();
                    break;
                // Listar los discos de un determinado director (Exclusivo Dvd's)
                case 10:
                    System.out.print("Ingrese el nombre del director del que deseas obtener el listado: ");
                    String directorListado = teclado.nextLine();
                    coleccion.listarDvdsPorDirector(directorListado);
                    break;
                // Listar CD's de un determinado interprete
                case 11:
                    System.out.print("Ingrese el nombre del interprete del que deseas obtener el listado: ");
                    String interprete = teclado.nextLine();
                    coleccion.listarCdsPorInterprete(interprete);
                    break;
                // Informar la cantidad de temas de un CD según el título (EXCLUSIVO CD)
                case 12:
                    System.out.print("Ingrese el título del CD del que deseas obtener el listado: ");
                    String tituloParaCantTemas = teclado.nextLine();
                    coleccion.cantTemasCd(tituloParaCantTemas);
                    break;
                // Salir
                case 13:
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
