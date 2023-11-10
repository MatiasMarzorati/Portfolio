package hijos;
import superior.Disco;

public class Cd extends Disco {
    // Atributos
    private String interprete;
    private int cantTemas;

    // Constructor
    public Cd(String titulo, String interprete, String genero, int duracion, int cantTemas, String comentario, boolean posesion) {
        super(titulo, genero, comentario, duracion, posesion);
        this.interprete = interprete;
        this.cantTemas = cantTemas;
    }

    // Getters & Setters
    public String getInterprete() {
        return interprete;
    }
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }
    public int getCantTemas() {
        return cantTemas;
    }
    public void setCantTemas(int cantTemas) {
        this.cantTemas = cantTemas;
    }

    // Método ToString desde interfaz
    @Override
    public String toString() {
        return "Cd [Título = " + titulo + ", Interprete = " + interprete + ", Género = " + genero
                + ", Duración = " + duracion + ", Cantidad de temas = " + cantTemas + ", Comentario = "
                + comentario + "]";
    }
}