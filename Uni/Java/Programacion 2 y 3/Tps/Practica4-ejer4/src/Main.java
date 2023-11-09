
public class Main {
    public static void main(String[] args) {
        // Lista de enteros
        Entero listaEnteros = new Entero();
        System.out.println("LISTA SIN ORDENAR:");
        listaEnteros.generarLista();
        listaEnteros.imprimirLista();
        System.out.print("\n");
        System.out.println("LISTA ORDENADA:");
        listaEnteros.ordenarListaPorSeleccion();
        listaEnteros.imprimirLista();
        System.out.print("\n");

        // Lista de naturales
        Natural listaNaturales = new Natural();
        System.out.println("LISTA SIN ORDENAR:");
        listaNaturales.generarLista();
        listaNaturales.imprimirLista();
        System.out.print("\n");
        System.out.println("LISTA ORDENADA:");
        listaNaturales.ordenarListaPorSeleccion();
        listaNaturales.imprimirLista();
        System.out.print("\n");

        // Lista de naturales
        Palabra listaPalabras = new Palabra();
        System.out.println("LISTA SIN ORDENAR:");
        listaPalabras.generarLista();
        listaPalabras.imprimirLista();
        System.out.print("\n");
        System.out.println("LISTA ORDENADA:");
        listaPalabras.ordenarListaPorSeleccion();
        listaPalabras.imprimirLista();
        System.out.print("\n");

        // Lista de aviones
        Avion listaAviones = new Avion();
        System.out.println("LISTA SIN ORDENAR:");
        listaAviones.generarLista();
        listaAviones.imprimirLista();
        System.out.print("\n");
        System.out.println("LISTA ORDENADA:");
        listaAviones.ordenarListaPorSeleccion();
        listaAviones.imprimirLista();
        System.out.print("\n");

        // Lista de aviones
        Libro listaLibros = new Libro();
        System.out.println("LISTA SIN ORDENAR:");
        listaLibros.generarLista();
        listaLibros.imprimirLista();
        System.out.print("\n");
        System.out.println("LISTA ORDENADA:");
        listaLibros.ordenarListaPorSeleccion();
        listaLibros.imprimirLista();
        System.out.print("\n");
    }
}
