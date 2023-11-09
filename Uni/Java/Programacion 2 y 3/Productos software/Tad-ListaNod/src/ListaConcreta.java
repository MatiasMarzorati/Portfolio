public class ListaConcreta extends Lista {
    // ATRIBUTOS
    private int cont;
    private Nodo primero, ultimo;

    // CONSTRUCTOR
    public ListaConcreta(String nombreCola) {
        super(nombreCola);
        primero = null;
        ultimo = null;
        cont = 0;
    }

    // METODOS HEREDADOS
    @Override
    public Nodo getPrimero() {
        return primero;
    }

    @Override
    public void localizar(int contenido) {
        Nodo current = primero;
        try{
            if(!esVacia()){
                while (current != null) {
                    if (current.getContenido() == contenido){
                        System.out.println("EL NODO SE ENCUENTRA EN LA POSICION: " + current.getPosicion() );
                        return;
                    }
                    current = current.getSiguiente();
                }
                throw new Exception("NO HAY NINGUN NODO CON EL CONTENIDO: " + contenido);
            } else {
                throw new Exception("NO SE PUEDE LOCALIZAR EN UNA LISTA VACIA.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void insertar(Nodo nuevoNodo){
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

    @Override
    public void insertarEnPosicion(int posicion, Nodo nuevoNodo) {
        try{
            // Validacion de posicion correcta
            if (posicion < 1 || posicion > cont + 1) {
                throw new Exception("POSICIÓN INVÁLIDA.");
            }
            cont++;
            // Si la posición es 1, el nuevo nodo será el nuevo primero
            if (posicion == 1) {
                nuevoNodo.setSiguiente(primero);
                primero = nuevoNodo;
            } else {
                Nodo anterior = null;
                Nodo current = primero;
                int currentPosition = 1;
                // Recorrer la lista hasta la posición deseada
                while (currentPosition < posicion) {
                    anterior = current;
                    current = current.getSiguiente();
                    currentPosition++;
                }
                // Insertar el nuevo nodo en la posición deseada
                anterior.setSiguiente(nuevoNodo);
                nuevoNodo.setSiguiente(current);
            }
            reorganizarPosiciones(); // Reorganizar las posiciones de los demás nodos
            System.out.println("ELEMENTO AGREGADO EN LA POSICIÓN " + posicion);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(int posicion) {
        try {
            if (!esVacia()) {
                // Verificar que la posición sea válida
                if (posicion < 1 || posicion > cont) {
                    throw new Exception("POSICIÓN INVÁLIDA.");
                }
                // Disminuir el contador
                cont--;
                // ELIMINACION SI ES EL PRIMER ELEMENTO
                if (posicion == 1) {
                    primero = primero.getSiguiente();
                    // Si la lista quedó vacía, entonces actualizar el último nodo también
                    if (primero == null) {
                        ultimo = null;
                    }
                    reorganizarPosiciones(); // Reorganizar las posiciones de los demás nodos
                    System.out.println("ELEMENTO ELIMINADO DE LA POSICIÓN " + posicion);
                    return;
                }

                // ELIMINACION SI NO ES EL PRIMER ELEMENTO
                Nodo anterior = null;
                Nodo current = primero;
                int currentPosition = 1;
                // Recorrer desde el primero hasta la posición anterior del nodo a eliminar
                while (currentPosition < posicion) {
                    anterior = current;
                    current = current.getSiguiente();
                    currentPosition++;
                }
                // Enlazar el nodo anterior directamente con el nodo siguiente, eliminando el nodo actual
                anterior.setSiguiente(current.getSiguiente());
                // Si el nodo siguiente es nulo, actualizar el último nodo
                if (anterior.getSiguiente() == null) {
                    ultimo = anterior;
                }
                reorganizarPosiciones(); // Reorganizar las posiciones de los demás nodos
                System.out.println("ELEMENTO ELIMINADO DE LA POSICIÓN " + posicion);
            } else {
                throw new Exception("NO SE PUEDE ELIMINAR UN ELEMENTO DE UNA LISTA VACÍA.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ListaConcreta ordenarElementos() {
        ListaConcreta nuevaLista = new ListaConcreta("Ordenada");
        try{
            if(!esVacia()){
                // Copiar los elementos de la lista original a la nueva lista
                Nodo current = primero;
                while (current != null) {
                    nuevaLista.insertar(new Nodo(current.getContenido()));
                    current = current.getSiguiente();
                }
                // Ordenamiento
                boolean intercambioRealizado;
                do {
                    intercambioRealizado = false;
                    current = nuevaLista.primero;
                    Nodo anterior = null;
                    while (current != null && current.getSiguiente() != null) {
                        if (current.getContenido() > current.getSiguiente().getContenido()) { // Contenido del actual mayor al del siguiente
                            // Si antes del nodo no hay nada entonces ese va a ser el primero
                            if (anterior == null) {
                                // Actualizar el primer nodo al siguiente nodo (mas chico)
                                nuevaLista.primero = current.getSiguiente();
                            } else {
                                // Si no es el primero ponerle al anterior el valor del nodo con contenido mas chico
                                anterior.setSiguiente(current.getSiguiente());
                            }
                            Nodo siguiente = current.getSiguiente().getSiguiente();
                            current.getSiguiente().setSiguiente(current);
                            current.setSiguiente(siguiente);
                            intercambioRealizado = true;
                        }
                        anterior = current;
                        current = current.getSiguiente();
                    }
                } while (intercambioRealizado);
                return nuevaLista;
            } else {
                throw new Exception("NO SE PUEDE ORDENAR UNA LISTA VACIA");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public ListaConcreta copiarLista() {
        ListaConcreta nuevaLista = new ListaConcreta("Copia de " + getNombreLista());
        Nodo current = primero;
        while (current != null) {
            nuevaLista.insertar(new Nodo(current.getContenido()));
            current = current.getSiguiente();
        }
        return nuevaLista;
    }

    @Override
    public void dividirLista(int posicion) {
        try {
            if (!esVacia()) {
                // Validacion de posicion
                if (posicion < 1 || posicion > cont) {
                    throw new Exception("POSICIÓN INVÁLIDA.");
                }
                // Creacion de listas
                ListaConcreta lista1 = new ListaConcreta("Lista 1");
                ListaConcreta lista2 = new ListaConcreta("Lista 2");
                // Setear el current al primero para empezar
                Nodo current = primero;
                int currentPosition = 1;
                // Agregar los elementos hasta la posicion a la primera lista
                while (currentPosition <= posicion) {
                    lista1.insertar(new Nodo(current.getContenido()));
                    current = current.getSiguiente();
                    currentPosition++;
                }
                // Agregar elementos restantes a la segunda lista
                while (current != null) {
                    lista2.insertar(new Nodo(current.getContenido()));
                    current = current.getSiguiente();
                }
                // Imprimir las dos listas resultantes
                System.out.println(lista1);
                System.out.println(lista2);
            } else {
                throw new Exception("NO SE PUEDE DIVIDIR UNA LISTA VACÍA.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // METODOS AUXILIARES
    public boolean esVacia(){
        return primero == null;
    }

    public void reorganizarPosiciones() {
        Nodo current = primero;
        int currentPosition = 1;
        while (current != null) {
            current.setPosicion(currentPosition);
            current = current.getSiguiente();
            currentPosition++;
        }
    }

    // TOSTRING
    @Override
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
        return getNombreLista() + ": [ " + result.toString() + "]";
    }
}
