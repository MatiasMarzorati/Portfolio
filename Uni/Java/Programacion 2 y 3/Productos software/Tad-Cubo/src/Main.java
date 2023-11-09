/***
 Desarrollar un Producto de Software que cumpla con las siguientes características:
-Que instancie los objetos del TAD CUBO.
-Que cumpla con las buenas prácticas de documentación de código.
-Que en un menú permita ejecutar todas las operaciones del TAD CUBO.
-Probar que todas las operaciones del menú funcionan correctamente.
-Diseñe una operación que sea capaz de realizar todas las sumatorias de los datos contenidos para cada capa de profundidad
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // INICIALIZAR SCANNER
        Scanner scanner = new Scanner(System.in);
        // INICIALIZAR VARIABLES
        int opcion, a, b, c, valor;
        // VALIDADOR
        boolean creado = false;
        Cubo cubo = null;
        do {
            imprimirMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: // CREAR CUBO
                    if(!creado){
                        // INPUT DATOS DEL CUBO
                        System.out.println("INGRESE LAS DIMENSIONES DEL CUBO:");
                        a = inputAncho();
                        b = inputAlto();
                        c = inputLargo();
                        // CREACION DEL CUBO
                        cubo = new CuboConcreto(a, b, c);
                        creado = true;
                    } else {
                        System.out.println("CUBO YA CREADO.");
                    }
                    break;
                case 2: // AGREGAR VALOR SEGUN COORDENADAS
                    System.out.println("INGRESE COORDENADAS PARA AGREGAR");
                    a = inputAncho();
                    b = inputAlto();
                    c = inputLargo();
                    System.out.print("INGRESE EL VALOR: ");
                    valor = scanner.nextInt();
                    cubo.cargar(a, b, c, valor);
                    break;
                case 3: // MODIFICAR VALOR SEGUN COORDENADAS
                    System.out.println("INGRESE COORDENADAS PARA MODIFICAR");
                    a = inputAncho();
                    b = inputAlto();
                    c = inputLargo();
                    System.out.print("INGRESE EL NUEVO VALOR: ");
                    valor = scanner.nextInt();
                    cubo.modificar(a, b, c, valor);
                    break;
                case 4: // ANULAR VALOR SEGUN POSICION
                    System.out.println("INGRESE LAS COORDENADAS PARA ANULAR");
                    a = inputAncho();
                    b = inputAlto();
                    c = inputLargo();
                    cubo.anular(a, b, c);
                    break;
                case 5: // OBTENER VALOR SEGUN COORDENADAS
                    System.out.println("INGRESAR LAS COORDENADAS PARA OBTENER EL VALOR");
                    a = inputAncho();
                    b = inputAlto();
                    c = inputLargo();
                    System.out.println("VALOR: " + cubo.valor(a, b, c));
                    break;
                case 6: // IMPRIMIR POSICIONES NULAS DEL CUBO
                    cubo.nulos();
                    break;
                case 7: // IMPRIMIR CUBO
                    System.out.println(cubo);
                    break;
                case 8: // SUMATORIA POR CAPAS
                    cubo.sumatoria();
                    break;
                case 9: // FINALIZAR
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (opcion != 9);
        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("MENU:\n" +
                "1. Crear cubo\n" +
                "2. Cargar valor\n" +
                "3. Modificar valor\n" +
                "4. Anular valor\n" +
                "5. Obtener valor\n" +
                "6. Mostrar posiciones nulas\n" +
                "7. Mostrar el contenido del cubo\n" +
                "8. Obtener sumatoria de los valores del cubo\n" +
                "9. Salir");
    }

    public static int inputAncho(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ANCHO: ");
        while (!scanner.hasNextInt()) {
            System.out.println("INGRESE UN NUMERO VALIDO PARA EL ANCHO.");
            scanner.next(); // Limpiar el buffer del scanner
            System.out.print("ANCHO: ");
        }
        return scanner.nextInt();
    }

    public static int inputAlto(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ALTO: ");
        while (!scanner.hasNextInt()) {
            System.out.println("INGRESE UN NUMERO VALIDO PARA EL ALTO.");
            scanner.next(); // Limpiar el buffer del scanner
            System.out.print("ALTO: ");
        }
        return scanner.nextInt();
    }

    public static int inputLargo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("LARGO: ");
        while (!scanner.hasNextInt()) {
            System.out.println("INGRESE UN NUMERO VALIDO PARA EL LARGO.");
            scanner.next(); // Limpiar el buffer del scanner
            System.out.print("LARGO: ");
        }
        return scanner.nextInt();
    }
}