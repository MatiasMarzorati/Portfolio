public class Libro {
    // Atributos
    private String titulo;
    private boolean original, prestable;

    // Método constructor
    public Libro(String titulo, boolean original, boolean prestable) {
        this.titulo = titulo;
        this.original = original;
        this.prestable = prestable;
    }

    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public boolean esOriginal() {
        return original;
    }
    public void setOriginal(boolean original) {
        this.original = original;
    }
    public boolean sePresta() {
        return prestable;
    }
    public void setPrestable(boolean prestable) {
        this.prestable = prestable;
    }

    // ToString
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", original=" + original + ", prestable=" + prestable + "]";
    }
}