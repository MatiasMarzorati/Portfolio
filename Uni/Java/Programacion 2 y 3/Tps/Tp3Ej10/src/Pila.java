public class Pila {
    private int tamanoMaximo;
    private Auto[] arregloPila;
    private int cima;
        //toto
    public Pila(int tamano) {
        tamanoMaximo = tamano;
        arregloPila = new Auto[tamanoMaximo];
        cima = -1;
    }

    public void apilar(Auto auto) {
        if (cima < tamanoMaximo - 1) {
            arregloPila[++cima] = auto;
        } else {
            System.out.println("El estacionamiento está lleno. No se puede estacionar el auto.");
        }
    }

    public Auto desapilar() {
        if (cima >= 0) {
            return arregloPila[cima--];
        } else {
            return null;
        }
    }

    public boolean estaVacia() {
        return (cima == -1);
    }
}