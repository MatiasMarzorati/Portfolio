import java.util.Random;

public class Palabra implements Ordenable {
    // Crear lista
    private String listaPalabras[];

    // Constructor
    public Palabra(){
        this.listaPalabras = new String[10];
    }

    // Métodos interfaz
    @Override
    public void generarLista() {
        listaPalabras[0] = "Programacion";
        listaPalabras[1] = "Desarrollo";
        listaPalabras[2] = "Java";
        listaPalabras[3] = "Lenguajes";
        listaPalabras[4] = "Python";
        listaPalabras[5] = "Inteligencia";
        listaPalabras[6] = "Artificial";
        listaPalabras[7] = "Algoritmo";
        listaPalabras[8] = "Redes";
        listaPalabras[9] = "Informatica";
    }
    @Override
    public void ordenarListaPorSeleccion() {
        for (int i=0; i < listaPalabras.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < listaPalabras.length; j++) {
                if (listaPalabras[j].compareTo(listaPalabras[minimo]) < 0) {
                    minimo = j;
                }
            }
            String valorIzquierda = listaPalabras[i];
            listaPalabras[i] = listaPalabras[minimo];
            listaPalabras[minimo] = valorIzquierda;
        }
    }
    @Override
    public void imprimirLista() {
        for (int i = 0; i < listaPalabras.length; i++) {
            System.out.println(listaPalabras[i]);
        }
    }
}
