package hijos;
import superior.Disco;

public class Dvd extends Disco {
    // Atributos
    private String director;
    // Constructor
    public Dvd(String titulo, String genero, String comentario, int duracion, boolean posesion, String director) {
        super(titulo, genero, comentario, duracion, posesion);
        this.director = director;
    }
    // Getters & Setters
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    // ToString
    @Override
    public String toString() {
        return "Dvd [titulo=" + titulo + ", genero=" + genero + ", comentario=" + comentario + ", duracion=" + duracion
                + ", posesion=" + posesion + ", director=" + director + "]";
    }
}