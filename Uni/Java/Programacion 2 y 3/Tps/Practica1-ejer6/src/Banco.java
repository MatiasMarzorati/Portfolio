import java.util.ArrayList;
import java.util.Random;

public class Banco {
    // Atributo
    private String nombre;

    // Lista
    ArrayList<Cuenta> listaCuentas = new ArrayList<>();

    // Constructor
    public Banco(String nombre){
        this.nombre = nombre;
    }

    // Getter
    public String getNombre(){
        return nombre;
    }

    // toString
    @Override
    public String toString() {
        return "Banco {" +
                "Nombre = '" + nombre + '\'' +
                ", Lista de Cuentas=" + listaCuentas +
                '}';
    }

    // Método para abrir la cuenta
    public long abrirCuenta(long dni, double saldo, double interes){
        Cuenta nuevaCuenta = new Cuenta(dni, saldo, interes);
        listaCuentas.add(nuevaCuenta);
        Random random = new Random();
        long numeroCuenta = random.nextLong(100000);
        nuevaCuenta.setNumeroCuenta(numeroCuenta);
        return numeroCuenta;
    }
    // Método para eliminar una cuenta
    public boolean cerrarCuenta(long numeroCuenta){
        for (int i=0; i < listaCuentas.size(); i++){
            if (listaCuentas.get(i).getNumeroCuenta() == numeroCuenta){
                listaCuentas.remove(i);
                System.out.println("¡La cuenta ha sido eliminada con éxito!");
                return true;
            }
        }
        System.out.println("¡La cuenta que desea eliminar no existe!");
        return false;
    }
    // Método para buscar una cuenta
    public Cuenta buscarCuenta(long numeroCuenta){
        for (int i=0; i < listaCuentas.size(); i++){
            if (listaCuentas.get(i).getNumeroCuenta() == numeroCuenta){
                return listaCuentas.get(i);
            }
        }
        System.out.println("No se encontró ninguna cuenta con el numero de cuenta " + numeroCuenta + ".");
        return null;
    }
}
