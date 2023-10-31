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
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean creado2 = false;
                    int OpC2 = -1;
                    while(OpC2 != 8){
                        imprimirMenu();
                        OpC2 = scanner.nextInt();
                        switch (OpC2){
                            case 1:
                                if(!creado2){
                                    System.out.println("ingrese el tamaño del conjunto\n");
                                    int n1 = scanner.nextInt();
                                    C2 = new Conjunto(n1);
                                    creado2 = true;
                                }else {
                                    System.out.println("El conjunto que desea crear ya existe\n");
                                }
                                break;
                            case 2:
                                int agregado;
                                System.out.println("Ingrese el elemento que desea agregar\n");
                                agregado = scanner.nextInt();
                                C2.agregar(agregado);

                                break;
                            case 3:
                                int eliminado;
                                System.out.println("Ingrese el elemento a eliminar");
                                eliminado = scanner.nextInt();
                                C2.eliminar(eliminado);

                                break;
                            case 4:
                                C2.vacio();
                                break;
                            case 5:
                                int buscado;
                                System.out.println("Ingrese el elemento que desea buscar\n");
                                buscado = scanner.nextInt();
                                if (C2.pertenece(buscado)){
                                    System.out.println("Elemento encontrado");
                                }
                                else{
                                    System.out.println("Elemento no pertenece");
                                }
                                break;
                            case 6:
                                C2.vaciar();
                                break;
                            case 7:
                                C2.imprimir();
                                break;
                            case 8:
                                System.out.println("Saliendo al menu anterior");
                                break;
                        }
                    }
                    break;
                case 3:
                    int opcionMenu3 = -1;
                    int elemento;

                    while(opcionMenu3 != 4) {
                        System.out.println("Por favor ingrese que desea hacer:\n" +
                                "1- Unir los dos conjuntos\n" +
                                "2- Que elemenmtos tienen en comun\n" +
                                "3- Esta incluido?\n" +
                                "4- Salir\n");
                        opcionMenu3 = scanner.nextInt();
                        switch (opcionMenu3) {
                            case 1:


                                int tamanioUnion = C1.getContador() + C2.getContador();
                                Conjunto union = new Conjunto(tamanioUnion);


                                for (int i = 0; i < C1.getContador(); i++) {

                                    elemento = C1.getConj()[i];
                                    if (!union.pertenece(elemento)) {
                                        union.agregar(elemento);
                                    }
                                }

                                for (int i = 0; i < C2.getContador(); i++) {

                                    elemento = C2.getConj()[i];
                                    if (!union.pertenece(elemento)) {
                                        union.agregar(elemento);
                                    }
                                }

                                union.imprimir();

                                break;

                            case 2:
                                int tamanioInterseccion;
                                if (C1.getContador() < C2.getContador()) {
                                    tamanioInterseccion = C1.getContador();
                                } else {
                                    tamanioInterseccion = C2.getContador();
                                }


                                Conjunto interseccion = new Conjunto(tamanioInterseccion);
                                for (int i = 0; i < C1.getContador(); i++) {

                                    elemento = C1.getConj()[i];
                                    if (C2.pertenece(elemento)) {
                                        interseccion.agregar(elemento);
                                    }
                                }

                                interseccion.imprimir();


                                break;

                            case 3:

                                int opcionMini;
                                System.out.println("Ingrese si desea saber si: \n" +
                                        "1- C1 esta incluido en C2\n" +
                                        "2- C2 esta incluido en C1\n");
                                opcionMini = scanner.nextInt();
                                if (opcionMini == 1) {
                                    incluido(C1, C2);
                                } else if (opcionMini == 2) {
                                    incluido(C2, C1);
                                }
                                break;

                            case 4:
                                System.out.println("Saliendo al menu principal");
                                break;
                        }
                    }
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

    public static void incluido(Conjunto A, Conjunto B){
        int elemento, contador = 0;
        int tope = A.getContador();

        for(int i = 0; i < A.getContador(); i++){
            elemento = A.getConj()[i];
            if(B.pertenece(elemento)){
                contador++;
            }
        }

        if(contador == tope){
            System.out.println("El primer conjunto pertenece al segundo");
        }
        else {
            System.out.println("El primer conjunto noo pertenece en el segundo");
        }
    }
}
