import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciar curso
        Curso cursoTest = new Curso();

        // Crear estudiantes y agregar a la lista del curso
        Estudiante est1 = ingresarEstudiante();
        cursoTest.getListaEstudiantes().add(est1);
        Estudiante est2 = ingresarEstudiante();
        cursoTest.getListaEstudiantes().add(est2);

        // Buscar estudiante por codigo
        cursoTest.buscarEstudiante(est1);

        // Eliminar estudiante
        cursoTest.eliminarEstudiante(est1);
        System.out.println(cursoTest);

        // Imprimir promedio
        System.out.println("El promedio del curso es: " + cursoTest.calcularPromedioCurso());

        // Imprimir cant d aprobados y promedio de aprobados
        cursoTest.estudiantesQueAprobaron();
    }

    // Método para cargar estudiante mediante teclado
    public static Estudiante ingresarEstudiante(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingresar apellido:");
        String apellido = scanner.nextLine();
        System.out.println("Ingresar código:");
        int codigo = scanner.nextInt();
        System.out.println("Ingresar numero de semestre:");
        int numeroSemestre = scanner.nextInt();
        System.out.println("Ingresar nota final de estudiante:");
        int notaFinalEstudiante = scanner.nextInt();
        // Crear objeto Estudiante con los valores ingresados
        Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, codigo, numeroSemestre, notaFinalEstudiante);
        // Devolver objeto Estudiante
        return nuevoEstudiante;
    }
}