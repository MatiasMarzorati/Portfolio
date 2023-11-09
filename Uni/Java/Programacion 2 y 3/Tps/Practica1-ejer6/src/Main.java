public class Main {
    public static void main(String[] args){
        // Crear banco y 3 cuentas
        Banco bancoTest = new Banco("Banco Test");
        long numeroCuenta1 = bancoTest.abrirCuenta(45015317, 150000, 1500);
        long numeroCuenta2 = bancoTest.abrirCuenta(44054851, 200000, 0);
        System.out.println(bancoTest);
        System.out.print("\n");
        // Eliminar cuenta 2
        boolean eliminado = bancoTest.cerrarCuenta(numeroCuenta2);
        System.out.println("Ha sido eliminado?: " + eliminado);
        System.out.print(bancoTest);
        System.out.println("\n");
        // Buscar cuenta 1
        Cuenta cuentaBuscada = bancoTest.buscarCuenta(numeroCuenta1);
        System.out.println("La cuenta que buscaba es: " + cuentaBuscada.getNumeroCuenta() + " del banco: " + bancoTest.getNombre() + ".");
        System.out.print("\n");
    }
}