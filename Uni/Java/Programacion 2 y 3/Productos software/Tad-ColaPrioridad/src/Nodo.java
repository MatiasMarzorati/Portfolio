public class Nodo {
    private int posicion, contenido, prioridad;
    private Nodo siguiente;

    public Nodo(int contenido, int prioridad){
        this.contenido = contenido;
        this.prioridad = prioridad;
    }

    public Nodo getSiguiente(){ return siguiente; }
    public int getPrioridad(){ return prioridad; }
    public void setPosicion(int posicion) { this.posicion = posicion; }
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
    public void setPrioridad(int prioridad){ this.prioridad = prioridad; }

    @Override
    public String toString() { return "(" + posicion + ", "+ contenido + ")"; }
}
