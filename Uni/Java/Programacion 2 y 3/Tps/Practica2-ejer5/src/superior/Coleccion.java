package superior;

import java.util.ArrayList;
import java.util.Scanner;

// Importar package de hijos
import hijos.Cd;
import hijos.Dvd;

public class Coleccion {
    // CREAR ARRAY LIST PARA LA COLECCIÓN
    private ArrayList <Disco> coleccion;
    public Coleccion() {
        this.coleccion = new ArrayList <> ();
    }

    // INICIAR SCANNER PARA INPUT
    static Scanner teclado = new Scanner(System.in);

    // MENÚ DE OPCIONES
    public void imprimirMenuOpciones() {
        System.out.println("1. Ingresar información sobre un disco");
        System.out.println("2. Eliminar un disco conociendo el título");
        System.out.println("3. Modificar los valores de uno o más atributos del disco conociendo el título");
        System.out.println("4. Listar todos los discos");
        System.out.println("5. Listar los discos que tengo");
        System.out.println("6. Listar los discos que duran menos de un tiempo dado en minutos");
        System.out.println("7. Listar todos los discos ordenados por título");
        System.out.println("8. Informar la cantidad total de discos");
        System.out.println("9. Informar la cantidad de discos que tengo");
        System.out.println("10. Listar los DVD's de un determinado director (EXCLUSIVO DVD)");
        System.out.println("11. Listar los CD's de un determinado interprete (EXCLUSIVO CD)");
        System.out.println("12. Informar la cantidad de temas de un CD según el título (EXCLUSIVO CD)");
        System.out.println("13. Salir");
    }

