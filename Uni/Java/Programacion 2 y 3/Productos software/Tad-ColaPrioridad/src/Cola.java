public abstract class Cola {
    private String nombreCola;
    public Cola(String nombreCola){ this.nombreCola = nombreCola; }

    public abstract boolean esVacio();
    public abstract void vaciar();
    public abstract long largo();
    public abstract Nodo verPrimero();
    public abstract Nodo verUltimo();
    public abstract void enfilar(Nodo nuevoNodo);
    public abstract void sacar();

    public String getNombreCola() { return nombreCola; }
}
