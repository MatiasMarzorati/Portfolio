package superior;

import hijos.Dvd;

import java.util.Scanner;

public class ColeccionDvd extends Coleccion {
    // INICIAR SCANNER PARA INPUT
    static Scanner teclado = new Scanner(System.in);

    // CONSTRUCTOR
    public ColeccionDvd(){
        super();
        Disco a = new Dvd("Piratas del Caribe", "Espen Sandverg", "Acción", 163,"Excelente", true);
        Disco b = new Dvd("El Padrino", "Francis Ford Coppola", "Drama", 175, "Obra maestra del cine", false);
        Disco c = new Dvd("Forrest Gump", "Robert Zemeckis", "Comedia dramática", 142, "Una historia conmovedora", false);
        Disco d = new Dvd("The Matrix", "The Wachowskis", "Ciencia ficción", 136, "Revolucionaria en su tiempo", true);
        Disco e = new Dvd("La La Land", "Damien Chazelle", "Musical romántico", 128, "Una carta de amor al cine musical", true);
        coleccion.add(a);
        coleccion.add(b);
        coleccion.add(c);
        coleccion.add(d);
        coleccion.add(e);
    }

    @Override
    public void agregarDisco() {
        // Inputs
        System.out.print("Ingrese el título del DVD: ");
        String titulo = teclado.nextLine();
        System.out.print("Ingrese el nombre del director: ");
        String director = teclado.nextLine();
        System.out.print("Ingrese el género del DVD: ");
        String genero = teclado.nextLine();
        System.out.print("Ingrese la duración en minutos del DVD: ");
        int duracion = teclado.nextInt();
        // Limpiar el buffer de entrada
        teclado.nextLine();
        System.out.print("Ingrese un comentario: ");
        String comentario = teclado.nextLine();
        System.out.print("¿Tiene el DVD? (s/n): ");
        boolean posesion = teclado.nextLine().equalsIgnoreCase("s");
        // Una vez ingresados los datos en el input se ingresa el nuevo DVD (Creandolo)
        coleccion.add(new Dvd(titulo, director, genero, duracion, comentario, posesion));
        System.out.println("DVD agregado correctamente.\n");
    }
    @Override
    public void modificarDisco(String tituloAModificar) {
        // Booleano para indicar si ya fue modificado (Empieza en falso)
        boolean modificado = false;
        for (int i = 0; i < coleccion.size(); i++) {
            Disco d = coleccion.get(i);
            if (d.getTitulo().equalsIgnoreCase(tituloAModificar)) {
                // Inputs
                System.out.println("Ingresar los datos del DVD:");
                System.out.print("Ingrese el título del DVD: ");
                String titulo = teclado.nextLine();
                System.out.print("Ingrese el nombre del director: ");
                String director = teclado.nextLine();
                System.out.print("Ingrese el género del DVD: ");
                String genero = teclado.nextLine();
                System.out.print("Ingrese la duración en minutos del DVD: ");
                int duracion = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer de entrada
                System.out.print("Ingrese un comentario: ");
                String comentario = teclado.nextLine();
                System.out.print("¿Tiene el DVD? (s/n): ");
                boolean posesion = teclado.nextLine().equalsIgnoreCase("s");

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
    @Override
    public void listarDiscoPorDirectorOInterprete(String directorOInterprete) {
        System.out.println("Lista de los DVD's que tengo del interprete '" + directorOInterprete + "'");
        for (int i = 0; i< coleccion.size(); i++) {
            Dvd dvd = (Dvd) coleccion.get(i);
            if (dvd.getDirector().equals(directorOInterprete)) {
                System.out.println(dvd);
            }
        }
        System.out.println();
    }
}