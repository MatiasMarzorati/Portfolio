import java.util.Random;

public class Natural implements Ordenable{
    // Crear lista
    private double listaNaturales[];

    // Constructor
    public Natural(){
        this.listaNaturales = new double[10];
    }

    // Métodos interfaz
    @Override
    public void generarLista() {
        Random random = new Random();
        for (int i = 0; i < listaNaturales.length; i++) {
            int numeroRandom = random.nextInt(10) + 1;
            listaNaturales[i] = numeroRandom;
        }
    }
    @Override
    public void ordenarListaPorSeleccion() {
        for (int i=0; i < listaNaturales.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < listaNaturales.length; j++) {
                if (listaNaturales[j] < listaNaturales[minimo]) {
                    minimo = j;
                }
            }
            double valorIzquierda = listaNaturales[i];
            listaNaturales[i] = listaNaturales[minimo];
            listaNaturales[minimo] = valorIzquierda;
        }
    }
    @Override
    public void imprimirLista() {
        for (int i = 0; i < listaNaturales.length; i++) {
            System.out.println(listaNaturales[i]);
        }
    }

}
