public class EmpleadoAsalariado extends Empleado{
    // Atributo
    private double sueldoMensual;

    // Constructor
    public EmpleadoAsalariado(String nombre, String apellido, String legajo, double sueldoMensual){
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    // ToString
    @Override
    public String toString() {
        return "EmpleadoAsalariado {" + super.toString() +
                ", sueldoMensual=" + sueldoMensual +
                '}';
    }

    // Método abstracto
    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
}
