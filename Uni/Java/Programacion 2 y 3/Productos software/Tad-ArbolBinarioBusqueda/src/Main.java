/***
CONSIGNA
Desarrollar una implementación en Java que cumpla con los siguientes métodos y Requerimientos:
- Creación y construcción de un ABB.
- Inserción de Nodos, después de que el Árbol ya se encuentre creado y construido.
- Eliminación de un Nodo en un ABB.
- Recorrido InOrden del ABB. Imprimir la secuencia del recorrido.
- Destruir el ABB.
 ***/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // INICIALIZACION DE SCANNER
        // ATRIBUTOS
        int opcion;
        boolean creado = false; // VALIDADOR DE CREACION DE ARBOL
        ArbolBinarioBusqueda arbol = null;
        // MENU
        do{
            imprimirMenu(); // METODO STATIC PARA IMPRIMIR MENU
            opcion = scanner.nextInt();
            switch (opcion){
                case 1: // CREAR ARBOL
                    if(!creado){
                        // INPUT DATOS
                        System.out.println("INGRESE EL NOMBRE DEL ARBOL:");
                        String nombre = scanner.next();
                        arbol = new ArbolBinarioBusquedaConcreto(nombre);
                        creado = true; // AL CREAR EL ARBOL SE PONE COMO TRUE PARA INDICAR QUE FUE CREADO
                    } else {
                        System.out.println("ARBOL " + arbol.getNombreArbol().toUpperCase() + " YA CREADO.");
                    }
                    break;
                case 2: // INGRESAR UN NODO
                    if(creado){
                        // INPUT
                        System.out.println("INGRESAR EL CONTENIDO DEL NODO A INGRESAR: ");
                        int contenido = scanner.nextInt();
                        Nodo nodoAIngresar = new Nodo(contenido);
                        arbol.insertar(nodoAIngresar);
                    } else {
                        System.out.println("NO SE PUEDE INGRESAR NODOS SI NO HAY UN ARBOL CREADO");
                    }
                    break;
                case 3: // ELIMINAR UN NODO
                    if(creado){
                        // INPUT
                        System.out.println("INGRESAR EL CONTENIDO DEL NODO A ELIMINAR: ");
                        int contenido = scanner.nextInt();
                        Nodo nodoAEliminar = new Nodo(contenido);
                        arbol.eliminar(nodoAEliminar);
                    } else {
                        System.out.println("NO SE PUEDE ELIMINAR NODOS SI NO HAY UN ARBOL CREADO");
                    }
                    break;
                case 4: // IMPRIMIR INORDER
                    if(creado){
                        System.out.println("EL RECORRIDO INORDER ES: " + arbol.inOrder());
                    } else {
                        System.out.println("NO HAY UN ARBOL CREADO. NO SE PUEDE HACER EL INORDER");
                    }
                    break;
                case 5: // DESTRUIR ARBOL
                    if(creado){
                        arbol.destruir();
                    } else {
                        System.out.println("NO SE PUEDE DESTRUIR UN ARBOL QUE NO SE CREO.");
                    }
                    break;
                case 6: // IMPRIMIR ARBOL
                    if(creado){
                        System.out.println(arbol);
                    } else {
                        System.out.println("NO SE PUEDE IMPRIMIR UN ARBOL QUE NO EXISTE");
                    }
                    break;
                case 7:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println("OPCION INVALIDA.");
                    break;
            }
        } while (opcion != 7);
    }

    public static void imprimirMenu(){
        System.out.println("MENU: \n" +
                "1. Crear arbol\n" +
                "2. Insertar nodo\n" +
                "3. Eliminar nodo\n" +
                "4. Mostrar inOrder\n" +
                "5. Destruir arbol\n" +
                "6. Imprimir arbol\n" +
                "7. Salir\n");
    }
}
