import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    // Atributo lista de estudiantes
    private ArrayList<Estudiante> listaEstudiantes;

    // Constructor
    public Curso(){
        listaEstudiantes = new ArrayList<>();
    }

    // Getter
    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    // ToString
    @Override
    public String toString() {
        return "Curso {" +
                "listaEstudiantes=" + listaEstudiantes +
                '}';
    }

    // Buscar estudiante en el ArrayList
    public void buscarEstudiante(Estudiante estudianteABuscar){
        for(int i=0; i < listaEstudiantes.size(); i++){
            if (listaEstudiantes.get(i).getCodigo() == estudianteABuscar.getCodigo()){
                System.out.println("El codigo del estudiante que busca es: "+ estudianteABuscar.getCodigo());
            }
            else{
                System.out.println("El estudiante que buscás no existe!");
            }
        }
    }

    // Buscar estudiante en el ArrayList
    public void eliminarEstudiante(Estudiante estudianteAEliminar){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i < listaEstudiantes.size(); i++){
            if (listaEstudiantes.get(i).getCodigo() == estudianteAEliminar.getCodigo()){
                System.out.println("Desea eliminar al estudiante? SI o NO");
                String opcion = scanner.next();
                if (opcion.equals("SI")){
                    listaEstudiantes.remove(estudianteAEliminar);
                    System.out.println("El estudiante con el codigo: " + estudianteAEliminar.getCodigo() + " ha sido eliminado");
                }
                else {
                    System.out.println("El estudiante no ha sido eliminado!");
                    break;
                }
            }
            else{
                System.out.println("El estudiante que buscás no existe!");
            }
        }
    }

    // Calcular el promedio del curso
    public double calcularPromedioCurso(){
        double sumaNotas = 0;
        for (int i=0; i < listaEstudiantes.size(); i++){
            sumaNotas = sumaNotas + listaEstudiantes.get(i).getNotaFinalEstudiante();
        }
        double promedio = sumaNotas / listaEstudiantes.size();
        return promedio;
    }

    // Método para obtener la cantidad de estudiantes que aprobó el curso: calcular el número de estudiantes que obtuvo un promedio mayor o igual a 4.0 y mostrarlo en pantalla. También se debe calcular el porcentaje de estudiantes que aprobó el curso.
    public void estudiantesQueAprobaron(){
        // Cantidad de alumnos que aprobaron
        int aprobados = 0;
        for(int i= 0; i < listaEstudiantes.size(); i++){
            if (listaEstudiantes.get(i).getNotaFinalEstudiante() >= 4){
                aprobados++;
            }
        }
        System.out.println("Aprobaron " + aprobados + " alumnos");
        // Promedio de aprobación
        double porcentaje = ((double)aprobados / listaEstudiantes.size()) * 100;
        System.out.println("El porcentaje de aprobados es: %" + porcentaje);

    }
}