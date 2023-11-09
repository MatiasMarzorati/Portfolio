public abstract class Empleado {
    // Atributos
    protected String nombre, apellido, legajo;

    // Constructor
    public Empleado(String nombre, String apellido, String legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    // Getter
    public String getNombre(){
        return nombre;
    }

    // ToString
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                '}';
    }

    // Método abstracto para calcular el sueldo de cada empleado
    public abstract double calcularSueldo();
}
