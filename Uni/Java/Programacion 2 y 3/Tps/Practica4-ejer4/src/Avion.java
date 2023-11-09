import java.util.ArrayList;

public class Avion implements Ordenable{
    // Atributos
    private char company;
    private int numero;
    private ArrayList<Avion> listaAviones;

    // Constructores
    public Avion(char company, int numero){
        this.company = company;
        this.numero = numero;
    }
    public Avion(){
        this.listaAviones = new ArrayList<>();
    }

    // Getter
    public char getCompania(){
        return company;
    }

    // ToString
    @Override
    public String toString(){
        return "Avión { Compañia = " + company + ", Número = " + numero +"}";
    }

    // Métodos interfaz
    @Override
    public void generarLista() {
        listaAviones.add(new Avion('H', 0123));
        listaAviones.add(new Avion('A', 1234));
        listaAviones.add(new Avion('C', 9012));
        listaAviones.add(new Avion('D', 3456));
        listaAviones.add(new Avion('E', 7890));
        listaAviones.add(new Avion('J', 8901));
        listaAviones.add(new Avion('B', 5678));
        listaAviones.add(new Avion('F', 2345));
        listaAviones.add(new Avion('G', 6789));
        listaAviones.add(new Avion('I', 4567));
    }
    @Override
    public void ordenarListaPorSeleccion() {
        for (int i = 0; i < listaAviones.size() - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < listaAviones.size(); j++) {
                if (listaAviones.get(j).getCompania() < listaAviones.get(minimo).getCompania()) {
                    minimo = j;
                }
            }
            Avion temp = listaAviones.get(i);
            listaAviones.set(i, listaAviones.get(minimo));
            listaAviones.set(minimo, temp);
        }
    }
    @Override
    public void imprimirLista() {
        for (Avion avion : listaAviones) {
            System.out.println(avion);
        }
    }

}
