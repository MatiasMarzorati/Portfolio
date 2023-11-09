public class Main {
    public static void main(String[] args) {
        // Crear todas las figuras en una lista
        Figura f[] = {new Rectangulo("Rectangulo 1",2,3),new Cuadrado("Cuadrado 1",10),
                new Cuadrado("Cuadrado 2",5), new Paralelog("Paralelogramo 1",10,10),
                new Trapecio("Trapecio 1",10,10,2),new Circulo("Circulo 1",2)};
        // Imprimir cada figura una por una recorriendo la lista
        for (int i = 0; i < f.length; i++)
            System.out.println(f[i]);
    }
}