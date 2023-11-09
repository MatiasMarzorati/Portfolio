public abstract class Cola {
    // ATRIBUTOS
    private String nombreCola ;

    // CONSTRUCTOR
    public Cola(String nombreCola){
        this.nombreCola = nombreCola;
    }

    // METODOS
    public abstract boolean esVacio();
    public abstract void vaciar();
    public abstract long largo();
    public abstract int verPrimero();
    public abstract int verUltimo();
    public abstract void enfilar(int nuevoElemento);
    public abstract void sacar();

    // TOSTRING
    public String getNombreCola() { return nombreCola; }
}
