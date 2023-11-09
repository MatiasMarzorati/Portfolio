public abstract class ArbolBinarioBusqueda {
    // ATRIBUTOS
    private String nombreArbol;

    // CONSTRUCTOR
    public ArbolBinarioBusqueda(String nombreArbol){
        this.nombreArbol = nombreArbol;
    }

    // METODOS ABSTRACTOS PARA IMPLEMENTAR EN CLASES HIJAS
    public abstract void insertar(Nodo nodo);
    public abstract void eliminar(Nodo nodo);
    public abstract String inOrder();
    public abstract void destruir();

    // GETTER
    public String getNombreArbol() { return nombreArbol; }
}
