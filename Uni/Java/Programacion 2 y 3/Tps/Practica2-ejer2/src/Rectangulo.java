public class Rectangulo extends Figura{
    // Atributos
    private int base;
    private int altura;

    // Constructor
    public Rectangulo(String nombre, int base, int altura)
    {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular area
    public int area(){
        return base*altura;
    }

    // ToString
    @Override
    public String toString()
    {
        return nombre + ", area:"+ area();
    }
}