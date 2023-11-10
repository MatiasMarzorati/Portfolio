public class Estudiante {
    // Atributos
    private String nombre, apellido;
    private int codigo, numeroSemestre, notaFinalEstudiante;

    // Constructor
    public Estudiante(String nombre, String apellido, int codigo, int numeroSemestre, int notaFinalEstudiante){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.numeroSemestre = numeroSemestre;
        this.notaFinalEstudiante = notaFinalEstudiante;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }
    public int getNotaFinalEstudiante() {
        return notaFinalEstudiante;
    }

    // ToString
    @Override
    public String toString() {
        return "Estudiante {" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigo=" + codigo +
                ", numeroSemestre=" + numeroSemestre +
                ", notaFinalEstudiante=" + notaFinalEstudiante +
                '}';
    }
}
