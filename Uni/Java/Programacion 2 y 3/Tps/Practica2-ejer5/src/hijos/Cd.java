package hijos;
import superior.Disco;

public class Cd extends Disco {
    // Atributos
    private String interprete;
    private int cantTemas;
    // Constructor
    public Cd(String titulo, String genero, String comentario, int duracion, boolean posesion, String interprete,
              int cantTemas) {
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
    // ToString
    @Override
    public String toString() {
        return "Cd [titulo=" + titulo + ", genero=" + genero + ", comentario=" + comentario + ", duracion=" + duracion
                + ", posesion=" + posesion + ", interprete=" + interprete + ", cantTemas=" + cantTemas + "]";
    }
}