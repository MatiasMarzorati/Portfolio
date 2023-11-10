/***
Desarrollar un Producto de Software que cumpla con las siguientes características.
    -Diseñar y Construir en Java un TAD de nombre LISTATOT.  Implementar con el TAD LinkedList.
    -Que cumpla con las buenas prácticas de documentación de código.
    -Que presente un menú de trabajo tipo gráfico de barras.
    -El TAD se basará en las especificaciones para listas presentes en la lámina  8 de esta presentación.
    -Probar y verificar que la implementación se encuentra trabajando correctamente.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // INICIALIZAR SCANNER
        Scanner scanner = new Scanner(System.in);
        // VALIDADORES
        boolean creado1 = false;
        boolean creado2 = false;
        // CREACION DE LISTAS
        Lista lista1 = null, lista2 = null;
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
                            case 1: // CREAR LISTA
                                if(!creado1){
                                    // Crear listas
                                    System.out.println("INGRESE NOMBRE PARA LA LISTA 1: ");
                                    String nombreLista1 = scanner.next();
                                    lista1 = new ListaConcreta(nombreLista1);
                                    creado1 = true;
                                } else {
                                    System.out.println("YA SE CREO LA LISTA " + lista1.getNombreLista().toUpperCase() + ".");
                                }
                                break;
                            case 2: // LOCALIZAR ELEMENTO EN LA LISTA
                                System.out.println("INGRESE EL ELEMENTO A LOCALIZAR: ");
                                int elementoALocalizar = scanner.nextInt();
                                lista1.localizar(elementoALocalizar);
                                break;
                            case 3: // INSERTAR ELEMENTO
                                System.out.println("INGRESE EL ELEMENTO A INSERTAR: ");
                                int elementoAInsertarSinPosicion = scanner.nextInt();
                                lista1.insertar(elementoAInsertarSinPosicion);
                                break;
                            case 4: // INGRESAR ELEMENTO EN UNA POSICION
                                System.out.println("INGRESE EL ELEMENTO A INSERTAR: ");
                                int elementoAInsertar = scanner.nextInt();
                                System.out.println("INGRESE LA POSICION DEL ELEMENTO A INSERTAR: ");
                                int posicionAInsertar = scanner.nextInt();
                                lista1.insertarEnPosicion(posicionAInsertar, elementoAInsertar);
                                break;
                            case 5: // ELIMINAR UN ELEMENTO SEGUN LA POSICION
                                System.out.println("INGRESE LA POSICION DEL ELEMENTO A ELIMINAR: ");
                                int elementoAEliminar = scanner.nextInt();
                                lista1.eliminar(elementoAEliminar);
                                break;
                            case 6: // LISTA DE ELEMENTOS ORDENADOS
                                System.out.println("LISTA DE ELEMENTOS ORDENADA: " + lista1.ordenarElementos());
                                break;
                            case 7: // COPIAR LISTA
                                System.out.println("LISTA DE ELEMENTOS COPIADA: " + lista1.copiarLista());
                                break;
                            case 8: // DIVIDIR LA LISTA EN UNA POSICION DETERMINADA
                                System.out.println("Ingrese la posición para dividir la lista: ");
                                int posicionADividir = scanner.nextInt();
                                lista1.dividirLista(posicionADividir);
                                break;
                            case 9: // IMPRIMIR LISTA
                                System.out.println(lista1);
                                break;
                            case 10: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINCIPAL");
                                break;
                            default:
                                System.out.println("INGRESE UNA OPCION CORRECTA");
                                break;
                        }
                    } while (opcion1 != 10);
                    break;
                case 2:
                    int opcion2;
                    do{
                        imprimirMenu(lista2);
                        opcion2 = scanner.nextInt();
                        switch (opcion2){
                            case 1: // CREAR LISTA
                                if(!creado2){
                                    System.out.println("INGRESE NOMBRE PARA LA LISTA 2: ");
                                    String nombreLista2 = scanner.next();
                                    lista2 = new ListaConcreta(nombreLista2);
                                    creado2 = true;
                                } else {
                                    System.out.println("YA SE CREO LA LISTA " + lista2.getNombreLista().toUpperCase() + ".");
                                }
                                break;
                            case 2: // LOCALIZAR ELEMENTO EN LA LISTA
                                System.out.println("INGRESE EL ELEMENTO A LOCALIZAR: ");
                                int elementoALocalizar = scanner.nextInt();
                                lista2.localizar(elementoALocalizar);
                                break;
                            case 3: // INSERTAR ELEMENTO
                                System.out.println("INGRESE EL ELEMENTO A INSERTAR: ");
                                int elementoAInsertarSinPosicion = scanner.nextInt();
                                lista2.insertar(elementoAInsertarSinPosicion);
                                break;
                            case 4: // INSERTAR ELEMENTO EN UNA POSICION
                                System.out.println("INGRESE EL ELEMENTO A INSERTAR: ");
                                int elementoAInsertar = scanner.nextInt();
                                System.out.println("INGRESE LA POSICION DEL ELEMENTO A INSERTAR: ");
                                int posicionAInsertar = scanner.nextInt();
                                lista2.insertarEnPosicion(posicionAInsertar, elementoAInsertar);
                                break;
                            case 5: // ELIMINAR ELEMENTO SEGUN LA POSICION
                                System.out.println("INGRESE LA POSICION DEL ELEMENTO A ELIMINAR: ");
                                int elementoAEliminar = scanner.nextInt();
                                lista2.eliminar(elementoAEliminar);
                                break;
                            case 6: // LISTA DE ELEMENTOS ORDENADOS
                                System.out.println("LISTA DE ELEMENTOS ORDENADA: " + lista2.ordenarElementos());
                                break;
                            case 7: // COPIAR LISTA
                                System.out.println("LISTA DE ELEMENTOS COPIADA: " + lista2.copiarLista());
                                break;
                            case 8: // DIVIDIR LISTA SEGUN POSICION
                                System.out.println("Ingrese la posición para dividir la lista: ");
                                int posicionADividir = scanner.nextInt();
                                lista2.dividirLista(posicionADividir);
                                break;
                            case 9: // IMPRIMIR LISTA
                                System.out.println(lista2);
                                break;
                            case 10: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINCIPAL");
                                break;
                            default:
                                System.out.println("INGRESE UNA OPCION CORRECTA");
                                break;
                        }
                    } while (opcion2 != 10);
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
                            case 1: // UNIR LISTAS (PRIMERO LA UNO)
                                unirListas(lista1, lista2);
                                break;
                            case 2:
                                // UNIR LISTAS (PRIMERO LA DOS)
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
        System.out.println("MENU \n" +
                "1. Crear lista\n" +
                "2. Localizar un elemento\n" +
                "3. Insertar un elemento\n" +
                "4. Insertar un elemento en una posicion determinada\n" +
                "5. Eliminar un elemento\n" +
                "6. Ordenar los elementos\n" +
                "7. Copiar la lista\n" +
                "8. Dividir una lista\n" +
                "9. Imprimir\n" +
                "10. Salir\n");
    }
    public static void  unirListas(Lista lista1, Lista lista2) {
        try {
            if (lista1 != null && lista2 != null) { // UNIR SI LAS 2 LISTAS TIENEN ELEMENTOS
                Lista listaUnida = new ListaConcreta("Unida");
                // INSERTAR TODOS LOS ELEMENTOS DE LA PRIMERA LISTA A LA LISTA UNIDA
                for (Integer elemento : lista1.getLista()) {
                    listaUnida.insertar(elemento);
                }
                // INSERTAR TODOS LOS ELEMENTOS DE LA SEGUNDA LISTA A LA LISTA UNIDA
                for (Integer elemento : lista2.getLista()) {
                    listaUnida.insertar(elemento);
                }
                System.out.println("Listas unidas: " + listaUnida);
            } else {
                throw new Exception("UNA DE LAS LISTAS ESTA VACIA NO SE AGREGAN ELEMENTOS.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
