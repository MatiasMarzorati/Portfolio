import java.util.LinkedList;

public abstract class Lista {
    // ATRIBUTOS
    private String nombreLista;

    // CONSTRUCTOR
    public Lista(String nombreLista){
        this.nombreLista = nombreLista;
    }

    // METODOS
    public abstract void localizar(int elemento);
    public abstract void insertar(int elemento);
    public abstract void insertarEnPosicion(int posicion, int elemento);
    public abstract void eliminar(int posicion);
    public abstract ListaConcreta ordenarElementos();
    public abstract ListaConcreta copiarLista();
    public abstract void dividirLista(int posicion);
    public abstract LinkedList<Integer> getLista();

    // GETTER
    public String getNombreLista() { return nombreLista; }
}
