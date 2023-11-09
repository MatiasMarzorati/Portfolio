// Importar libreria para input 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // PARTE 1
        // Crear un socio, mostrar sus datos
        Socio s1 = new Socio("Tomas");
        System.out.println("El nombre del socio es: " + s1.getNombre() + " y su numero: " + s1.getNumero());
        // Crear otro socio, mostrar sus datos
        Socio s2 = new Socio("Matias");
        System.out.println("El nombre del socio es: " + s2.getNombre() + " y su numero: " + s2.getNumero());

        // PARTE 2
        // Función para el input del teclado
        Scanner teclado = new Scanner(System.in);

        // Crear Admin 1 con nombre y valor.
        // Input nombre admin 1
        System.out.println("Ingresar nombre del 1er admin: ");
        String nombreAdmin1 = teclado.next();
        // Input sueldo admin 1
        System.out.println("Ingresar sueldo del 1er admin: ");
        float sueldoAdmin1 = teclado.nextFloat();

        // Crear Admin 2 con nombre y valor.
        // Input nombre admin 1
        System.out.println("Ingresar nombre del 2do admin: ");
        String nombreAdmin2 = teclado.next();
        // Input sueldo admin 1
        System.out.println("Ingresar sueldo del 2do admin: ");
        float sueldoAdmin2 = teclado.nextFloat();

        // Crear un admin con nombre y valor.
        Administrativo a1 = new Administrativo(nombreAdmin1, sueldoAdmin1);
        System.out.println("El nombre del administrativo es: " + a1.getNombre() + " y su sueldo es: " + a1.getSueldo());
        // Crear otro admin con nombre y valor.
        Administrativo a2 = new Administrativo(nombreAdmin2, sueldoAdmin2);
        System.out.println("El nombre del administrativo es: " + a2.getNombre() + " y su sueldo es: " + a2.getSueldo());

        // Calcular cual tiene el mayor sueldo e imprimirlo
        String mensajeSueldo = a1.compararSueldo(a2);
        System.out.println(mensajeSueldo);

        // Cerrar el teclado
        teclado.close();
    }
}
