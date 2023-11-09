public abstract class Poligono {
    // Atributos
    protected String color;
    protected long altura, base;

    // Constructor
    public Poligono(String color, long altura, long base){
        this.color = color;
        this.altura = altura;
        this.base = base;
    }

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    // toString
    @Override
    public String toString() {
        return "Poligono {" +
                "Color = '" + color + '\'' +
                ", Altura = " + altura +
                ", Base = " + base +
                '}';
    }

    // Método para calcular el area
    public abstract long area();
    // Método para pintar el poligono
    public abstract String pintar(String color);
}
