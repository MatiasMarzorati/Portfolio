package superior;

public class Disco {
    // Atributos
    protected String titulo,genero, comentario;
    protected int duracion;
    protected boolean posesion;
    // Constructor
    public Disco(String titulo, String genero, String comentario, int duracion, boolean posesion) {
        this.titulo = titulo;
        this.genero = genero;
        this.comentario = comentario;
        this.duracion = duracion;
        this.posesion = posesion;
    }
    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public boolean isPosesion() {
        return posesion;
    }
    public void setPosesion(boolean posesion) {
        this.posesion = posesion;
    }
}