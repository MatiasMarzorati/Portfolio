public class Cuenta {
    // Atributos
    private long dni, numeroCuenta;
    private double saldo, interes;

    // Constructor
    public Cuenta(long dni, double saldo, double interes) {
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    // Getter & Setter
    public long getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(long numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    // toString
    @Override
    public String toString() {
        return "Cuenta {" +
                "DNI = " + dni +
                ", Numero de Cuenta = " + numeroCuenta +
                ", Saldo = " + saldo +
                ", Interés = " + interes +
                '}';
    }
}
