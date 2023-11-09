public class Cuadrado extends Poligono {
    // Constructor
    public Cuadrado(String color, long altura, long base) {
        super(color, altura, base);
    }

    // Métodos abstractos
    @Override
    public long area() {
        return altura * altura;
    }
    @Override
    public String pintar(String color) {
        setColor(color);
        return "El cuadrado está pintado de color: " + color + ".";
    }
}
