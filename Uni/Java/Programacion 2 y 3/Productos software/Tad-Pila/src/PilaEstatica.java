import java.util.Arrays;

public class PilaEstatica extends Pila{
    // ATRIBUTOS
    private int[] pila;
    private int tope, size;

    // CONSTRUCTOR
    public PilaEstatica(String nombrePila, int size) {
        super(nombrePila);
        this.size = size;
        pila = new int[size];
        tope = 0;
    }

    // METODOS HEREDADOS
    @Override
    public void apilarElemento(int elemento) {
        try{
            if(!pilaLlena()){
                pila[tope] = elemento;
                tope++;
            } else {
                throw new Exception("NO SE PUEDE APILAR ELEMENTO. PILA LLENA");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int desapilarElemento() {
        try{
            if(!pilaVacia()){
                tope--;
                int desapilado = pila[tope];
                pila[tope] = 0;
                return desapilado;
            } else{
                throw new Exception("NO SE PUEDE DESAPILAR UNA LISTA VACIA");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int topePila() {
        try{
            if (!pilaVacia()) {
                return pila[tope - 1]; // PARA DEVOLVER EL TOPE SE LE RESTA 1. EJ PILA DE 3 ELEMENTOS (0,1,2) EL TOPE ES 3 - 1
            } else {
                throw new Exception("NO HAY TOPE, LISTA VACIA");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    @Override
    public boolean pilaVacia () { return (tope == 0); }

    // METODOS AUXILIARES
    public boolean pilaLlena () { return (tope == size); }

    // TOSTRING
    @Override
    public String toString() { return "Pila Estatica: " + Arrays.toString(pila); }
}

