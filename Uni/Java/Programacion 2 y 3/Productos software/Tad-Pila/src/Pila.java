public abstract class Pila {
    // ATRIBUTOS
    private String nombrePila;

    // CONSTRUCTOR
    public Pila(String nombrePila){ this.nombrePila = nombrePila; }

    // METODOS
    public abstract void apilarElemento(int elemento);
    public abstract int desapilarElemento();
    public abstract int topePila();
    public abstract boolean pilaVacia();

    // TOSTRING
    public String getNombrePila() {
        return nombrePila;
    }
}
