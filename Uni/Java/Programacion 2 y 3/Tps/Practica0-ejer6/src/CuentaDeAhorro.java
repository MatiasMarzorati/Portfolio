
public class CuentaDeAhorro {
    // Atributos
    // Variable constante (Static)
    private static double tasaInteresAnual = 0.04;
    // Variable de instancia
    private double saldoAhorro;

    // Constructor
    public CuentaDeAhorro(double saldoAhorro) {
        this.saldoAhorro = saldoAhorro;
    }

    // Getters & Setters
    public double getSaldoAhorro() {
        return saldoAhorro;
    }
    public void setSaldoAhorro(double saldoAhorros) {
        this.saldoAhorro = saldoAhorros;
    }


    // ToString
    @Override
    public String toString() {
        return "CuentaDeAhorros [saldoAhorros=" + saldoAhorro + "]";
    }

    // Método para calcular el interés mensual
    public void calcularlnteresMensual() {
        // Calcular el interés mensual basado en la tasa de interés anual y dividir por 12
        double interesMensual = saldoAhorro * tasaInteresAnual / 12;
        // Sumar el interés mensual al saldo actual
        saldoAhorro += interesMensual;
    }

    // Método static llamado modificar Tasalnteres para establecer la tasalnteresAnual en un nuevo valor
    public static void modificarTasaInteres(double nuevoValor) {
        tasaInteresAnual = nuevoValor;
    }
}