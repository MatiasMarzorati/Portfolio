import java.util.ArrayList;

public class Main {
    // ArrayList
    public static ArrayList<Persona> alumnos = new ArrayList<Persona>();
    // Método main
    public static void main(String[] args) {
        // Crear nuevos alumno
        Alumno alumno1 = new Alumno("Tomás", "Matteozzi", "+542944644448", "011111");
        Alumno alumno2 = new Alumno("Matias", "Marzorati", "+542944374958", "011112");
        Alumno alumno3 = new Alumno("Matias", "Monzalvo", "+542944751456", "011113");
        // Agregar alumnos a ArrayList
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        // Imprimir
        System.out.println("Lista de alumnos:");
        for(Persona alumno : alumnos) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido() + ", " + alumno.getTelefono());
        }
    }
}
