package superior;

import hijos.Cd;

import java.util.Scanner;

public class ColeccionCd extends Coleccion implements Listable{
    // INICIAR SCANNER PARA INPUT
    static Scanner teclado = new Scanner(System.in);

    // CONSTRUCTOR
    public ColeccionCd(){
        super();
        Disco a = new Cd("Astroworld", "Travis Scott", "Hip Hop", 180,12, "Obra de arte", true);
        Disco b = new Cd("Good Kid, M.A.A.D City", "Kendrick Lamar", "Hip Hop", 68, 12, "Clásico del hip hop", true);
        Disco c = new Cd("DS2", "Future", "Trap", 74, 18, "Una de las mejores obras de Future", true);
        Disco d = new Cd("The College Dropout", "Kanye West", "Hip Hop", 76, 21, "Uno de los álbumes más influyentes de la década de 2000", true);
        Disco e = new Cd("Illmatic", "Nas", "Hip Hop", 40, 10, "Considerado como uno de los mejores álbumes de hip hop de todos los tiempos", true);
        coleccion.add(a);
        coleccion.add(b);
        coleccion.add(c);
        coleccion.add(d);
        coleccion.add(e);
    }

    @Override
    public void agregarDisco() {
        // Inputs
        System.out.print("Ingrese el título del CD: ");
        String titulo = teclado.nextLine();
        System.out.print("Ingrese el nombre del interprete: ");
        String interprete = teclado.nextLine();
        System.out.print("Ingrese el género del CD: ");
        String genero = teclado.nextLine();
        System.out.print("Ingrese la duración del CD: ");
        int duracion = teclado.nextInt();
        System.out.print("Ingrese la cantidad de temas en el CD: ");
        int cantTemas = teclado.nextInt();
        // Limpiar el buffer de entrada
        teclado.nextLine();
        System.out.print("Ingrese un comentario: ");
        String comentario = teclado.nextLine();
        System.out.print("¿Tiene el CD? (s/n): ");
        boolean posesion = teclado.nextLine().equalsIgnoreCase("s");
        // Una vez ingresados los datos en el input se ingresa el nuevo DVD (Creandolo)
        coleccion.add(new Cd(titulo, interprete, genero, duracion, cantTemas, comentario, posesion));
        System.out.println("CD agregado correctamente.\n");
    }
    @Override
    public void modificarDisco(String tituloAModificar) {
        boolean modificado = false;
        for (int i = 0; i < coleccion.size(); i++) {
            Disco c = coleccion.get(i);
            if (c.getTitulo().equalsIgnoreCase(tituloAModificar)) {
                // Inputs
                System.out.print("Ingrese el título del CD: ");
                String titulo = teclado.nextLine();
                System.out.print("Ingrese el nombre del interprete: ");
                String interprete = teclado.nextLine();
                System.out.print("Ingrese el género del CD: ");
                String genero = teclado.nextLine();
                System.out.print("Ingrese la duración del CD: ");
                int duracion = teclado.nextInt();
                System.out.print("Ingrese la cantidad de temas en el CD: ");
                int cantTemas = teclado.nextInt();
                // Limpiar el buffer de entrada
                teclado.nextLine();
                System.out.print("Ingrese un comentario: ");
                String comentario = teclado.nextLine();
                System.out.print("¿Tiene el CD? (s/n): ");
                boolean posesion = teclado.nextLine().equalsIgnoreCase("s");

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
    @Override
    public void listarDiscoPorDirectorOInterprete(String directorOInterprete) {
        System.out.println("Lista de los CD's que tengo del interprete '" + directorOInterprete + "'");
        for (int i = 0; i< coleccion.size(); i++) {
            Cd cd = (Cd) coleccion.get(i);
            if (cd.getInterprete().equals(directorOInterprete)) {
                System.out.println(cd);
            }
        }
        System.out.println();
    }
}

