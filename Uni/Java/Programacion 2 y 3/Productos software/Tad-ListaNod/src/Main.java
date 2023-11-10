/***
Desarrollar un Producto de Software que cumpla con las siguientes características.
    -Diseñar y Construir en Java un TAD de nombre LISTANOD.  Implementar con el TAD nodo.
    -Que cumpla con las buenas prácticas de documentación de código.
    -Que presente un menú de trabajo tipo gráfico de barras.
    -El TAD se basará en las especificaciones para listas presentes en la lámina  8 de esta presentación.
    -Probar y verificar que la implementación se encuentra trabajando correctamente.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear listas
        System.out.println("INGRESE NOMBRE PARA LA LISTA 1: ");
        String nombreLista1 = scanner.next();
        Lista lista1 = new ListaConcreta(nombreLista1);
        System.out.println("INGRESE NOMBRE PARA LA LISTA 2: ");
        String nombreLista2 = scanner.next();
        Lista lista2 = new ListaConcreta(nombreLista2);
        // Menu
        int opcionPrincipal;
        do{
            System.out.println("MENU PRINICIPAL\n" +
                    "1. Metodos lista 1\n" +
                    "2. Metodos lista 2\n" +
                    "3. Metodos entre listas\n" +
                    "4. Salir\n");
            opcionPrincipal = scanner.nextInt();
            switch (opcionPrincipal){
                case 1:
                    int opcion1;
                    do{
                        imprimirMenu(lista1);
                        opcion1 = scanner.nextInt();
                        switch (opcion1){
                            case 1: // LOCALIZAR NODO POR CONTENIDO
                                System.out.println("INGRESE EL CONTENIDO DEL NODO A LOCALIZAR: ");
                                int contenidoALocalizar = scanner.nextInt();
                                lista1.localizar(contenidoALocalizar);
                                break;
                            case 2: // INSERTAR NODO
                                System.out.println("INGRESE EL CONTENIDO DEL NODO A INSERTAR: ");
                                int contenidoNodo = scanner.nextInt();
                                Nodo nodoAInsertar = new Nodo(contenidoNodo);
                                lista1.insertar(nodoAInsertar);
                                break;
                            case 3: // INSERTAR NODO EN POSICION
                                System.out.println("INGRESE EL CONTENIDO DEL NODO A INSERTAR: ");
                                int contenidoNodoAInsertar = scanner.nextInt();
                                Nodo nodoAInsertarEnPosicion = new Nodo(contenidoNodoAInsertar);
                                System.out.println("INGRESE LA POSICION PARA INSERTAR EL NODO: ");
                                int posicionAInsertar = scanner.nextInt();
                                lista1.insertarEnPosicion(posicionAInsertar, nodoAInsertarEnPosicion);
                                break;
                            case 4: // ELIMINAR NODO SEGUN POSICION
                                System.out.println("INGRESE LA POSICION DEL NODO A ELIMINAR: ");
                                int posicionNodoAEliminar = scanner.nextInt();
                                lista1.eliminar(posicionNodoAEliminar);
                                break;
                            case 5: // ORDERNAR LISTA
                                System.out.println("LISTA DE ELEMENTOS ORDENADA: " + lista1.ordenarElementos());
                                break;
                            case 6: // COPIAR LISTA
                                System.out.println("LISTA DE ELEMENTOS COPIADA: " + lista1.copiarLista());
                                break;
                            case 7: // DIVIDIR LISTA EN POSICION
                                System.out.println("INGRESE LA POSICION PARA DIVIDIR LA LISTA: ");
                                int posicionADividir = scanner.nextInt();
                                lista1.dividirLista(posicionADividir);
                                break;
                            case 8: // IMPRIMIR LISTA
                                System.out.println(lista1);
                                break;
                            case 9: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINCIPAL");
                                break;
                            default:
                                System.out.println("INGRESE UNA OPCION CORRECTA");
                                break;
                        }
                    } while (opcion1 != 9);
                    break;
                case 2:
                    int opcion2;
                    do{
                        imprimirMenu(lista2);
                        opcion2 = scanner.nextInt();
                        switch (opcion2){
                            case 1: // LOCALIZAR NODO POR CONTENIDO
                                System.out.println("INGRESE EL CONTENIDO DEL NODO A LOCALIZAR: ");
                                int contenidoALocalizar = scanner.nextInt();
                                lista2.localizar(contenidoALocalizar);
                                break;
                            case 2: // INSERTAR NODO
                                System.out.println("INGRESE EL CONTENIDO DEL NODO A INSERTAR: ");
                                int contenidoNodo = scanner.nextInt();
                                Nodo nodoAInsertar = new Nodo(contenidoNodo);
                                lista2.insertar(nodoAInsertar);
                                break;
                            case 3: // INSERTAR NODO EN POSICION
                                System.out.println("INGRESE EL CONTENIDO DEL NODO A INSERTAR: ");
                                int contenidoNodoAInsertar = scanner.nextInt();
                                Nodo nodoAInsertarEnPosicion = new Nodo(contenidoNodoAInsertar);
                                System.out.println("INGRESE LA POSICION PARA INSERTAR EL NODO: ");
                                int posicionAInsertar = scanner.nextInt();
                                lista2.insertarEnPosicion(posicionAInsertar, nodoAInsertarEnPosicion);
                                break;
                            case 4: // ELIMINAR NODO
                                System.out.println("INGRESE LA POSICION DEL NODO A ELIMINAR: ");
                                int posicionNodoAEliminar = scanner.nextInt();
                                lista2.eliminar(posicionNodoAEliminar);
                                break;
                            case 5: // ORDENAR LISTA
                                System.out.println("LISTA DE ELEMENTOS ORDENADA: " + lista2.ordenarElementos());
                                break;
                            case 6: // COPIAR LISTA
                                System.out.println("LISTA DE ELEMENTOS COPIADA: " + lista2.copiarLista());
                                break;
                            case 7: // DIVIDIR LISTA EN POSICION
                                System.out.println("INGRESE LA POSICION PARA DIVIDIR LA LISTA: ");
                                int posicionADividir = scanner.nextInt();
                                lista2.dividirLista(posicionADividir);
                                break;
                            case 8: // IMPRIMIR LISTA
                                System.out.println(lista2);
                                break;
                            case 9: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINCIPAL");
                                break;
                            default:
                                System.out.println("INGRESE UNA OPCION CORRECTA");
                                break;
                        }
                    } while (opcion2 != 9);
                    break;
                case 3:
                    int opcion3;
                    do{
                        System.out.println("MENU DE AMBAS LISTAS\n"+
                                "1. Unir lista 1 con lista 2\n"+
                                "2. Unir lista 2 con lista 1\n"+
                                "3. Salir\n");
                        opcion3 = scanner.nextInt();
                        switch (opcion3){
                            case 1: // UNIR AMBAS LISTAS (LA UNO PRIMERO)
                                unirListas(lista1, lista2);
                                break;
                            case 2: // UNIR AMBAS LISTAS (LA DOS PRIMERO)
                                unirListas(lista2, lista1);
                                break;
                            case 3: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINCIPAL");
                                break;
                            default:
                                System.out.println("INGRESE UNA OPCION CORRECTA");
                                break;
                        }
                    } while (opcion3 != 3);
                    break;
                case 4: // FINALIZAR
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println("INGRESE UNA OPCION CORRECTA");
                    break;
            }
        } while (opcionPrincipal != 4);
    }

    public static void imprimirMenu(Lista lista){
        System.out.println("MENU " + lista.getNombreLista().toUpperCase() + "\n" +
                "1. Localizar un elemento\n" +
                "2. Insertar un elemento\n" +
                "3. Insertar un elemento en una posicion determinada\n" +
                "4. Eliminar un elemento\n" +
                "5. Ordenar los elementos\n" +
                "6. Copiar la lista\n" +
                "7. Dividir una lista\n" +
                "8. Imprimir\n" +
                "9. Salir\n");
    }

    public static void unirListas(Lista lista1, Lista lista2) {
        try {
            if (lista1 != null && lista2 != null) {
                ListaConcreta listaUnida = new ListaConcreta("Union");
                // INSERTAR ELEMENTOS DE LA PRIMERA LISTA EN LA LISTA UNIDA
                Nodo current1 = lista1.getPrimero();
                while (current1 != null) {
                    listaUnida.insertar(new Nodo(current1.getContenido()));
                    current1 = current1.getSiguiente();
                }
                // INSERTAR ELEMENTOS DE LA SEGUNDA LISTA EN LA LISTA UNIDA
                Nodo current2 = lista2.getPrimero();
                while (current2 != null) {
                    listaUnida.insertar(new Nodo(current2.getContenido()));
                    current2 = current2.getSiguiente();
                }
                System.out.println("Listas unidas: " + listaUnida);
            } else {
                throw new Exception("UNA DE LAS LISTAS ESTÁ VACÍA. NO SE REALIZA LA UNION.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
