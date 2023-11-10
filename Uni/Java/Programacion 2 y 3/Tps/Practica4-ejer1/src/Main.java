public class Main {
    public static void main(String[] args) {
        // Instanciar empleados
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new EmpleadoAsalariado("Tomas", "Matteozzi","1",100000);
        empleados[1] = new EmpleadoPorHoras("Matias", "Marzorati", "2", 80000, 1000, 160);
        empleados[2] = new EmpleadoPorComision("Genaro", "Scrocca", "3", 20000, 5);
        empleados[3] = new EmpleadoBaseMasComision("Franco", "Peralta", "4", 100000,15000,3);

        // Imprimir
        System.out.println("SUELDOS:");
        for (Empleado empleado : empleados) {
            System.out.println("El sueldo de: " + empleado.getNombre() + ", es de: $" + empleado.calcularSueldo() + ".");
        }
    }
}