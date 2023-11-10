public abstract class ArbolBinario {
    // ATRIBUTOS
    private String nombreArbol;

    // CONSTRUCTOR
    public ArbolBinario(String nombreArbol){
        this.nombreArbol = nombreArbol;
    }

    // METODOS ABSTRACTOS PARA IMPLEMENTAR EN CLASES HIJAS
    public abstract void destruir();
    public abstract Nodo padre(Nodo nodo);
    public abstract Nodo hijoIzquierdo(Nodo padre);
    public abstract Nodo hijoDerecho(Nodo padre);
    public abstract Nodo raiz();
    public abstract void insertarHijoIzquierda(Nodo padre, Nodo nodoAInsertar);
    public abstract void insertarHijoDerecha(Nodo padre, Nodo nodoAInsertar);
    public abstract void podarHijoIzquierda(Nodo padre);
    public abstract void podarHijoDerecha(Nodo padre);
    public abstract Nodo obtenerNodoPorContenido(int contenido);

    // GETTER
    public String getNombreArbol() { return nombreArbol; }
}
