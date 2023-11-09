public class EmpleadoPorComision extends Empleado{
    // Atributos
    private double tasaDeComision, cantidadDeVentas;

    // Constructor
    public EmpleadoPorComision(String nombre, String apellido, String legajo, double tasaDeComision, double cantidadDeVentas) {
        super(nombre, apellido, legajo);
        this.tasaDeComision = tasaDeComision;
        this.cantidadDeVentas = cantidadDeVentas;
    }

    // ToString
    @Override
    public String toString() {
        return "EmpleadoPorComision {" + super.toString() +
                ", tasaDeComision=" + tasaDeComision +
                ", cantidadDeVentas=" + cantidadDeVentas +
                '}';
    }

    // Método abstracto
    @Override
    public double calcularSueldo() {
        return tasaDeComision * cantidadDeVentas;
    }
}
