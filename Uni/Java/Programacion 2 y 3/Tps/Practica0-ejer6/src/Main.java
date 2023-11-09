
public class Main {
    public static void main(String[] args) {
        // Crear 2 instancias de ahorradores
        CuentaDeAhorro ahorrador1 = new CuentaDeAhorro(20000.00);
        CuentaDeAhorro ahorrador2 = new CuentaDeAhorro(30000.00);

        // Establecer tasa anual en 4%
        CuentaDeAhorro.modificarTasaInteres(0.04);

        // Calcular interés mensual para ambos ahorradores en 12 meses (Calcular en cada mes el interés)
        for (int i = 1; i <= 12; i++) {
            // Calcular interes por mes
            ahorrador1.calcularlnteresMensual();
            ahorrador2.calcularlnteresMensual();
            // Imprimir los saldos de ambos ahorradores después de cada mes
            System.out.println("Mes " + i + ": Ahorrador 1: $" + ahorrador1.getSaldoAhorro() + ", Ahorrador 2: $" + ahorrador2.getSaldoAhorro());
        }

        // Establecer tasa anual en 5%
        CuentaDeAhorro.modificarTasaInteres(0.05);

        // Calcular el interés del siguiente mes (Mes 13)
        // Calcular interes por mes
        ahorrador1.calcularlnteresMensual();
        ahorrador2.calcularlnteresMensual();
        // Imprimir los saldos de ambos ahorradores después de cada mes
        System.out.println("Siguiente Mes:  Ahorrador 1 $:" + ahorrador1.getSaldoAhorro() + ", Ahorrador 2: $" + ahorrador2.getSaldoAhorro());
    }
}
