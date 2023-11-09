import java.util.Stack;

public class ArbolBinarioBusquedaConcreto extends ArbolBinarioBusqueda{
    // ATRIBUTOS
    private Nodo raiz;

    // CONSTRUCTOR
    public ArbolBinarioBusquedaConcreto(String nombreArbol) {
        super(nombreArbol);
    }

    // METODOS HEREDADOS
    @Override
    public void insertar(Nodo nodo) {
        try {
            // SI EL ARBOL ESTA VACIO SE INSERTA EL NODO COMO RAIZ
            if (esVacio()) {
                raiz = nodo;
            // SI NO ESTA VACIO RECORRER EL ARBOL HASTA ENCONTRAR EL LUGAR PARA INSERTAR
            } else {
                Nodo nodoActual = raiz;
                while (nodoActual != null) {
                    // SI EL CONTENIDO DEL NODO A INSERTAR ES MENOR AL QUE ESTAMOS EVALUANDO Y EL ACTUAL NO TIENE HIJO IZQUIERDO ENTONCES SE INSERTA COMO HIJO IZQUIERDO DE ESE
                    if (nodo.getContenido() < nodoActual.getContenido()) {
                        if (nodoActual.getHijoIzquierdo() == null) {
                            nodoActual.setHijoIzquierdo(nodo);
                            break;
                        } else {
                            // SINO SE SIGUE POR EL HIJO IZQUIERDO
                            nodoActual = nodoActual.getHijoIzquierdo();
                        }
                    // SI EL CONTENIDO DEL NODO A INSERTAR ES MENOR AL QUE ESTAMOS EVALUANDO Y EL ACTUAL NO TIENE HIJO IZQUIERDO ENTONCES SE INSERTA COMO HIJO IZQUIERDO DE ESE
                    } else if (nodo.getContenido() > nodoActual.getContenido()) {
                        if (nodoActual.getHijoDerecho() == null) {
                            nodoActual.setHijoDerecho(nodo);
                            break;
                        } else {
                            // SINO SE SIGUE POR EL HIJO DERECHO
                            nodoActual = nodoActual.getHijoDerecho();
                        }
                    } else {
                        throw new Exception("EL NODO CON CONTENIDO " + nodo.getContenido() +
                                " YA EXISTE EN EL ARBOL. NO PUEDEN HABER DUPLICADOS");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(Nodo nodo) {
        try{
            // COMENZAR A BUSCAR EL NODO DESDE RAIZ
            Nodo nodoActual = raiz;
            Nodo padreNodo = null;
            // EXTRAER CONTENIDO
            int contenido = nodo.getContenido();
            boolean esHijoIzquierdo = false;
            // ENCONTRAR EL NODO Y ASIGNARLO A NODO ACTUAL Y VER SI ES HIJO IZQUIERDO O NO
            while (nodoActual != null && nodoActual.getContenido() != contenido) {
                padreNodo = nodoActual;
                if (contenido < nodoActual.getContenido()) {
                    nodoActual = nodoActual.getHijoIzquierdo();
                    esHijoIzquierdo = true;
                } else {
                    nodoActual = nodoActual.getHijoDerecho();
                    esHijoIzquierdo = false;
                }
            }
            // SI ES NULL ENTONCES NO SE ENCUENTRA EN EL ARBOL
            if (nodoActual == null) {
                throw new Exception("EL NODO " + nodo + " NO ESTA EN EL ARBOL.");
            }
            // CASO 1: NODO A ELIMINAR ES UNA HOJA
            if (nodoActual.getHijoIzquierdo() == null && nodoActual.getHijoDerecho() == null) {
                if (nodoActual == raiz) { // SI ES LA RAIZ BORRARLA
                    raiz = null;
                } else if (esHijoIzquierdo) { // SI ES HIJO IZQUIERDO ELIMINARLO
                    padreNodo.setHijoIzquierdo(null);
                } else { // SI ES HIJO DERECHO ELIMINARLO
                    padreNodo.setHijoDerecho(null);
                }
            }
            // CASO 2: NODO A ELIMINAR TIENE SOLO 1 HIJO
            // HIJO IZQUIERDO
            else if (nodoActual.getHijoDerecho() == null) {
                if (nodoActual == raiz) {
                    raiz = nodoActual.getHijoIzquierdo(); // SI EL NODO A ELIMINAR ES LA RAIZ REEMPLAZARLA POR EL HIJO IZQUIERDO
                } else if (esHijoIzquierdo) {
                    padreNodo.setHijoIzquierdo(nodoActual.getHijoIzquierdo()); // SI ES UN NODO EN CUALQUIER POSICION, ELIMINAR Y REEMPLAZAR POR HIJO IZQUIERDO
                } else {
                    padreNodo.setHijoDerecho(nodoActual.getHijoIzquierdo()); // SINO REEMPLAZAR EL HIJO DERECHO DEL PADRE POR EL HIJO IZQUIERDO DEL NODO
                }
            // HIJO DERECHO
            } else if (nodoActual.getHijoIzquierdo() == null) {
                if (nodoActual == raiz) {
                    raiz = nodoActual.getHijoDerecho(); // SI EL NODO A ELIMINAR ES LA RAIZ REEMPLAZARLA POR EL HIJO DERECHO
                } else if (esHijoIzquierdo) {
                    padreNodo.setHijoIzquierdo(nodoActual.getHijoDerecho()); // SI ES UN NODO EN CUALQUIER POSICION, ELIMINAR Y REEMPLAZAR POR HIJO DERECHO
                } else {
                    padreNodo.setHijoDerecho(nodoActual.getHijoDerecho()); // SINO REEMPLAZAR EL HIJO DERECHO DEL PADRE POR EL HIJO DERECHO DEL NODO
                }
            }
            // CASO 3: NODO A ELIMINAR TIENE DOS HIJOS
            else {
                // OBTENER EL NODO SUCESOR CON METODO AUXILIAR
                Nodo sucesor = obtenerSucesor(nodoActual);
                // SI EL SUCESOR TIENE HIJO DERECHO SEGUIR BUSCANDO SUCESORES
                while (sucesor.getHijoDerecho() != null) {
                    sucesor = obtenerSucesor(sucesor);
                }
                // CAMBIAR EL NODO ACTUAL POR EL SUCESOR
                nodoActual.setContenido(sucesor.getContenido());
                // ELIMINAR SUCESOR PARA QUE NO SE REPITA
                eliminar(sucesor);
            }
            // SI EL NODO A ELIMINAR ES LA RAIZ ENTONCES REACOMODAR
            if (padreNodo == null) {
                raiz = nodoActual;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String inOrder() {
        // SB PARA ALMACENAR EL STRING
        StringBuilder resultado = new StringBuilder();
        // PILA PARA IR INGRESANDO LOS VALORES
        Stack<Nodo> pila = new Stack<>();
        // COMENZAR DESDE RAIZ
        Nodo nodoActual = raiz;
        // CARGAR NODOS DESDE LA IZQUIERDA A LA PILA HASTA QUE NO QUEDEN MAS
        while (nodoActual != null || !pila.isEmpty()) {
            while (nodoActual != null) {
                pila.push(nodoActual); // AGREGAR NODO A LA PILA
                nodoActual = nodoActual.getHijoIzquierdo(); // SIGUIENTE NODO IZQUIERDO
            }
            // CARGAR A NODO ACTUAL EL VALOR QUE SE ENCUENTRA EN LA PILA
            nodoActual = pila.pop();
            // OBTENER EL CONTENIDO DEL NODO Y CARGARLO AL SB
            resultado.append(nodoActual.getContenido()).append(" ");
            // UNA VEZ QUE RECORRIO LOS IZQUIERDOS DE UN NODO PASA AL DERECHO
            nodoActual = nodoActual.getHijoDerecho();
        }
        return resultado.toString().trim();
    }

    @Override
    public void destruir() {
        raiz = null;
        System.out.println("ARBOL DESTRUIDO.");
    }

    // METODOS AUXILIARES
    public boolean esVacio(){ return raiz == null; }

    private Nodo obtenerSucesor(Nodo nodo) {
        // ASIGNAR EL HIJO DERECHO DEL NODO COMO SUCESOR
        Nodo sucesor = nodo.getHijoDerecho();
        // SI EL HIJO IZQUIERDO NO ES NULO ENTONCES QUE ESE SEA EL SUCESOR
        while (sucesor.getHijoIzquierdo() != null) {
            sucesor = sucesor.getHijoIzquierdo();
        }
        return sucesor;
    }

    // METODOS PARA IMPRIMIR EL ARBOL
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
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (raiz != null) {
            imprimirArbol(raiz, "", true, sb);
        } else {
            sb.append("ARBOL VACIO.");
        }
        return sb.toString();
    }
}
