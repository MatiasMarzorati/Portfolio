import java.util.Scanner;

import superior.Coleccion;
import superior.ColeccionCd;
import superior.ColeccionDvd;

public class Menu {
    public Menu(){
        nuevoMenu();
    }
    // Iniciar scanner para input
    Scanner teclado = new Scanner(System.in);
    // Método que devuelve una opción de ingreso
    public int elegirOpcion(){
        System.out.print("Ingrese una opción: \n1- DVD\n2- CD \n");
        return teclado.nextInt();
    }
    // Método del menu de opciones
    public void nuevoMenu(){
        // Instanciar coleccion
        Coleccion coleccionDvd = new ColeccionDvd();
        Coleccion coleccionCd = new ColeccionCd();

        // Iniciar un boolean para que termine el programa en falso para que pueda comenzar
        boolean salir = false;
        while (!salir) {
            // Imprimir menu de opciones
            Coleccion.imprimirMenuOpciones();
            // Input de la opción elegida
            System.out.print("Ingrese una opción: \n");
            int opcion = teclado.nextInt();
            // Limpiar el buffer de entrada
            teclado.nextLine();

            // Opciones
            switch (opcion) {
                // Ingresar información sobre un disco
                case 1:
                    System.out.println("AGREGAR UN DISCO");
                    int opcionIngreso = elegirOpcion();
                    if (opcionIngreso == 1){
                        coleccionDvd.agregarDisco();
                    }
                    else if (opcionIngreso == 2){
                        coleccionCd.agregarDisco();
                    }
                    else {
                        System.out.println("Ingrese una opción valida.");
                    }
                    break;
                // Eliminar un disco conociendo el nombre
                case 2:
                    System.out.println("ELIMINAR UN DISCO");
                    int opcionAEliminar = elegirOpcion();
                    // Limpiar el buffer de entrada
                    teclado.nextLine();
                    System.out.print("Ingrese el titulo del disco a eliminar: ");
                    String tituloAEliminar = teclado.nextLine();
                    if (opcionAEliminar == 1){
                        coleccionDvd.eliminarDisco(tituloAEliminar);
                        break;
                    }
                    else if (opcionAEliminar == 2){
                        coleccionCd.eliminarDisco(tituloAEliminar);
                        break;
                    }
                    else {
                        System.out.println("Ingrese una opción valida.");
                    }
                    break;
                // Modificar los valores de uno o más atributos del disco conociendo el título
                case 3:
                    System.out.println("MODIFICAR UN DISCO");
                    int opcionModificar = elegirOpcion();
                    // Limpiar el buffer de entrada
                    teclado.nextLine();
                    System.out.print("Ingrese el título del disco a modificar: ");
                    String tituloAModificar = teclado.nextLine();
                    if (opcionModificar == 1){
                        coleccionDvd.modificarDisco(tituloAModificar);
                    }
                    else if (opcionModificar == 2){
                        coleccionCd.modificarDisco(tituloAModificar);
                    }
                    else {
                        System.out.println("Ingrese una opción valida.");
                    }
                    break;
                // Listar todos los Discos
                case 4:
                    System.out.println("LISTAR TODOS LOS DISCOS");
                    coleccionDvd.listarDiscos();
                    coleccionCd.listarDiscos();
                    break;
                // Listar los Discos que tengo
                case 5:
                    System.out.println("LISTAR TODOS LOS DISCOS EN POSESION");
                    int opcionAListarPosesion = elegirOpcion();
                    if (opcionAListarPosesion == 1){
                        System.out.println("DVD's EN POSESION");
                        coleccionDvd.listarDiscosEnPosesion();
                    }
                    else if (opcionAListarPosesion == 2){
                        System.out.println("CD´s EN POSESION");
                        coleccionCd.listarDiscosEnPosesion();
                    }
                    else {
                        System.out.println("Ingrese una opción valida.");
                    }
                    break;
                // Listar los discos que duran menos de un tiempo dado en minutos
                case 6:
                    System.out.println("LISTAR TODOS LOS DISCOS QUE DUREN MENOS DE UN DETERMINADO TIEMPO");
                    int opcionAListarPorTiempo = elegirOpcion();
                    System.out.print("Ingrese el tiempo máximo que debe durar el dvd (En minutos): ");
                    int tiempo = teclado.nextInt();
                    if (opcionAListarPorTiempo == 1){
                        System.out.println("DVD's QUE DURAN MENOS DE " + tiempo + " MINUTOS:");
                        coleccionDvd.listarDiscosPorTiempo(tiempo);
                    }
                    else if (opcionAListarPorTiempo == 2){
                        System.out.println("CD's QUE DURAN MENOS DE " + tiempo + " MINUTOS:");
                        coleccionCd.listarDiscosPorTiempo(tiempo);
                    }
                    else {
                        System.out.println("Ingrese una opción valida.");
                    }
                    break;
                // Listar todos los Discos ordenados por título
                case 7:
                    System.out.println("LISTAR DISCOS ORDENADOS POR TÍTULO");
                    int opcionAListarPorTitulo = elegirOpcion();
                    if (opcionAListarPorTitulo == 1){
                        System.out.println("DVD's ORDENADOS POR TÍTULO");
                        coleccionDvd.listarDiscosOrdenados();
                    }
                    else if (opcionAListarPorTitulo == 2){
                        System.out.println("CD's ORDENADOS POR TÍTULO");
                        coleccionCd.listarDiscosOrdenados();
                    }
                    else {
                        System.out.println("Ingrese una opción valida.");
                    }
                    break;
                // Informar la cantidad total de Discos
                case 8:
                    System.out.println("INFORME DE CANTIDAD TOTAL DE DISCOS");
                    System.out.println("LA CANTIDAD TOTAL ES DE " +
                    (coleccionCd.obtenerTotal() + coleccionDvd.obtenerTotal()) + " DISCOS\n");
                    break;
                // Informar la cantidad de DVD que tengo en posesion
                case 9:
                    System.out.println("INFORME DE CANTIDAD TOTAL DE DISCOS EN POSESION");
                    System.out.println("LA CANTIDAD TOTAL DE DISCOS EN POSESION ES DE " +
                            (coleccionCd.discosEnPosesion() + coleccionDvd.discosEnPosesion()) + " DISCOS\n");
                    break;
                // Listar los discos de un determinado director (Exclusivo Dvd's)
                case 10:
                    System.out.println("INFORME DE DVD's DE UN DIRECTOR EN PARTICULAR");
                    System.out.print("Ingrese el nombre del director del que deseas obtener el listado: ");
                    String directorListado = teclado.nextLine();
                    ((ColeccionDvd) coleccionDvd).listarDiscoPorDirectorOInterprete(directorListado);
                    break;
                // Listar CD's de un determinado interprete
                case 11:
                    System.out.println("INFORME DE CD'S DE UN INTERPRETE EN PARTICULAR");
                    System.out.print("Ingrese el nombre del interprete del que deseas obtener el listado: ");
                    String interprete = teclado.nextLine();
                    ((ColeccionCd) coleccionCd).listarDiscoPorDirectorOInterprete(interprete);
                    break;
                // Informar la cantidad de temas de un CD según el título (EXCLUSIVO CD)
                case 12:
                    System.out.println("LISTADO DE TEMAS DE UN CD");
                    System.out.print("Ingrese el título del CD del que deseas obtener el listado: ");
                    String tituloParaCantTemas = teclado.nextLine();

                    System.out.println("LA CANTIDAD DE TEMAS DEL CD '" + tituloParaCantTemas + "' ES: "
                            + coleccionCd.obtenerCantidadCd(tituloParaCantTemas) + " TEMAS.\n");
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