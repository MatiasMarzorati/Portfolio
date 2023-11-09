public class Figura {
    // Atributos
    protected String nombre;

    // Constructor
    public Figura (String n) {
        nombre = n;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ToString
    @Override
    public String toString()
    {
        return nombre;
    }
}