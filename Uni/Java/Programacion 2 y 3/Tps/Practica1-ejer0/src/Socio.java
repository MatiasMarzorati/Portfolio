public class Socio {
    // Crear la clase Socio con variables de instancia: nombre, número y variable de Clase: PróximoNúmero.
    // De Instancia
    private String nombre;
    private int numero;
    // De Clase
    // Inicializar en 1 el prox. num.
    private static int proximoNumero = 1;

    // Método Constructor
    public Socio(String nom) {
        this.nombre = nom;
        this.numero = proximoNumero++;
    }

    // Método de acceso (Desde source)
    // Nombre
    public String getNombre() {
        return nombre;
    }
    // Número
    public int getNumero() {
        return numero;
    }
    // Próximo Número
    public static int getProximoNumero() {
        return proximoNumero;
    }
    public static void setProximoNumero(int proximoNumero) {
        Socio.proximoNumero = proximoNumero;
    }
}