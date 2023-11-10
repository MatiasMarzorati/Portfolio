import java.util.Arrays;

public class ColaVector extends Cola{
    // ATRIBUTOS
    private int[] cola;
    private int cont, size;

    // CONSTRUCTOR
    public ColaVector(String nombreCola, int size) {
        super(nombreCola);
        try{
            if (size > 0){
                cola = new int[size];
                cont = 0;
                this.size = size;
            } else {
                throw new Exception("NO SE PUEDE CREAR LISTA.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // METODOS HEREDADOS
    @Override
    public boolean esVacio() { return (cont == 0); }

    @Override
    public void vaciar() {
        try{
            if (!esVacio()){
                for(int i= 0; i < size; i++){
                    cola[i] = 0;
                }
                cont = 0;
                System.out.println("COLA VACIADA.");
            }
            else{
                throw new Exception("NO SE PUEDE VACIAR UNA COLA VACIA.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public long largo() { return cont; }

    @Override
    public int verPrimero() { return cola[0]; }

    @Override
    public int verUltimo() { return cola[cont - 1]; }

    @Override
    public void enfilar(int nuevoElemento) {
        try{
            if(cont != size){
                cola[cont] = nuevoElemento;
                cont++;
                System.out.println("ELEMENTO " + nuevoElemento + " ENFILADO.");
            } else {
                throw new Exception("NO SE PUEDE ENFILAR ELEMENTO. COLA LLENA.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void sacar() {
        try{
            if(!esVacio()){
                System.out.println("ELEMENTO " + cola[0] + " ELIMINADO.");
                for (int i = 0; i < cont - 1; i++) { // MOVER ELEMENTOS
                    cola[i] = cola[i + 1];
                }
                // ELIMINAR EL ELEMENTO
                cola[cont - 1] = 0;
                cont--;
            } else {
                throw new Exception("NO SE PUEDE SACAR UN ELEMENTO DE UNA COLA VACIA.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // TOSTRING
    @Override
    public String toString() { return "Cola Vector:" + Arrays.toString(cola); }
}
