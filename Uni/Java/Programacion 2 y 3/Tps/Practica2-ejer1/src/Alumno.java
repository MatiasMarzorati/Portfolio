public class Alumno extends Persona {
    String matricula;

    public Alumno(String nombre, String apellido, String telefono, String matricula) {
        super(nombre, apellido, telefono);
        this.matricula = matricula;
    }

    // Getters & Setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    // ToString
    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
                + telefono + "]";
    }
}