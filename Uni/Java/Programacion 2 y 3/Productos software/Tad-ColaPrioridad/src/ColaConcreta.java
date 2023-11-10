public class ColaConcreta extends Cola{
    private int cont;
    private Nodo primero, ultimo;
    public ColaConcreta(String nombreCola) {
        super(nombreCola);
        primero = null;
        ultimo = null;
        cont = 0;
    }

    @Override
    public boolean esVacio() {
        return primero == null;
    }

    @Override
    public void vaciar() {
        primero = null;
        ultimo = null;
        cont = 0;
    }

    @Override
    public long largo() {
        return cont;
    }

    @Override
    public Nodo verPrimero() {
        try{
            if (!esVacio()){
                return primero;
            } else {
                throw new Exception("LISTA VACIA NO HAY PRIMERO.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Nodo verUltimo() {
        try{
            if (!esVacio()){
                return ultimo;
            } else {
                throw new Exception("LISTA VACIA NO HAY ULTIMO.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void enfilar(Nodo nuevoNodo) {
        cont++;
        nuevoNodo.setPosicion(cont);
        // Si el primer nodo esta vacio entonces la cola esta vacia y se agrega como primero y ultimo
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            // Sino se agrega como nodo siguiente y se setea en la clase Nodo
        } else {
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
        System.out.println("ELEMENTO AGREGADO.");
    }

    public void sacar() {
        try {
            if (!esVacio()) {
                Nodo current = primero;
                int maxPrioridad = -1; // Valor inicial para comparación de prioridades
                // Recorrer todos los nodos para ver cual es la mayor prioridad
                while (current != null) {
                    if (current.getPrioridad() > maxPrioridad) {
                        maxPrioridad = current.getPrioridad();
                    }
                    current = current.getSiguiente();
                }
                // Volver a poner el primero en current
                current = primero;
                Nodo anterior = null;
                while (current != null) {
                    if (current.getPrioridad() == maxPrioridad) {
                        // Eliminar el nodo con la mayor prioridad
                        if (anterior == null) {
                            primero = current.getSiguiente();
                        } else {
                            anterior.setSiguiente(current.getSiguiente());
                        }
                        cont--;
                        // Si se elimina el último nodo, ajustar el último y el contador
                        if (primero == null) {
                            ultimo = null;
                            cont = 0;
                        }
                        // Reorganizar posiciones
                        current = primero;
                        int nuevaPosicion = 1;
                        while (current != null) {
                            current.setPosicion(nuevaPosicion);
                            nuevaPosicion++;
                            current = current.getSiguiente();
                        }
                        break; // Salir del bucle después de eliminar el elemento deseado
                    }
                    anterior = current;
                    current = current.getSiguiente();
                }
            } else {
                throw new Exception("NO SE PUEDE SACAR UN ELEMENTO DE UNA COLA QUE ESTÁ VACÍA");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        if (primero == null) {
            return "COLA VACIA.";
        }
        StringBuilder result = new StringBuilder();
        Nodo current = primero;
        while (current != null) {
            result.append(current).append(" ");
            current = current.getSiguiente();
        }
        return "Cola: [ " + result.toString() + "]";
    }
}
