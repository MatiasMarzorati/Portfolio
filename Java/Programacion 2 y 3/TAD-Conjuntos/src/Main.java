import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conjunto C1 = null;
        Conjunto C2 = null;


        int OpcionInicio = -1;

        while (OpcionInicio != 4){
            System.out.println("Que desea hacer? \n" +
                    "1- Menu conjunto 1 \n" +
                    "2- Menu Conjunto 2 \n" +
                    "3-Menu Compartido  \n" +
                    "4-Salir \n");
            OpcionInicio = scanner.nextInt();

            switch (OpcionInicio){
                case 1:

                    int OpC1 = -1;
                    boolean creado1 = false;
                    while(OpC1 != 8){

                        imprimirMenu();
                        OpC1 = scanner.nextInt();
                        switch (OpC1){

                            case 1:

                                if(!creado1){
                                    System.out.println("ingrese el tamaño del conjunto\n");
                                    int n1 = scanner.nextInt();
                                    C1 = new Conjunto(n1);
                                    creado1 = true;
                                }else {
                                    System.out.println("El conjunto que desea crear ya existe\n");
                                }
                                break;
                            case 2:
                                int agregado;
                                System.out.println("Ingrese el elemento que desea agregar\n");
                                agregado = scanner.nextInt();
                                C1.agregar(agregado);

                                break;
                            case 3:
                                int eliminado;
                                System.out.println("Ingrese el elemento a eliminar");
                                eliminado = scanner.nextInt();
                                C1.eliminar(eliminado);

                                break;
                            case 4:
                                C1.vacio();
                                break;
                            case 5:
                                int buscado;
                                System.out.println("Ingrese el elemento que desea buscar\n");
                                buscado = scanner.nextInt();
                                if (C1.pertenece(buscado)){
                                    System.out.println("Elemento encontrado");
                                }
                                else{
                                    System.out.println("Elemento no pertenece");
                                }
                                break;
                            case 6:
                                C1.vaciar();
                                break;
                            case 7:
                                C1.imprimir();
                            case 8:
                                System.out.println("Saliendo al menu anterior");
                        }
                    }
                    break;
                case 2:
                    boolean creado2;
                    int OpC2 = -1;
                    while(OpC2 != 8){
                        imprimirMenu();
                        OpC2 = scanner.nextInt();
                        switch (OpC2){
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                        }
                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Muchas gracias por usarnos");
                    break;
            }

        }

    }
    public static void imprimirMenu(){
        System.out.println("Ingrese que desea hacer\n" +
                "1- Crear conjunto \n" +
                "2- Agregar elemento\n" +
                "3- Eliminar elemento \n" +
                "4- Verificar si es vacio \n" +
                "5- Buscar elemento si pertenece al conjunto\n" +
                "6- Vacio?\n" +
                "7- Imprimir \n" +
                "8- Salir \n");

    }
}
