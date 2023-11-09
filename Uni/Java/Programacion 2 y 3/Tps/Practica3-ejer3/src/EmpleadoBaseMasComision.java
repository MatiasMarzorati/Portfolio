public class EmpleadoBaseMasComision extends Empleado{
    // Atributos
    private double sueldoBase, tasaComision, cantidadVentas;

    // Constructor
    public EmpleadoBaseMasComision(String nombre, String apellido, String legajo, double sueldoBase, double tasaComision, double cantidadVentas) {
        super(nombre, apellido, legajo);
        this.sueldoBase = sueldoBase;
        this.tasaComision = tasaComision;
        this.cantidadVentas = cantidadVentas;
    }

    // ToString
    @Override
    public String toString() {
        return "EmpleadoBaseMasComision {" + super.toString() +
                ", sueldoBase=" + sueldoBase +
                ", tasaComision=" + tasaComision +
                ", cantidadVentas=" + cantidadVentas +
                '}';
    }
}
