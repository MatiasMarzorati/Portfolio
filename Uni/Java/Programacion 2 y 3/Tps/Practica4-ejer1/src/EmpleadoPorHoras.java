public class EmpleadoPorHoras extends Empleado{
    // Atributos
    private double sueldoBasico, valorHorario;
    private int horasTrabajadas;

    // Constructor
    public EmpleadoPorHoras(String nombre, String apellido, String legajo, double sueldoBasico, double valorHorario, int horasTrabajadas) {
        super(nombre, apellido, legajo);
        this.sueldoBasico = sueldoBasico;
        this.valorHorario = valorHorario;
        this.horasTrabajadas = horasTrabajadas;
    }

    // ToString
    @Override
    public String toString() {
        return "EmpleadoPorHoras {" + super.toString() +
                ", sueldoBasico=" + sueldoBasico +
                ", valorHorario=" + valorHorario +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }

    // Método abstracto
    @Override
    public double calcularSueldo() {
        return sueldoBasico + horasTrabajadas * valorHorario;
    }
}
