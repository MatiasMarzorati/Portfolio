public class Trapecio extends Figura{
    // Atributos
    private int baseMayor;
    private int baseMenor;
    private int altura;
    // Constructor
    public Trapecio(String nombre, int baseMayor, int baseMenor,int altura)
    {
        super(nombre);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    // Método para calcular area
    public int area(){
        return ((baseMayor + baseMenor)/2)*altura;
    }

    // ToString
    @Override
    public String toString()
    {
        return nombre + ", area:"+ area();
    }
}