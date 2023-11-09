public class Vendedor {
    // Atributos
    private int numeroVendedor;
    // ventas[i][j] es el valor total vendido del producto j por el vendedor i
    private double[][] ventas;

    // Constructor
    public Vendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
        // Inicializa el arreglo de ventas con 5 vendedores y 5 productos
        this.ventas = new double[5][5];
    }

    // Getters
    public int getNumeroVendedor() {
        return this.numeroVendedor;
    }
    public double[][] getVentas() {
        return this.ventas;
    }

    // Método para agregar venta
    public void agregarVenta(int numeroProducto, double valorVenta) {
        this.ventas[this.numeroVendedor - 1][numeroProducto - 1] += valorVenta; // Agrega el valor de la venta al arreglo de ventas del vendedor correspondiente
    }

    // Método para obtener venta total
    public double getVentaTotal() {
        // Atributo
        double ventaTotal = 0;
        // Recorre todas las ventas de un vendedor en particular y las suma para obtener el valor total de ventas de ese vendedor.
        for (int i = 0; i < 5; i++) {
            // Suma todas las ventas del vendedor
            ventaTotal += this.ventas[this.numeroVendedor - 1][i];
        }
        return ventaTotal;
    }
}