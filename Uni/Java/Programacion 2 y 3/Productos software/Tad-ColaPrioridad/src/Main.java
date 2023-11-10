import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE NOMBRE PARA LA COLA: ");
        String nombreCola = scanner.next();
        Cola cola = new ColaConcreta(nombreCola);
        int opcion;
        do{
            System.out.println("MENU " + cola.getNombreCola().toUpperCase() + "\n" +
                    "1. Chequear si esta vacia\n" +
                    "2. Vaciar cola\n" +
                    "3. Largo de la cola\n" +
                    "4. Ver primer elemento de la cola\n" +
                    "5. Ver ultimo elemento de la cola\n" +
                    "6. Enfilar elemento\n" +
                    "7. Sacar elemento\n" +
                    "8. Imprimir\n" +
                    "9. Salir\n");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    if(cola.esVacio()){
                        System.out.println("LA LISTA ESTA VACIA");
                    } else {
                        System.out.println("LA LISTA NO ESTA VACIA");
                    }
                    break;
                case 2:
                    cola.vaciar();
                    break;
                case 3:
                    System.out.println("EL LARGO DE LA COLA ES DE: " + cola.largo());
                    break;
                case 4:
                    if(cola.verPrimero() != null){
                        System.out.println("EL PRIMER ELEMENTO DE LA COLA ES: " + cola.verPrimero());
                    }
                    break;
                case 5:
                    if(cola.verPrimero() != null) {
                        System.out.println("EL ULTIMO ELEMENTO DE LA COLA ES: " + cola.verUltimo());
                    }
                    break;
                case 6:
                    System.out.println("INGRESE EL CONTENIDO DEL NODO A ENFILAR: ");
                    int contenido = scanner.nextInt();
                    System.out.println("INGRESE LA PRIORIDAD DEL NODO A ENFILAR: ");
                    int prioridad = scanner.nextInt();
                    Nodo nodoAEnfilar = new Nodo(contenido, prioridad);
                    cola.enfilar(nodoAEnfilar);
                    break;
                case 7:
                    cola.sacar();
                    break;
                case 8:
                    System.out.println(cola);
                    break;
                case 9:
                    System.out.println("DE VUELTA AL MENU PRINCIPAL");
                    break;
                default:
                    System.out.println("INGRESE UNA OPCION CORRECTA");
                    break;
            }
        } while (opcion != 9);
    }
}
