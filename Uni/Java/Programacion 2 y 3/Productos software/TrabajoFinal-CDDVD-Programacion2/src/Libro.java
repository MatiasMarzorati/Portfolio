// Autores: Matteozzi, Marzorati y Monzalvo
import java.util.*;

class Libro {
    private String titulo, isbn, editorial, genero;
    private String[] autores;
    private int cantidadPaginas, anioEdicion;

    public Libro(String titulo, String[] autores, int cantidadPaginas, String isbn, int anioEdicion, String editorial, String genero) {
        this.titulo = titulo;
        this.autores = autores;
        this.cantidadPaginas = cantidadPaginas;
        this.isbn = isbn;
        this.anioEdicion = anioEdicion;
        this.editorial = editorial;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }
    public String[] getAutores() {
        return autores;
    }
    public int getCantidadPaginas() {
        return cantidadPaginas;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getAnioEdicion() {
        return anioEdicion;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "- " + titulo.toUpperCase() + ", ISBN: " + isbn + ", Editorial: " + editorial + ", Género: " + genero +
                ", Autor/es: " + Arrays.toString(autores) + ", Cantidad de Páginas: " + cantidadPaginas +
                ", Año de Edición: " + anioEdicion;
    }
}