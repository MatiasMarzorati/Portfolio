public class Cd {
    // Atributos
    private String titulo, interprete, comentario, genero;
    private int cantTemas;
    private double duracion;
    private boolean posesion;
    // Constructor
    public Cd(String titulo, String interprete, String comentario, String genero, int cantTemas, double duracion, boolean posesion) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.comentario = comentario;
        this.genero	= genero;
        this.cantTemas = cantTemas;
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
    public String getInterprete() {
        return interprete;
    }
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getCantTemas() {
        return cantTemas;
    }
    public void setCantTemas(int cantTemas) {
        this.cantTemas = cantTemas;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public boolean isPosesion() {
        return posesion;
    }
    public void setPosesion(boolean posesion) {
        this.posesion = posesion;
    }
    // ToString
    @Override
    public String toString() {
        return "Cd [titulo=" + titulo + ", interprete=" + interprete + ", comentario=" + comentario + ", genero="
                + genero + ", cantTemas=" + cantTemas + ", duracion=" + duracion + ", posesion=" + posesion + "]";
    }
}