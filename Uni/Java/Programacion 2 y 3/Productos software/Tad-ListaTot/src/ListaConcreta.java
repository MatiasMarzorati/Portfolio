import java.util.LinkedList;

public class ListaConcreta extends Lista {
    // ATRIBUTOS
    private LinkedList<Integer> lista;

    // CONSTRUCTOR
    public ListaConcreta(String nombreLista) {
        super(nombreLista);
        lista = new LinkedList<>();
    }

    // METODOS HEREDADOS
    @Override
    public void localizar(int elementoALocalizar) {
        try {
            for (Integer elemento : lista) {
                if (elemento == elementoALocalizar) {
                    System.out.println("EL ELEMENTO SE ENCUENTRA EN LA POSICION: " + lista.indexOf(elemento));
                    return;
                }
            }
            throw new Exception("NO SE LOCALIZO EL ELEMENTO.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void insertar(int elemento){
        lista.add(elemento);
        System.out.println("ELEMENTO " + elemento + " INSERTADO");
    }

    @Override
    public void insertarEnPosicion(int posicion, int elemento) {
        lista.add(posicion, elemento);
        System.out.println("ELEMENTO " + elemento + " INSERTADO EN LA POSICION: " + posicion);
    }

    @Override
    public void eliminar(int posicion) {
        try{
            if(!esVacia()){
                int elementoAEliminar = lista.remove(posicion);
                System.out.println("ELEMENTO " + elementoAEliminar + " ELIMINADO");
            } else {
                throw new Exception("NO SE PUEDE ELIMINAR UN ELEMENTO DE UNA LISTA VACIA");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ListaConcreta ordenarElementos() {
        ListaConcreta listaOrdenada = new ListaConcreta("Ordenada");
        try{
            if(!esVacia()){
                listaOrdenada.lista.addAll(this.lista);
                listaOrdenada.lista.sort(null);
                return listaOrdenada;
            } else{
                throw new Exception("NO SE PUEDE ORDENAR UNA LISTA VACIA");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        } return null;
    }

    @Override
    public ListaConcreta copiarLista() {
        ListaConcreta copia = new ListaConcreta("Copia");
        try{
            if(!esVacia()){
                copia.lista.addAll(this.lista);
                return copia;
            } else{
                throw new Exception("NO SE PUEDE COPIAR UNA LISTA VACIA");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        } return null;
    }

    @Override
    public void dividirLista(int posicion) {
        try{
            if(!esVacia()){
                if (posicion >= 0 && posicion < lista.size()) {
                    ListaConcreta primeraParte = new ListaConcreta("PARTE 1");
                    ListaConcreta segundaParte = new ListaConcreta("PARTE 2");
                    // Agregar a la primera lista elementos hasta la posicion especificada
                    for (int i = 0; i < posicion; i++) {
                        primeraParte.insertar(lista.get(i));
                    }
                    // Agregar los elementos despues de la posicion a la segunda lista
                    for (int i = posicion; i < lista.size(); i++) {
                        segundaParte.insertar(lista.get(i));
                    }
                    // Imprimir lista
                    System.out.println(primeraParte);
                    System.out.println(segundaParte);
                } else {
                    throw new Exception("POSICION INVALIDA");
                }
            } else {
                throw new Exception("NO SE PUEDE DIVIDIR UNA LISTA VACIA");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public LinkedList<Integer> getLista() {
        return lista;
    }

    // METODOS AUXILIARES
    public boolean esVacia(){
        return lista.isEmpty();
    }

    // TOSTRING
    @Override
    public String toString() {
        return "LISTA " + getNombreLista().toUpperCase() + " = " + lista;
    }
}
