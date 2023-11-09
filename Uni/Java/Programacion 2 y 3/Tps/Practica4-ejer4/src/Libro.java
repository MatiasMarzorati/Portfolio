import java.util.ArrayList;

public class Libro implements Ordenable {
    // Atributos
    private String titulo, autor;
    private ArrayList<Libro> listaLibros;

    // Constructores
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public Libro(){
        this.listaLibros = new ArrayList<>();
    }

    // Getter
    public String getTitulo(){
        return titulo;
    }

    // ToString
    public String toString(){
        return "Libro { Título = " + titulo + ", Autor = " + autor +"}";
    }

    // Métodos interfaz
    @Override
    public void generarLista() {
        listaLibros.add(new Libro("El principito", "Antoine de Saint-Exupéry"));
        listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        listaLibros.add(new Libro("1984", "George Orwell"));
        listaLibros.add(new Libro("El viejo y el mar", "Ernest Hemingway"));
        listaLibros.add(new Libro("La insoportable levedad del ser", "Milan Kundera"));
        listaLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
        listaLibros.add(new Libro("Rayuela", "Julio Cortázar"));
        listaLibros.add(new Libro("La metamorfosis", "Franz Kafka"));
        listaLibros.add(new Libro("Mujercitas", "Louisa May Alcott"));
        listaLibros.add(new Libro("Las aventuras de Tom Sawyer", "Mark Twain"));
    }
    @Override
    public void ordenarListaPorSeleccion() {
        for (int i = 0; i < listaLibros.size() - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < listaLibros.size(); j++) {
                if (listaLibros.get(j).getTitulo().compareTo(listaLibros.get(minimo).getTitulo()) < 0) {
                    minimo = j;
                }
            }
            Libro temp = listaLibros.get(i);
            listaLibros.set(i, listaLibros.get(minimo));
            listaLibros.set(minimo, temp);
        }
    }
    @Override
    public void imprimirLista() {
        for(Libro libro: listaLibros){
            System.out.println(libro);
        }

    }
}
