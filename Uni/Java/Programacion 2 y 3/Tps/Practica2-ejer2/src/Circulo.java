public class Circulo extends Figura{
    // Atributos
    private int radio;

    // Constructor
    public Circulo(String nombre, int r)
    {
        super(nombre);
        radio = r;
    }

    // Método para calcular el area
    public double area(){
        return (Math.PI*radio*radio);
    }

    // ToString
    @Override
    public String toString()
    {
        return nombre + ", area:"+ area();
    }
}