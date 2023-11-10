import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    // Iniciar scanner para input
    static Scanner teclado = new Scanner(System.in);

    // Crear el array list con los DVD's (El array sería la colección de DVD's)
    public static ArrayList <Dvd> coleccion = new ArrayList <> ();

    // 1) Método para agregar DVD's
    public static void ingresarDVD(Dvd a) {
        coleccion.add(a);
    }

    // 2) Método para eliminar un DVD (El int i es la posición en la cual se encuentra el dvd)
    public static void eliminarDVD(String titulo) {
        boolean eliminado = false;
        for (int i = 0; i < coleccion.size(); i++) {
            Dvd dvd = coleccion.get(i);
            if (dvd.getTitulo().equalsIgnoreCase(titulo)) {
                coleccion.remove(i);
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            System.out.println("DVD eliminado correctamente.\n");
        } else {
            System.out.println("No se encontró un DVD con el título ingresado.\n");
        }
    }

    // 3) Método para modificar los DVDs a partir del nombre
    public static void modificarDvd(String nombre) {
        boolean modificado = false;
        for (int i = 0; i < coleccion.size(); i++) {
            Dvd dvd = coleccion.get(i);
            if (dvd.getTitulo().equalsIgnoreCase(nombre)) {
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
                dvd.setTitulo(titulo);
                dvd.setGenero(genero);
                dvd.setDuracion(duracion);
                dvd.setPosesion(posesion);
                dvd.setComentario(comentario);
                dvd.setDirector(director);
                System.out.println("DVD modificado correctamente.\n");
                modificado = true;
                break;
            }
        }
        if (modificado) {
            System.out.println("DVD modificado correctamente.\n");
        } else {
            System.out.println("No se encontró un DVD con el título ingresado.\n");
        }
    }

    // 4) Método para listar todos los DVD's
    public static void listarDvds() {
        System.out.println("Lista de los DVD's que tengo: \n");
        for (int i = 0; i < coleccion.size(); i++) {
            Dvd dvd = coleccion.get(i);
            System.out.println(dvd);
        }
        System.out.println("\n");
    }

    // 5) Método para listar todos los DVD´s que tengo
    public static void listarDvdEnPosesion() {
        System.out.println("Lista de los DVD's que tengo: \n_____________________________");
        for (int i = 0; i< coleccion.size(); i++) {
            Dvd dvd = coleccion.get(i);
            if (dvd.isPosesion() == true) {
                System.out.println(dvd);
            }
        }
        System.out.println("\n");
    }

    // 6) Método para listar por tiempo
    public static void listarPorTiempo(int tiempo) {
        System.out.println("Lista de los DVD's que tengo menores a " + tiempo + " minutos:\n_____________________________");
        for (int i = 0; i< coleccion.size(); i++) {
            Dvd dvd = coleccion.get(i);
            if (dvd.getDuracion() < tiempo) {
                System.out.println(dvd);
            }
        }
        System.out.println("\n");
    }

    // 7) Método para listar según director
    public static void listarPorDirector(String director) {
        System.out.println("Lista de los DVD's que tengo del director '" + director + "' \n_____________________________");
        for (int i = 0; i< coleccion.size(); i++) {
            Dvd dvd = coleccion.get(i);
            if (dvd.getDirector().equals(director)) {
                System.out.println(dvd);
            }
        }
        System.out.println("\n");
    }

    // 8) Método para listar todos los DVD's ordenados
    public static void listarDvdsOrdenados() {
        // Copiar la colección para no modificar el orden original
        ArrayList<Dvd> copiaColeccion = new ArrayList<>(coleccion);
        int n = copiaColeccion.size();

        // Ordenar la lista
        boolean intercambio = true;
        while (intercambio) {
            // Comenzar con intercambio = false y cambiar a true si se realiza un intercambio
            intercambio = false;
            // Iterar comparando 2 elementos seguidos
            for (int i = 0; i < n - 1; i++) {
                // Obtener los elementos
                Dvd actual = copiaColeccion.get(i);
                Dvd siguiente = copiaColeccion.get(i + 1);
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
        for (Dvd dvd : copiaColeccion) {
            // Para cada DVD en la copia ordenada de la colección:
            // Imprimir el DVD en la consola
            System.out.println(dvd);
        }
        // Imprimir una línea en blanco para separar la salida de la lista de DVDs de otros mensajes
        System.out.println();
    }

    // 10) Método para decir la cantidad de DVDs en posesion
    public static void dvdsEnPosesion() {
        // Crear una nuevo array list donde se van a agregar todos los dvds que posea
        ArrayList<Dvd> dvdQueTengo = new ArrayList<>();
        // Fijarse en la coleccion cuales poseo
        for (int i = 0; i< coleccion.size(); i++) {
            Dvd dvd = coleccion.get(i);
            // Si lo poseo agregar a el array list
            if (dvd.isPosesion() == true) {
                dvdQueTengo.add(dvd);
            }
        }
        // Imprimir la cantidad total
        System.out.println("Cantidad total de DVD que poseo: " + dvdQueTengo.size());
    }

}