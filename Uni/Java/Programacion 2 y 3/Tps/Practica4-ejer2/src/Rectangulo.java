public class Rectangulo extends Poligono{
    // Constructor
    public Rectangulo(String color, long altura, long base){
        super(color, altura, base);
    }

    // Métodos abstractos
    @Override
    public long area() {
        return altura * base;
    }
    @Override
    public String pintar(String color) {
        setColor(color);
        return "El rectangulo está pintado de color: " + color + ".";
    }

}
