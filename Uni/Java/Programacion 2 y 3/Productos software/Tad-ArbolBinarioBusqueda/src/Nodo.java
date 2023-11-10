public class Nodo {
    // ATRIBUTOS
    private int contenido;
    private Nodo hijoIzquierdo;
    private Nodo hijoDerecho;

    // CONSTRUCTOR
    public Nodo(int contenido) {
        this.contenido = contenido;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    // GETTERS Y SETTERS
    public int getContenido() { return contenido; }
    public void setContenido(int contenido){ this.contenido = contenido; }
    public Nodo getHijoIzquierdo() { return hijoIzquierdo; }
    public void setHijoIzquierdo(Nodo hijoIzquierdo) { this.hijoIzquierdo = hijoIzquierdo; }
    public Nodo getHijoDerecho() { return hijoDerecho; }
    public void setHijoDerecho(Nodo hijoDerecho) { this.hijoDerecho = hijoDerecho; }

    // TOSTRING
    @Override
    public String toString() { return "(" + contenido + ")"; }
}