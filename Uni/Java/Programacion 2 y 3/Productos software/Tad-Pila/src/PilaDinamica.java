import java.util.ArrayList;

public class PilaDinamica extends Pila{
    // ATRIBUTOS
    private ArrayList<Integer> pila;

    // CONSTRUCTOR
    public PilaDinamica(String nombrePila) {
        super(nombrePila);
        pila = new ArrayList<>();
    }

    // MNETODOS HEREDADOS
    @Override
    public void apilarElemento(int elemento) { pila.add(elemento); }

    @Override
    public int desapilarElemento() {
        try{
            if(!pilaVacia()){
                return pila.remove(pila.size() - 1);
            } else {
                throw new Exception("NO SE PUEDE DESAPILAR UNA PILA VACIA");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    return 0;
    }

    @Override
    public int topePila() {
        try {
            if (!pilaVacia()) {
                return pila.get(pila.size() - 1); // PARA DEVOLVER EL TOPE SE LE RESTA 1. EJ PILA DE 3 ELEMENTOS (0,1,2) EL TOPE ES 3 - 1
            } else {
                throw new Exception("NO HAY TOPE. PILA VACIA");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public boolean pilaVacia() { return (pila.size() == 0); }

    // TOSTRING
    @Override
    public String toString() { return "Pila Dinamica: " + pila; }
}
