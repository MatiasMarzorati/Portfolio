
public class Factura {
    // Atributos/Variables
    private int numeroFactura;
    private int numeroArticulo;
    private String descripcionArticulo;
    private int cantArticulo;
    private float precioArticulo;

    // Método Constructor
    public Factura(int nF, int nA, String dA, int cA, float pA) {
        this.numeroFactura = nF;
        this.numeroArticulo = nA;
        this.descripcionArticulo = dA;
        this.cantArticulo = cA;
        this.precioArticulo = pA;
    }

    // Getters and Setters
    public int getNumeroFactura() {
        return numeroFactura;
    }
    public int getNumeroArticulo() {
        return numeroArticulo;
    }
    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }
    public int getCantArticulo() {
        return cantArticulo;
    }
    public float getPrecioArticulo() {
        return precioArticulo;
    }

    // Método para obtener el monto de la factura
    public static void obtenerMontoFactura(int cA, float pA) {
        double montoFactura = cA * pA;
        System.out.println("MONTO FINAL: $" + montoFactura);
    }

}