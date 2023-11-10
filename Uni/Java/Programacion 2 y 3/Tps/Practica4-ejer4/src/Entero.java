import java.util.Random;

public class Entero implements Ordenable{
    // Crear lista
    private int listaEnteros[];

    // Constructor
    public Entero(){
        this.listaEnteros = new int[10];
    }

    // Métodos interfaz
    @Override
    public void generarLista() {
        Random random = new Random();
        for (int i = 0; i < listaEnteros.length; i++) {
            int numeroRandom = random.nextInt(10) + 1;
            listaEnteros[i] = numeroRandom;
        }
    }
    @Override
    public void ordenarListaPorSeleccion(){
        for (int i=0; i < listaEnteros.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < listaEnteros.length; j++) {
                if (listaEnteros[j] < listaEnteros[minimo]) {
                    minimo = j;
                }
            }
            int valorIzquierda = listaEnteros[i];
            listaEnteros[i] = listaEnteros[minimo];
            listaEnteros[minimo] = valorIzquierda;
        }
    }
    @Override
    public void imprimirLista(){
        for (int i = 0; i < listaEnteros.length; i++) {
            System.out.println(listaEnteros[i]);
        }
    }
}
