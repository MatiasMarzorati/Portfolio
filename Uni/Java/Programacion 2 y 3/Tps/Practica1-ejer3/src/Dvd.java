public class Dvd {
    // Atributos
    private String titulo, genero, comentario, director;
    private int duracion;
    private boolean posesion;
    // Constructor
    public Dvd(String titulo, String genero, int duracion, boolean posesion, String comentario, String director) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.posesion = posesion;
        this.comentario = comentario;
        this.director = director;
    }
    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
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
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    // Método to String
    @Override
    public String toString() {
        return "Dvd [Título = " + titulo + ", Genero = " + genero + ", Duración = " + duracion + ", Posesión = " + posesion
                + ", Comentario = " + comentario + ", Director = " + director + "]";
    }
}