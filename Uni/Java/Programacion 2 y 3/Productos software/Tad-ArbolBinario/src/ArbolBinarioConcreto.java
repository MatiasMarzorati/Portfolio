// IMPORTS
import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinarioConcreto extends ArbolBinario {
    // ATRIBUTOS
    private Nodo raiz;

    // CONSTRUCTOR
    public ArbolBinarioConcreto(String nombreArbol) {
        super(nombreArbol);
    }

    // METODOS HEREDADOS DE CLASE ABSTRACTA
    @Override
    public void destruir() {
        try{
            if(!esVacio()){ // VALIDACION DE ARBOL VACIO
                raiz = null; // AL PONER LA RAIZ NULA SE DESTRUYE EL ARBOL
                System.out.println("ARBOL DESTRUIDO.");
            } else {
                throw new Exception("NO SE PUEDE DESTRUIR UN ARBOL QUE ESTA VACIO.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Nodo padre(Nodo nodo) {
        return encontrarPadre(raiz, nodo); // LLAMADO A METODO AUXILIAR PARA ENCONTRAR EL PADRE
    }

    // BUSCAR PADRE POR RECORRIDO DE AMPLITUD
    private Nodo encontrarPadre(Nodo raiz, Nodo hijoBuscado) {
        // SE UTILIZA LA LINKED LIST COMO COLA PARA NO TENER QUE HACER LAS FUNCIONES DE COLA
        Queue<Nodo> cola = new LinkedList<>();
        cola.offer(raiz); // PRIMERO SE AGREGA LA RAIZ A LA COLA PARA COMENZAR A BUSCAR

        while (!cola.isEmpty()) {
            // SACAR ELEMENTO DE LA COLA PARA EVALUAR SI ES EL PADRE
            Nodo actual = cola.poll();

            if (actual.getHijoIzquierdo() != null) {
                if (actual.getHijoIzquierdo() == hijoBuscado) {
                    return actual;
                }
                // SI NO SE ENCONTRO EL PADRE AGREGAR EL HIJO A LA COLA PARA PROCESARLO EN OTRA ITERACION
                cola.offer(actual.getHijoIzquierdo());
            }
            if (actual.getHijoDerecho() != null) {
                if (actual.getHijoDerecho() == hijoBuscado) {
                    return actual;
                }
                // SI NO SE ENCONTRO EL PADRE AGREGAR EL HIJO A LA COLA PARA PROCESARLO EN OTRA ITERACION
                cola.offer(actual.getHijoDerecho());
            }
        }
        return null;
    }

    @Override
    public Nodo hijoIzquierdo(Nodo padre) { return padre.getHijoIzquierdo(); } // DEVOLVER EL HIJO IZQUIERDO CON EL GETTER DEL NODO

    @Override
    public Nodo hijoDerecho(Nodo padre) { return padre.getHijoDerecho(); } // DEVOLVER EL HIJO DERECHO CON EL GETTER DEL NODO

    @Override
    public Nodo raiz() { return raiz; } // DEVUELVE LA RAIZ

    @Override
    public void insertarHijoIzquierda(Nodo padre, Nodo nodoAInsertar) {
        try {
            if (raiz == null) {
                raiz = nodoAInsertar; // SI NO HAY RAIZ EL NODO A INSERTAR ES LA RAIZ
            } else if (padre.getHijoIzquierdo() == null) {
                padre.setHijoIzquierdo(nodoAInsertar); // INSERTAR EL NODO COMO HIJO DEL PADRE DEL LADO IZQUIERDO SI NO HAY UNO EN LA POSICION
            } else {
                throw new Exception("NO SE PUEDE CARGAR UN NODO A LA IZQUIERDA, POSICION OCUPADA POR: " + padre.getHijoIzquierdo());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void insertarHijoDerecha(Nodo padre, Nodo nodoAInsertar) {
        try{
            if(padre.getHijoDerecho() == null){ // SI NO HAY HIJO DERECHO
                if (padre.getHijoIzquierdo() != null){ // Y SI HAY HIJO IZQUIERDO
                    padre.setHijoDerecho(nodoAInsertar); // CARGAR NODO COMO HIJO
                } else {
                    throw new Exception("NO SE PUEDE CARGAR UN NODO A LA DERECHA, NO HAY NINGUN NODO A LA IZQUIERDA.");
                }
            } else {
                throw new Exception("YA HAY UN VALOR EN EL HIJO DERECHO.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void podarHijoIzquierda(Nodo padre) {
        try {
            if (padre.getHijoIzquierdo() != null) {
                // PRIMERO PODAR LA RAMA IZQUIERDA
                padre.setHijoIzquierdo(null);
                // REACOMODAR RAMA DERECHA A LA IZQUIERDA (NO PUEDE HABER SOLO RAMA DERECHA)
                Nodo nuevaRamaDerecha = padre.getHijoDerecho();
                if (nuevaRamaDerecha != null) {
                    padre.setHijoIzquierdo(nuevaRamaDerecha);
                    padre.setHijoDerecho(null); // PODAR LA RAMA DERECHA ANTERIOR
                }
                System.out.println("RAMA IZQUIERDA PODADA.");
            } else {
                throw new Exception("NO SE PUEDE PODAR UN HIJO QUE NO EXISTE.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void podarHijoDerecha(Nodo padre) {
        try{
            if(padre.getHijoDerecho() != null){
                padre.setHijoDerecho(null); // PODAR SI EL HIJO DERECHO EXISTE
                System.out.println("RAMA DERECHA PODADA.");
            } else {
                throw new Exception("NO SE PUEDE PODAR UN HIJO QUE NO EXISTE.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // METODOS AUXILIARES
    @Override
    public Nodo obtenerNodoPorContenido(int contenido) {
        return encontrarNodoPorContenido(raiz, contenido); // LLAMADO A METODO AUXILIAR PARA ENCONTRAR EL NODO POR CONTENIDO
    }

    // BUSCAR NODO POR RECORRIDO DE AMPLITUD
    private Nodo encontrarNodoPorContenido(Nodo raiz, int contenido) {
        // SE UTILIZA LA LINKED LIST COMO COLA PARA NO TENER QUE HACER LAS FUNCIONES DE COLA
        Queue<Nodo> cola = new LinkedList<>();
        cola.offer(raiz); // PRIMERO SE AGREGA LA RAIZ A LA COLA PARA COMENZAR A BUSCAR

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            // CHEQUEAR SI EL CONTENIDO SE ENCUENTRA EN EL ACTUAL
            if (actual.getContenido() == contenido) {
                return actual;
            }
            // SI NO SE ENCUENTRA EN EL ACTUAL SE AGREGAN LOS HIJOS A LA COLA PARA LA PROX ITERACION
            if (actual.getHijoIzquierdo() != null) {
                cola.offer(actual.getHijoIzquierdo());
            }
            if (actual.getHijoDerecho() != null) {
                cola.offer(actual.getHijoDerecho());
            }
        }
        return null;
    }

    public boolean esVacio(){ return raiz == null; } // SI LA RAIZ ES NULL ENTONCES ESTA VACIO

    // METODOS PARA IMPRIMIR EL ARBOL
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        imprimirArbol(raiz, "", true, sb);
        return sb.toString();
    }
    private void imprimirArbol(Nodo nodo, String prefijo, boolean esHijoIzquierdo, StringBuilder sb) {
        if (nodo != null) {
            sb.append(prefijo);
            if (prefijo.isEmpty()) {
                sb.append("RAIZ-- ");
            } else if (esHijoIzquierdo) {
                sb.append("L-- ");
            } else {
                sb.append("R-- ");
            }
            sb.append(nodo);
            sb.append("\n");
            imprimirArbol(nodo.getHijoIzquierdo(), prefijo + (esHijoIzquierdo ? "|   " : "    "), true, sb);
            imprimirArbol(nodo.getHijoDerecho(), prefijo + (esHijoIzquierdo ? "|   " : "    "), false, sb);
        } else {
            System.out.println("ARBOL VACIO.");
        }
    }
}
