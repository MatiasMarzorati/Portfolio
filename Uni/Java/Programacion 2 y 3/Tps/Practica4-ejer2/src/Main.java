public class Main {
    public static void main(String[] args) {
        // Crear poligonos
        System.out.println("POLIGONOS:");
        Poligono[] Poligonos = new Poligono [2];
        Poligonos[0] = new Rectangulo("Rojo", 4, 8);
        Poligonos[1] = new Cuadrado("Verde", 5, 5);
        for(Poligono poligono : Poligonos){
            System.out.println(poligono);
        }
        System.out.print("\n");

        // Pintar de colores
        System.out.println("PINTAR:");
        Poligonos[0].pintar("Azul");
        Poligonos[1].pintar("Amarillo");
        for(Poligono poligono : Poligonos){
            System.out.println(poligono);
        }
        System.out.print("\n");

        // Calcular Area
        System.out.println("AREA:");
        for(Poligono poligono : Poligonos){
            System.out.println(poligono.area());
        }
    }
}