    // MÉTODOS GENERALES DE LA COLECCIÓN
    // 1) Ingresar CD o DVD
    public void agregarDisco(int opcionIngreso) {
        if (opcionIngreso == 1) {
            // Inputs
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
            coleccion.add(new Dvd(titulo, genero, comentario, duracion, posesion, director));
            System.out.println("DVD agregado correctamente.\n");
        } else if (opcionIngreso == 2) {
            // Inputs
            System.out.print("Ingrese el título del CD: ");
            String titulo = teclado.nextLine();
            System.out.print("Ingrese el género del CD: ");
            String genero = teclado.nextLine();
            System.out.print("Ingrese el nombre del interprete: ");
            String interprete = teclado.nextLine();
            System.out.print("Ingrese la duración del CD: ");
            int duracion = teclado.nextInt();
            System.out.print("Ingrese la cantidad de temas en el CD: ");
            int cantTemas = teclado.nextInt();
            // Limpiar el buffer de entrada
            teclado.nextLine();
            System.out.print("¿Tiene el CD? (s/n): ");
            boolean posesion = teclado.nextLine().equalsIgnoreCase("s");
            System.out.print("Ingrese un comentario (Excelente, Muy Buena, Buena, Regular, Mala): ");
            String comentario = teclado.nextLine();
            // Una vez ingresados los datos en el input se ingresa el nuevo DVD (Creandolo)
            coleccion.add(new Cd(titulo, genero, comentario, duracion, posesion, interprete, cantTemas ));
            System.out.println("CD agregado correctamente.\n");
        } else {
            System.out.println("¡Debe elegir la opción 1 o 2!");
        }
    }
    // 2) Eliminar CD o DVD mediante su título
    public void eliminarDisco(String titulo) {
        // Booleano para indicar si ya fue eliminado (Empieza en falso)
        boolean eliminado = false;
        for (int i = 0; i < coleccion.size(); i++) {
            Disco d = coleccion.get(i);
            if (d.getTitulo().equalsIgnoreCase(titulo)) {
                coleccion.remove(i);
                // Si lo encontró cambiar el booleano a true y salir del for
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            System.out.println("Eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún DVD o CD con el título ingresado.");
        }
    }
    // 3) Modificar disco mediante su título
    public void modificarDisco(String tituloAModificar, int opcionModificar) {
        if (opcionModificar == 1) {
            // Booleano para indicar si ya fue modificado (Empieza en falso)
            boolean modificado = false;
            for (int i = 0; i < coleccion.size(); i++) {
                Disco d = coleccion.get(i);
                if (d.getTitulo().equalsIgnoreCase(tituloAModificar)) {
                    // Inputs
                    System.out.println("Ingresar los datos del DVD:");
                    System.out.print("Ingrese el título del DVD: ");
                    String titulo = teclado.nextLine();
                    System.out.print("Ingrese el género del DVD: ");
                    String genero = teclado.nextLine();
                    System.out.print("Ingrese la duración en minutos del DVD: ");
                    int duracion = teclado.nextInt();
                    teclado.nextLine(); // Limpiar el buffer de entrada
                    System.out.print("¿Tiene el DVD? (s/n): ");
                    boolean posesion = teclado.nextLine().equalsIgnoreCase("s");
                    System.out.print("Ingrese un comentario (Excelente, Muy Buena, Buena, Regular, Mala): ");
                    String comentario = teclado.nextLine();
                    System.out.print("Ingrese el nombre del director: ");
                    String director = teclado.nextLine();
                    // Realizar los cambios
                    d.setTitulo(titulo);
                    d.setGenero(genero);
                    d.setDuracion(duracion);
                    d.setPosesion(posesion);
                    d.setComentario(comentario);
                    ((Dvd) d).setDirector(director);
                    // Si lo encontró y modificó cambiar el booleano a true y salir del for
                    modificado = true;
                    break;
                }
            }
            if (modificado) {
                System.out.println("DVD modificado correctamente.");
            } else {
                System.out.println("No se encontró un DVD con el título ingresado.");
            }
        }
        else if (opcionModificar == 2) {
            boolean modificado = false;
            for (int i = 0; i < coleccion.size(); i++) {
                Disco c = coleccion.get(i);
                if (c.getTitulo().equalsIgnoreCase(tituloAModificar)) {
                    // Inputs
                    System.out.print("Ingrese el título del CD: ");
                    String titulo = teclado.nextLine();
                    System.out.print("Ingrese el género del CD: ");
                    String genero = teclado.nextLine();
                    System.out.print("Ingrese el nombre del interprete: ");
                    String interprete = teclado.nextLine();
                    System.out.print("Ingrese la duración del CD: ");
                    int duracion = teclado.nextInt();
                    System.out.print("Ingrese la cantidad de temas en el CD: ");
                    int cantTemas = teclado.nextInt();
                    // Limpiar el buffer de entrada
                    teclado.nextLine();
                    System.out.print("¿Tiene el CD? (s/n): ");
                    boolean posesion = teclado.nextLine().equalsIgnoreCase("s");
                    System.out.print("Ingrese un comentario (Excelente, Muy Buena, Buena, Regular, Mala): ");
                    String comentario = teclado.nextLine();

                    // Realizar los cambios
                    c.setTitulo(titulo);
                    c.setGenero(genero);
                    c.setDuracion(duracion);
                    c.setPosesion(posesion);
                    c.setComentario(comentario);
                    ((Cd) c).setInterprete(interprete);
                    ((Cd) c).setCantTemas(cantTemas);
                    modificado = true;
                    break;
                }
            }
            if (modificado) {
                System.out.println("CD modificado correctamente.");
            } else {
                System.out.println("No se encontró un CD con el título ingresado.");
            }
        }
        else {
            System.out.println("¡Debe elegir la opción 1 o 2!");
        }

    }
    // 4) Listar todos los discos
    public void listarDiscos() {
        System.out.println("Lista de los discos: ");
        for (int i = 0; i < coleccion.size(); i++) {
            Disco d = coleccion.get(i);
            System.out.println(d);
        }
        System.out.println("\n");
    }
    // 5) Listar todos los discos en posesión
    public void listarDiscosEnPosesion() {
        System.out.println("Lista de los discos que tengo: \n");
        for (int i = 0; i< coleccion.size(); i++) {
            Disco d = coleccion.get(i);
            if (d.isPosesion() == true) {
                System.out.println(d);
            }
        }
        System.out.println("\n");
    }
    // 6) Listar todos los discos que duren menos tiempo que el parámetro
    public void listarDiscosPorTiempo(int tiempo) {
        System.out.println("Lista de los DVD's que tengo menores a " + tiempo + " minutos: \n");
        for (int i = 0; i< coleccion.size(); i++) {
            Disco d = coleccion.get(i);
            if (d.getDuracion() < tiempo) {
                System.out.println(d);
            }
        }
        System.out.println("\n");
    }
    // 7) Listar todos los discos ordenados por título
    public void listarDiscosOrdenados() {
        // Copiar la colección para no modificar el orden original
        ArrayList<Disco> copiaColeccion = new ArrayList<>(coleccion);
        int n = copiaColeccion.size();
        // Ordenar la lista
        boolean intercambio = true;
        while (intercambio) {
            // Comenzar con intercambio = false y cambiar a true si se realiza un intercambio
            intercambio = false;
            // Iterar comparando 2 elementos seguidos
            for (int i = 0; i < n - 1; i++) {
                // Obtener los elementos
                Disco actual = copiaColeccion.get(i);
                Disco siguiente = copiaColeccion.get(i + 1);
                // Si el título del elemento actual es mayor que el título del siguiente elemento (ignorando mayúsculas y minúsculas)
                if (actual.getTitulo().compareToIgnoreCase(siguiente.getTitulo()) > 0) {
                    // Intercambiar los elementos
                    copiaColeccion.set(i, siguiente);
                    copiaColeccion.set(i + 1, actual);
                    // Establecer intercambio = true para indicar que se ha realizado un intercambio
                    intercambio = true;
                }
            }
            // Reducir el tamaño de la lista en una unidad en cada iteración (Para no comparar al elemento más grande que se fue al final de la lista)
            n--;
        }
        // Imprimir la lista ordenada
        System.out.println("Lista de DVDs ordenados por título:");
        for (Disco d : copiaColeccion) {
            // Para cada DVD en la copia ordenada de la colección:
            // Imprimir el DVD en la consola
            System.out.println(d);
        }
        // Imprimir una línea en blanco para separar la salida de la lista de DVDs de otros mensajes
        System.out.println();
    }
    // 8) Informar cantidad total
    public void informarTotal() {
        System.out.println("La cantidad total de discos es de: " + coleccion.size() + " discos.");
    }
    // 9) Informar cantidad de discos en posesión
    public void discosEnPosesion() {
        // Crear una nuevo array list donde se van a agregar todos los dvds que posea
        ArrayList<Disco> discosEnPosesion = new ArrayList<>();
        // Fijarse en la coleccion cuales poseo
        for (int i = 0; i< coleccion.size(); i++) {
            Disco d = coleccion.get(i);
            // Si lo poseo agregar a el array list
            if (d.isPosesion() == true) {
                discosEnPosesion.add(d);
            }
        }
        // Imprimir la cantidad total
        System.out.println("Cantidad total de DVD que poseo: " + discosEnPosesion.size());
    }

    // MÉTODOS PROPIOS DE DVD
    // 10) Listar DVD´s por director
    public void listarDvdsPorDirector(String director) {
        System.out.println("Lista de los DVD's que tengo del director '" + director + "':");
        for (int i = 0; i< coleccion.size(); i++) {
            Dvd d = (Dvd) coleccion.get(i);
            if (d.getDirector().equals(director)) {
                System.out.println(d);
            }
        }
        System.out.println("\n");
    }

    // MÉTODOS PROPIOS DE CD
    // 11) Método para listar los CD's por interprete
    public void listarCdsPorInterprete(String interprete) {
        System.out.println("Lista de los CD's que tengo del interprete '" + interprete + "'");
        for (int i = 0; i< coleccion.size(); i++) {
            Cd cd = (Cd) coleccion.get(i);
            if (cd.getInterprete().equals(interprete)) {
                System.out.println(cd);
            }
        }
        System.out.println("\n");
    }
    // 12) Método para devolver la cantidad de temas de un CD
    public void cantTemasCd(String titulo){
        // Inicializar variable en 0 para luego asignarle la cantidad de temas si se encuentra
        int cantTemas = 0;
        for (int i = 0; i < coleccion.size(); i++) {
            Cd cd = (Cd) coleccion.get(i);
            if (cd.getTitulo().equalsIgnoreCase(titulo)) {
                cantTemas = cd.getCantTemas();
            }
        }
        if (cantTemas == 0) {
            System.out.println("¡No se encontró el CD que estás buscando, o el CD no tiene temas!");
        }
        System.out.println("La cantidad de temas del CD '" + titulo + "' es: " + cantTemas + " temas.");
    }
}