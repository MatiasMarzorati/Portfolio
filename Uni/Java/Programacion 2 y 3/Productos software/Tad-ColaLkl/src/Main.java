/***
Desarrollar un Producto de Software que cumpla con las siguientes características.
    -Diseñar y Construir en Java un TAD de nombre COLALKL. Implementar con el TAD LinkedList.
    -Que cumpla con las buenas prácticas de documentación de código.
    -Que presente un menú de trabajo tipo gráfico de barras.
    -El TAD se basará en las especificaciones para colas presentes en la lámina  8 de esta presentación.
    -Probar y verificar que la implementación se encuentra trabajando correctamente.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // INICIALIZACION DE SCANNER
        Scanner scanner = new Scanner(System.in);
        // CREACION DE CONJUNTOS
        Cola cV = null, cL = null;
        // VALIDADORES
        boolean creado1 = false;
        boolean creado2 = false;
        // MENU
        int opcionPrincipal;
        do{
            System.out.println("MENU COLAS\n" +
                    "1. Cola Vector\n" +
                    "2. Cola LinkedList\n" +
                    "3. Salir\n");
            opcionPrincipal = scanner.nextInt();
            switch (opcionPrincipal){
                case 1:
                    int opcionVector;
                    do{
                        System.out.println("MENU \n" +
                                "1. Crear cola\n" +
                                "2. Chequear si esta vacia\n" +
                                "3. Vaciar cola\n" +
                                "4. Largo de la cola\n" +
                                "5. Ver primer elemento de la cola\n" +
                                "6. Ver ultimo elemento de la cola\n" +
                                "7. Enfilar elemento\n" +
                                "8. Sacar elemento\n" +
                                "9. Imprimir\n" +
                                "10. Salir\n");
                        opcionVector = scanner.nextInt();
                        switch (opcionVector){
                            case 1: // CREAR COLA
                                if(!creado1){
                                    // COLA VECTOR
                                    System.out.println("INGRESE EL NOMBRE PARA LA COLA VECTOR");
                                    String nombreCV = scanner.next();
                                    System.out.println("INGRESE EL SIZE PARA LA COLA VECTOR");
                                    int size = scanner.nextInt();
                                    cV = new ColaVector(nombreCV, size);
                                    creado1 = true;
                                } else {
                                    System.out.println("COLA " + cV.getNombreCola().toUpperCase() + " YA CREADA.");
                                }
                                break;
                            case 2: // CHEQUEAR SI ESTA VACIO
                                if(cV.esVacio()){
                                    System.out.println("LA COLA ESTA VACIA");
                                } else {
                                    System.out.println("LA COLA NO ESTA VACIA");
                                }
                                break;
                            case 3: // VACIAR LA COLA
                                cV.vaciar();
                                break;
                            case 4: // CHEQUEAR EL LARGO DE LA COLA
                                System.out.println("EL LARGO DE LA COLA ES DE: " + cV.largo());
                                break;
                            case 5: // VER EL PRIMER ELEMENTO DE LA COLA
                                System.out.println("EL PRIMER ELEMENTO DE LA COLA ES: " + cV.verPrimero());
                                break;
                            case 6: // VER EL ULTIMO ELEMENTO DE LA COLA
                                System.out.println("EL ULTIMO ELEMENTO DE LA COLA ES: " + cV.verUltimo());
                                break;
                            case 7: // ENFILAR ELEMENTO
                                System.out.println("INGRESE EL ELEMENTO A ENFILAR: ");
                                int elementoAEnfilar = scanner.nextInt();
                                cV.enfilar(elementoAEnfilar);
                                break;
                            case 8: // SACAR UN ELEMENTO DE LA COLA
                                cV.sacar();
                                break;
                            case 9: // IMPRIMIR COLA
                                System.out.println(cV);
                                break;
                            case 10: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINCIPAL");
                                break;
                            default:
                                System.out.println("INGRESE UNA OPCION CORRECTA");
                                break;
                        }
                    } while (opcionVector != 10);
                    break;
                case 2:
                    int opcionLinked;
                    do{
                        System.out.println("MENU \n" +
                                "1. Crear cola\n" +
                                "2. Chequear si esta vacia\n" +
                                "3. Vaciar cola\n" +
                                "4. Largo de la cola\n" +
                                "5. Ver primer elemento de la cola\n" +
                                "6. Ver ultimo elemento de la cola\n" +
                                "7. Enfilar elemento\n" +
                                "8. Sacar elemento\n" +
                                "9. Imprimir\n" +
                                "10. Salir\n");
                        opcionLinked = scanner.nextInt();
                        switch (opcionLinked){
                            case 1: // CREAR COLA
                                if(!creado2){
                                    // COLA LINKED LIST
                                    System.out.println("INGRESE EL NOMBRE PARA LA COLA LINKED");
                                    String nombreCL = scanner.next();
                                    cL = new ColaLinked(nombreCL);
                                    creado2 = true;
                                } else {
                                    System.out.println("COLA " + cL.getNombreCola().toUpperCase() + " YA CREADA.");
                                }
                                break;
                            case 2: // CHEQUEAR SI LA COLA ESTA VACIA
                                if(cL.esVacio()){
                                    System.out.println("LA COLA ESTA VACIA");
                                } else {
                                    System.out.println("LA COLA NO ESTA VACIA");
                                }
                                break;
                            case 3: // VACIAR COLA
                                cL.vaciar();
                                break;
                            case 4: // CHEQUEAR EL LARGO DE LA COLA
                                System.out.println("EL LARGO DE LA COLA ES DE: " + cL.largo());
                                break;
                            case 5: // VER EL PRIMER ELEMENTO DE LA COLA
                                System.out.println("EL PRIMER ELEMENTO DE LA COLA ES: " + cL.verPrimero());
                                break;
                            case 6: // VER EL ULTIMO ELEMENTO DE LA COLA
                                System.out.println("EL ULTIMO ELEMENTO DE LA COLA ES: " + cL.verUltimo());
                                break;
                            case 7: // ENFILAR ELEMENTO
                                System.out.println("INGRESE EL ELEMENTO A ENFILAR: ");
                                int elementoAEnfilar = scanner.nextInt();
                                cL.enfilar(elementoAEnfilar);
                                break;
                            case 8: // SACAR ELEMENTO DE LA COLA
                                cL.sacar();
                                break;
                            case 9: // IMPRIMIR
                                System.out.println(cL);
                                break;
                            case 10: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINCIPAL");
                                break;
                            default:
                                System.out.println("INGRESE UNA OPCION CORRECTA");
                                break;
                        }
                    } while (opcionLinked != 10);
                    break;
                case 3: // FINALIZAR
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println("INGRESE UNA OPCION CORRECTA");
            }
        } while (opcionPrincipal != 3);
    }
}