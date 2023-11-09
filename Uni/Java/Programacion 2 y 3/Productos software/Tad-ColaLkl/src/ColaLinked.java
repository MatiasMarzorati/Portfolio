import java.util.LinkedList;

public class ColaLinked extends Cola{
    // ATRIBUTOS
    private LinkedList<Integer> cola;

    // CONSTRUCTOR
    public ColaLinked(String nombreCola) {
        super(nombreCola);
        cola = new LinkedList<>();
    }

    // METODOS HEREDADOS
    @Override
    public boolean esVacio() { return cola.isEmpty(); }

    @Override
    public void vaciar() {
        try{
            if(!esVacio()){
                cola.clear();
                System.out.println("COLA VACIADA.");
            } else {
                throw new Exception("NO SE PUEDE VACIAR UNA COLA QUE YA ESTA VACIA.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public long largo() { return cola.size(); }

    @Override
    public int verPrimero() { return cola.getFirst(); }

    @Override
    public int verUltimo() { return cola.getLast(); }

    @Override
    public void enfilar(int nuevoElemento) {
        try{
            if (nuevoElemento > 0) {
                cola.add(nuevoElemento);
                System.out.println("ELEMENTO " + nuevoElemento + " ENFILADO.");
            } else {
                throw new Exception("NO SE PUEDE AGREGAR UN OBJETO MENOR DE 0.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void sacar() {
        try{
            if(!esVacio()){
                System.out.println("ELEMENTO " + cola.getFirst() + " ELIMINADO.");
                cola.remove();
            } else {
                throw new Exception("NO SE PUEDEN SACAR ELEMENTOS DE UNA COLA VACIA.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // TOSTRING
    @Override
    public String toString() { return "Cola Linked:" + cola; }
}
