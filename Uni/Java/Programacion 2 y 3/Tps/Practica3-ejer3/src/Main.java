public class Main {
    public static void main(String[] args) {
        // Instanciar empleados
        // Asalariado
        Empleado asalariadoTest = new EmpleadoAsalariado("Tomas", "Matteozzi","1",100000);
        // Por Horas
        Empleado porHorasTest = new EmpleadoPorHoras("Matias", "Marzorati", "2", 80000, 1000, 160);
        // Por Comisión
        Empleado porComisionTest = new EmpleadoPorComision("Genaro", "Scrocca", "3", 20000, 5);
        // Base + Comisión
        Empleado baseMasComisionTest = new EmpleadoBaseMasComision("Franco", "Peralta", "4", 100000,15000,3);

        // Imprimir
        System.out.println(asalariadoTest);
        System.out.println(porHorasTest);
        System.out.println(porComisionTest);
        System.out.println(baseMasComisionTest);
    }
}