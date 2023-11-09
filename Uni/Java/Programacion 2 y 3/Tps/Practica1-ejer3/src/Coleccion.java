import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    // CREAR ARRAY LIST PARA LA COLECCIÓN
    public ArrayList <Dvd> coleccionDvd;
    public ArrayList <Cd> coleccionCd;
    public Coleccion() {
        this.coleccionDvd = new ArrayList <> ();
        this.coleccionCd = new ArrayList <> ();
    }
    // Iniciar scanner para input
    static Scanner teclado = new Scanner(System.in);

    // Funciones para imprimir menu de opciones
    public void imprimirMenuDvd() {
        System.out.println("1. Ingresar información sobre un DVD");
        System.out.println("2. Eliminar un DVD conociendo el título");
        System.out.println("3. Modificar los valores de uno o más atributos del DVD conociendo el título");
        System.out.println("4. Listar todos los DVD's");
        System.out.println("5. Listar los DVD's que tengo");
        System.out.println("6. Listar los DVD's que duran menos de un tiempo dado en minutos");
        System.out.println("7. Listar los DVD's de un determinado director");
        System.out.println("8. Listar todos los DVD's ordenados por título");
        System.out.println("9. Informar la cantidad total de DVD's");
        System.out.println("10. Informar la cantidad de DVD's que tengo");
        System.out.println("11. Salir");
    }
    public void imprimirMenuCd() {
        System.out.println("1. Ingresar información sobre un CD");
        System.out.println("2. Eliminar un CD conociendo el título");
        System.out.println("3. Modificar los valores de uno o más atributos del CD conociendo el título");
        System.out.println("4. Listar todos los CD's");
        System.out.println("5. Listar los CD's que tengo");
        System.out.println("6. Listar los CD's que duran menos de un tiempo dado en minutos");
        System.out.println("7. Listar los CD's de un determinado interprete");
        System.out.println("8. Listar todos los CD's ordenados por título");
        System.out.println("9. Informar la cantidad total de CD's");
        System.out.println("10. Informar la cantidad de CD's que tengo");
        System.out.println("11. Informar la cantidad de temas de un CD según el título");
        System.out.println("12. Salir");
    }

    // METODOS DE DVD's
    // 1) Método para agregar DVD's
    public void ingresarDVD(Dvd a) {
        coleccionDvd.add(a);
    }
    // 2) Método para eliminar un DVD (El int i es la posición en la cual se encuentra el dvd)
    public void eliminarDVD(String titulo) {
        boolean eliminado = false;
        for (int i = 0; i < coleccionDvd.size(); i++) {
            Dvd dvd = coleccionDvd.get(i);
            if (dvd.getTitulo().equalsIgnoreCase(titulo)) {
                coleccionDvd.remove(i);
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
    public void modificarDvd(String nombre) {
        boolean modificado = false;
        for (int i = 0; i < coleccionDvd.size(); i++) {
            Dvd dvd = coleccionDvd.get(i);
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
    public void listarDvds() {
        System.out.println("Lista de los DVD's que tengo: \n");
        for (int i = 0; i < coleccionDvd.size(); i++) {
            Dvd dvd = coleccionDvd.get(i);
            System.out.println(dvd);
        }
        System.out.println("\n");
    }
    // 5) Método para listar todos los DVD´s que tengo
    public void listarDvdsEnPosesion() {
        System.out.println("Lista de los DVD's que tengo: \n");
        for (int i = 0; i< coleccionDvd.size(); i++) {
            Dvd dvd = coleccionDvd.get(i);
            if (dvd.isPosesion() == true) {
                System.out.println(dvd);
            }
        }
        System.out.println("\n");
    }
    // 6) Método para listar por tiempo
    public void listarDvdsPorTiempo(int tiempo) {
        System.out.println("Lista de los DVD's que tengo menores a " + tiempo + " minutos: \n");
        for (int i = 0; i< coleccionDvd.size(); i++) {
            Dvd dvd = coleccionDvd.get(i);
            if (dvd.getDuracion() < tiempo) {
                System.out.println(dvd);
            }
        }
        System.out.println("\n");
    }
    // 7) Método para listar según director
    public void listarDvdsPorDirector(String director) {
        System.out.println("Lista de los DVD's que tengo del director '" + director + "'");
        for (int i = 0; i< coleccionDvd.size(); i++) {
            Dvd dvd = coleccionDvd.get(i);
            if (dvd.getDirector().equals(director)) {
                System.out.println(dvd);
            }
        }
        System.out.println("\n");
    }
    // 8) Método para listar todos los DVD's ordenados
    public void listarDvdsOrdenados() {
        // Copiar la colección para no modificar el orden original
        ArrayList<Dvd> copiaColeccion = new ArrayList<>(coleccionDvd);
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
    public void dvdsEnPosesion() {
        // Crear una nuevo array list donde se van a agregar todos los dvds que posea
        ArrayList<Dvd> dvdQueTengo = new ArrayList<>();
        // Fijarse en la coleccion cuales poseo
        for (int i = 0; i< coleccionDvd.size(); i++) {
            Dvd dvd = coleccionDvd.get(i);
            // Si lo poseo agregar a el array list
            if (dvd.isPosesion() == true) {
                dvdQueTengo.add(dvd);
            }
        }
        // Imprimir la cantidad total
        System.out.println("Cantidad total de DVD que poseo: " + dvdQueTengo.size());
    }

    // METODOS DE CD's
    // 1) Método para agregar DVD's
    public void ingresarCd(Cd a) {
        coleccionCd.add(a);
    }
    // 2) Método para eliminar un DVD (El int i es la posición en la cual se encuentra el dvd)
    public void eliminarCd(String titulo) {
        boolean eliminado = false;
        for (int i = 0; i < coleccionCd.size(); i++) {
            Cd cd = coleccionCd.get(i);
            if (cd.getTitulo().equalsIgnoreCase(titulo)) {
                coleccionCd.remove(i);
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
    public void modificarCd(String nombre) {
        boolean modificado = false;
        for (int i = 0; i < coleccionCd.size(); i++) {
            Cd cd = coleccionCd.get(i);
            if (cd.getTitulo().equalsIgnoreCase(nombre)) {
                // Inputs
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

                // Realizar los cambios
                cd.setTitulo(titulo);
                cd.setGenero(genero);
                cd.setDuracion(duracion);
                cd.setPosesion(posesion);
                cd.setComentario(comentario);
                cd.setInterprete(interprete);
                cd.setCantTemas(cantTemas);
                System.out.println("CD modificado correctamente.\n");
                modificado = true;
                break;
            }
        }
        if (modificado) {
            System.out.println("CD modificado correctamente.\n");
        } else {
            System.out.println("No se encontró un CD con el título ingresado.\n");
        }
    }
    // 4) Método para listar todos los DVD's
    public void listarCds() {
        System.out.println("Lista de los CD's que tengo: \n");
        for (int i = 0; i < coleccionCd.size(); i++) {
            Cd cd = coleccionCd.get(i);
            System.out.println(cd);
        }
        System.out.println("\n");
    }
    // 5) Método para listar todos los DVD´s que tengo
    public void listarCdsEnPosesion() {
        System.out.println("Lista de los CD's que tengo: \n");
        for (int i = 0; i< coleccionCd.size(); i++) {
            Cd cd = coleccionCd.get(i);
            if (cd.isPosesion() == true) {
                System.out.println(cd);
            }
        }
        System.out.println("\n");
    }
    // 6) Método para listar por tiempo
    public void listarCdsPorTiempo(int tiempo) {
        System.out.println("Lista de los CD's que tengo menores a " + tiempo + " minutos: \n");
        for (int i = 0; i< coleccionCd.size(); i++) {
            Cd cd = coleccionCd.get(i);
            if (cd.getDuracion() < tiempo) {
                System.out.println(cd);
            }
        }
        System.out.println("\n");
    }
    // 7) Método para listar según director
    public void listarCdsPorInterprete(String interprete) {
        System.out.println("Lista de los CD's que tengo del interprete '" + interprete + "'");
        for (int i = 0; i< coleccionCd.size(); i++) {
            Cd cd = coleccionCd.get(i);
            if (cd.getInterprete().equals(interprete)) {
                System.out.println(cd);
            }
        }
        System.out.println("\n");
    }
    // 8) Método para listar todos los DVD's ordenados
    public  void listarCdsOrdenados() {
        // Copiar la colección para no modificar el orden original
        ArrayList<Cd> copiaColeccionCd = new ArrayList<>(coleccionCd);
        int n = copiaColeccionCd.size();

        // Ordenar la lista
        boolean intercambio = true;
        while (intercambio) {
            // Comenzar con intercambio = false y cambiar a true si se realiza un intercambio
            intercambio = false;
            // Iterar comparando 2 elementos seguidos
            for (int i = 0; i < n - 1; i++) {
                // Obtener los elementos
                Cd actual = copiaColeccionCd.get(i);
                Cd siguiente = copiaColeccionCd.get(i + 1);
                // Si el título del elemento actual es mayor que el título del siguiente elemento (ignorando mayúsculas y minúsculas)
                if (actual.getTitulo().compareToIgnoreCase(siguiente.getTitulo()) > 0) {
                    // Intercambiar los elementos
                    copiaColeccionCd.set(i, siguiente);
                    copiaColeccionCd.set(i + 1, actual);
                    // Establecer intercambio = true para indicar que se ha realizado un intercambio
                    intercambio = true;
                }
            }
            // Reducir el tamaño de la lista en una unidad en cada iteración (Para no comparar al elemento más grande que se fue al final de la lista)
            n--;
        }
        // Imprimir la lista ordenada
        System.out.println("Lista de DVDs ordenados por título:");
        for (Cd cd : copiaColeccionCd) {
            // Para cada DVD en la copia ordenada de la colección:
            // Imprimir el DVD en la consola
            System.out.println(cd);
        }
        // Imprimir una línea en blanco para separar la salida de la lista de DVDs de otros mensajes
        System.out.println();
    }
    // 10) Método para decir la cantidad de DVDs en posesion
    public void cdsEnPosesion() {
        // Crear una nuevo array list donde se van a agregar todos los dvds que posea
        ArrayList<Cd> cdQueTengo = new ArrayList<>();
        // Fijarse en la coleccion cuales poseo
        for (int i = 0; i< coleccionCd.size(); i++) {
            Cd cd = coleccionCd.get(i);
            // Si lo poseo agregar a el array list
            if (cd.isPosesion() == true) {
                cdQueTengo.add(cd);
            }
        }
        // Imprimir la cantidad total
        System.out.println("Cantidad total de DVD que poseo: " + cdQueTengo.size());
    }
    // 11) Método para imprimir la cantidad de temas en un CD
    public int cantTemasCd(String titulo){
        // Inicializar variable en 0 para luego asignarle la cantidad de temas si se encuentra
        int cantTemas = 0;
        for (int i = 0; i < coleccionCd.size(); i++) {
            Cd cd = coleccionCd.get(i);
            if (cd.getTitulo().equalsIgnoreCase(titulo)) {
                cantTemas = cd.getCantTemas();
            }
        }
        if (cantTemas == 0) {
            System.out.println("¡No se encontró el CD que estás buscando, o el CD no tiene temas!");
        }
        return cantTemas;
    }
}