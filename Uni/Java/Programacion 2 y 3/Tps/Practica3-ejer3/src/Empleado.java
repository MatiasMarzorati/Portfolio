public class Empleado {
    // Atributos
    protected String nombre, apellido, legajo;
    // Constructor
    public Empleado(String nombre, String apellido, String legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    // ToString
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                '}';
    }
}
