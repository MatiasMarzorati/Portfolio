import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear 2 libros (Original y Fotocopia
        // Scanner p/ input
        System.out.println("Ingrese el titulo del libro: ");
        Scanner teclado = new Scanner(System.in);
        String titulo = teclado.nextLine();
        System.out.println("¿El libro es original? true or false: ");
        boolean original = teclado.nextBoolean();
        System.out.println("¿El libro es prestable? true or false: ");
        boolean prestable = teclado.nextBoolean();

        // Original no prestable
        Libro libro1 = new Libro(titulo, original, prestable);
        libro1.setOriginal(true);
        libro1.setPrestable(false);

        // Fotocopia prestable
        Libro libro2 = new Libro(titulo, original, prestable);
        libro2.setOriginal(false);
        libro2.setPrestable(true);

        System.out.println("Libro 1: " + libro1.getTitulo() + ", original: " + libro1.esOriginal() + ", prestable: " + libro1.sePresta());
        System.out.println("Libro 2: " + libro2.getTitulo() + ", original: " + libro2.esOriginal() + ", prestable: " + libro2.sePresta());

        // Cerrar teclado
        teclado.close();
    }
}