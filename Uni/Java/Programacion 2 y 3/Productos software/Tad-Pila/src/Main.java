/***
Desarrollar un Producto de Software que cumpla con las siguientes características:
    -Diseñar y construir en Java un TAD (clase) tipo pila estática.
    -Diseñar y construir en Java un TAD (clase) tipo pila dinámica.
    -Diseñar y construir  en Java una clase tipo Main. (Modo gráfico)
*/

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        // INICIALIZACION DE SCANNERS
        Scanner scanner = new Scanner(System.in);
        // CREACION DE LAS PILAS
        Pila pE = null, pD = null;
        int opcionInicial;
        // VALIDADORES
        boolean creado1 = false;
        boolean creado2 = false;
        // MENU
        do{
            System.out.println("Ingrese una opcion: \n" +
                    "1. Pila Estatica \n" +
                    "2. Pila Dinamica \n" +
                    "3. Otras Operaciones \n" +
                    "4. Salir");
            opcionInicial = scanner.nextInt();
            switch (opcionInicial){
                case 1:
                    int opcionEstatica;
                    do{
                        System.out.println("MENU PILA \n" +
                            "Ingrese una opcion: \n" +
                            "1. Crear pila \n" +
                            "2. Apilar elemento \n" +
                            "3. Desapilar elemento \n" +
                            "4. Tope de pila \n" +
                            "5. Chequear si la pila esta vacia \n" +
                            "6. Chequear si la pila esta llena \n" +
                            "7. Imprimir \n" +
                            "8. Salir");
                        opcionEstatica = scanner.nextInt();
                        switch (opcionEstatica){
                            case 1: // CREAR PILA
                                if(!creado1){
                                    // Creacion pila estatica
                                    System.out.println("Ingrese el nombre de la pila estatica: ");
                                    String nombrePE = scanner.next();
                                    System.out.println("Ingrese el size de la pila estatica: ");
                                    int sizePE = scanner.nextInt();
                                    pE = new PilaEstatica(nombrePE, sizePE);
                                    creado1 = true;
                                } else {
                                    System.out.println("PILA " + pE.getNombrePila().toUpperCase() +" YA CREADA.");
                                }
                                break;
                            case 2: // APILAR ELEMENTO
                                System.out.println("INGRESE ELEMENTO A APILAR: ");
                                int elementoApilarPE = scanner.nextInt();
                                pE.apilarElemento(elementoApilarPE);
                                break;
                            case 3: // DESAPILAR
                                int desapilado = pE.desapilarElemento();
                                if (desapilado != 0){
                                    System.out.println("EL ELEMENTO " + desapilado + " HA SIDO DESAPILADO");
                                }
                                break;
                            case 4: // CHEQUEAR TOPE DE PILA
                                System.out.println("EL ELEMENTO TOPE ES: " + pE.topePila());
                                break;
                            case 5: // CHEQUEAR SI PILA ESTA VACIA
                                if(pE.pilaVacia()){
                                    System.out.println("PILA VACIA.");
                                    break;
                                } else {
                                    System.out.println("PILA NO VACIA.");
                                    break;
                                }
                            case 6: // CHEQUEAR SI PILA ESTA LLENA
                                if(((PilaEstatica) pE).pilaLlena()){
                                    System.out.println("PILA LLENA.");
                                    break;
                                } else {
                                    System.out.println("PILA CON ESPACIO.");
                                    break;
                                }
                            case 7: // IMPRIMIR PILA
                                System.out.println(pE);
                                break;
                            case 8: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINICPAL.");
                                break;
                            default:
                                System.out.println("OPCION NO VALIDA.");
                                break;
                        }
                    } while (opcionEstatica != 8);
                    break;
                case 2:
                    int opcionDinamica;
                    do{
                        System.out.println("MENU PILA \n" +
                                "Ingrese una opcion: \n" +
                                "1. Crear pila \n" +
                                "2. Apilar elemento \n" +
                                "3. Desapilar elemento \n" +
                                "4. Tope de pila \n" +
                                "5. Chequear si la pila esta vacia \n" +
                                "6. Imprimir \n" +
                                "7. Salir");
                        opcionDinamica = scanner.nextInt();
                        switch (opcionDinamica){
                            case 1: // CREAR PILA
                                if(!creado2){
                                    // Creacion pila dinamica
                                    System.out.println("Ingrese el nombre de la pila dinamica: ");
                                    String nombrePD = scanner.next();
                                    pD = new PilaDinamica(nombrePD);
                                    creado2 = true;
                                } else {
                                    System.out.println("PILA " + pD.getNombrePila().toUpperCase() +" YA CREADA.");
                                }
                                break;
                            case 2: // APILAR ELEMENTO
                                System.out.println("INGRESE ELEMENTO A APILAR: ");
                                int elementoApilarPD = scanner.nextInt();
                                pD.apilarElemento(elementoApilarPD);
                                break;
                            case 3: // DESAPILAR ELEMENTO
                                int desapilado = pD.desapilarElemento();
                                if (desapilado != 0){
                                    System.out.println("EL ELEMENTO " + desapilado + " HA SIDO DESAPILADO");
                                }
                                break;
                            case 4: // CHEQUEAR TOPE
                                System.out.println("EL ELEMENTO TOPE ES: " + pD.topePila());
                                break;
                            case 5: // CHEQUEAR SI PILA ESTA VACIA
                                if(pD.pilaVacia()){
                                    System.out.println("PILA VACIA.");
                                    break;
                                } else {
                                    System.out.println("PILA NO VACIA.");
                                    break;
                                }
                            case 6: // IMPRIMIR
                                System.out.println(pD);
                                break;
                            case 7: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINICPAL.");
                                break;
                            default:
                                System.out.println("OPCION NO VALIDA.");
                                break;
                        }
                    } while (opcionDinamica != 7);
                    break;
                case 3:
                    int opcionOtrasOperaciones;
                    // MENU OTRAS OPCIONES
                    do{
                        System.out.println("MENU OTRAS OPERACIONES\n" +
                                "Ingrese una opcion: \n" +
                                "1. Identificar de que pila es segun el elemento\n" +
                                "2. Imprimir todos los elementos y sus posiciones\n" +
                                "3. Salir");
                        opcionOtrasOperaciones = scanner.nextInt();
                        switch (opcionOtrasOperaciones){
                            case 1: // IDENTIFICAR DE QUE PILA ES UN ELEMENTO
                                System.out.println("INGRESE ELEMENTO A BUSCAR: ");
                                int elementoABucar = scanner.nextInt();
                                identificarPila(pE, pD, elementoABucar);
                                break;
                            case 2: // IMPRIMIR ELEMENTOS DE AMBAS PILAS
                                imprimirElementos(pE, pD);
                                break;
                            case 3: // SALIR
                                System.out.println("DE VUELTA AL MENU PRINICPAL.");
                                break;
                            default:
                                System.out.println("OPCION NO VALIDA.");
                                break;
                        }
                    } while (opcionOtrasOperaciones != 3);
                    break;
                case 4:
                    // FINALIZAR PROGRAMA
                    System.out.println("FIN DEL PROGRAMA.");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA.");
                    break;
            }
        } while (opcionInicial != 4);
    }

    public static void identificarPila(Pila pE, Pila pD, int elementoBusqueda){
        // CREAR TEMP DE CADA TIPO
        Stack<Integer> pilaTempEstatica = new Stack<>();
        Stack<Integer> pilaTempDinamica = new Stack<>();
        // INDICADORES SI ENCONTRO EL ELEMENTO EN ALGUNA DE LAS PILAS
        boolean encontradoEstatico = false;
        boolean encontradoDinamico = false;

        // PARTE ESTATICA
        while (!pE.pilaVacia()) {
            int elementoEstatica = pE.desapilarElemento();
            pilaTempEstatica.push(elementoEstatica);
            // BUSCAR ELEMENTO
            if (elementoEstatica == elementoBusqueda) {
                encontradoEstatico = true;
            }
        }
        while (!pilaTempEstatica.empty()) {
            pE.apilarElemento(pilaTempEstatica.pop()); // VOLVER A APILAR EN LA NORMAL
        }
        // PARTE DINAMICA
        while (!pD.pilaVacia()) {
            int elementoDinamica = pD.desapilarElemento();
            pilaTempDinamica.push(elementoDinamica);
            // BUSCAR ELEMENTO
            if (elementoDinamica == elementoBusqueda) {
                encontradoDinamico = true;
            }
        }
        while (!pilaTempDinamica.empty()) {
            pD.apilarElemento(pilaTempDinamica.pop()); // VOLVER A APILAR EN LA NORMAL
        }
        // RESULTADOS
        if (encontradoEstatico && encontradoDinamico) {
            System.out.println("EL ELEMENTO " + elementoBusqueda + " ESTA EN AMBAS PILAS.");
        } else if (encontradoEstatico) {
            System.out.println("EL ELEMENTO " + elementoBusqueda + " ESTA EN LA PILA ESTATICA.");
        } else if (encontradoDinamico) {
            System.out.println("EL ELEMENTO " + elementoBusqueda + " ESTA EN LA PILA DINAMICA.");
        } else {
            System.out.println("EL ELEMENTO " + elementoBusqueda + " NO ESTA EN NINGUNA PILA.");
        }
    }

    public static void imprimirElementos(Pila pE, Pila pD){
        // TEMPORALES DE CADA TIPO
        Stack<Integer> pilaTempEstatica = new Stack<>();
        Stack<Integer> pilaTempDinamica = new Stack<>();
        // CONTADORES
        int contadorEstatico = 0;
        int contadorDinamico = 0;

        // PARTE ESTATICA
        System.out.println("LISTA PILA ESTATICA");
        while(!pE.pilaVacia()){ // VACIAR PILA Y CARGAR A TEMP
            pilaTempEstatica.push(pE.desapilarElemento());
        }
        while (!pilaTempEstatica.empty()){ // VOLVER A CARGAR A NORMAL PERO CON CONTADOR PARA POSICIONES
            int elementoEstatica = pilaTempEstatica.pop();
            pE.apilarElemento(elementoEstatica);
            contadorEstatico++;
            System.out.println("ELEMENTO: " + elementoEstatica + " , ORDEN: " + contadorEstatico);
        }

        // PARTE DINAMICA
        while(!pD.pilaVacia()){
            pilaTempDinamica.push(pD.desapilarElemento()); // VACIAR PILA Y CARGAR A TEMP
        }
        System.out.println("\nLISTA PILA DINAMICA");
        while (!pilaTempDinamica.empty()){ // VOLVER A CARGAR A NORMAL PERO CON CONTADOR PARA POSICIONES
            int elementoDinamica = pilaTempDinamica.pop();
            pD.apilarElemento(elementoDinamica);
            contadorDinamico++;
            System.out.println("ELEMENTO: " + elementoDinamica + " , ORDEN: " + contadorDinamico);
        }
    }
}

