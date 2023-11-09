public class Administrativo {
    // Atributos
    private String nombre;
    private float sueldo;
    private String telefono;

    // Metodo constructor
    public Administrativo(String nom, float sue) {
        this.nombre = nom;
        this.sueldo = sue;
    }
    // Getters and Setters
    // Nombre
    public String getNombre() {
        return nombre;
    }
    // Sueldo
    public float getSueldo() {
        return sueldo;
    }

    // Método para comparar sueldos entre dos objetos Administrativo
    public String compararSueldo(Administrativo otroAdmin) {
        if (this.sueldo > otroAdmin.getSueldo()) {
            return "El sueldo de " + this.nombre + " es mayor... ¡Él gana más!";
        } else if (this.sueldo < otroAdmin.getSueldo()) {
            return "El sueldo de " + otroAdmin.getNombre() + " es mayor... ¡Él gana más!";
        } else {
            return "Los sueldos son iguales.";
        }
    }

    // Agregar telefono en clase Administrativo. Hacer que el metodo tu String lo incluya
    public String toString() {
        return "Administrativo [nombre=" + nombre + ", sueldo=" + sueldo + ", telefono=" + telefono + "]";
    }
}