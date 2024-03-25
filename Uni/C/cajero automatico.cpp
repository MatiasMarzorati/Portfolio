/*Hacer un programa que simule un cajero automatico con un saldo inicial de 1000*/
#include<stdio.h>



int main(){
		
	int saldo;
	int accion;
	int accion2;
	saldo = 1000;
	int agregado;
	int retiro;
	int dni;
	
	printf("Bienvenido! Por favor ingrese su tarjeta y su DNI: ");
	scanf("%i",&dni);

    int deseo = 1;

    while (deseo = 1) {

        if (dni = 45683171, 25705573, 46960571, 26146025) {


            switch (dni) {
                case 45683171:
                    printf("Bienvenido Matias\n");
                    break;
                case 25705573:
                    printf("Bienvenida Gisela\n");
                    break;
                case 46960571:
                    printf("Bienvenido Agus\n");
                    break;
                case 26146025:
                    printf("Bienvenido Federico\n");
                    break;
                default:
                    printf("Error en el DNI ingresado\n");
            }

            printf("Que desea hacer?\nIngrese 1 para consultar saldo\nIngrese 2 para retirar dinero \nIngrese 3 para depositar dinero a su cuenta \nIngrese 4 para mas opciones\nIngrese 5 para salir\nIngrese el numero de lo que quiere hacer:");
            scanf("%i", &accion);

            switch (accion) {
                case 2:
                    printf("Cuanto desea retirar de su cuenta?");
                    scanf("%i", &retiro);
                    if (retiro > saldo) {
                        puts("Saldo insuficiente");
                    } else {
                        saldo = saldo - retiro;
                        printf("El saldo restante en su cuenta es: %i", saldo);
                        printf("\nMuchas gracias por confiar con nosotros!");
                    };
                    break;
                case 3:
                    printf("Cuanto desea ingresar a su cuenta?");
                    scanf("%i", &agregado);
                    saldo = saldo + agregado;
                    printf("El saldo restante en su cuenta es: %i", saldo);
                    printf("\nMuchas gracias por confiar con nosotros!");;
                    break;
                case 5:
                    printf("Gracias por venir vuelva pronto!");
                    break;
                case 1:
                    printf("Su saldo actual es  de $ %i", saldo);
                    break;
                case 4:
                    printf("\nSi desea conocer su su Alias/CBU presione 1\nSi desea contactar a su Oficial de cuentas presione 2\nSi desea solicitar una Chequera ingrese 3\nIngrese el numero de lo que quiere hacer:");
                    scanf("%i", &accion2);

                    switch (accion2) {
                        case 1:
                            switch (dni) {
                                case 45683171:
                                    printf("\nAlias:M.MARZO\nCBU: 0080079854619700572190 ");
                                    break;
                                case 25705573:
                                    printf("\nAlias:LOL.VALORANT\nCBU: 0080079800432675297800");
                                    break;
                                case 46960571:
                                    printf("\nAlias:THEFOREST.WOT\nCBU: 0080079800453982157365");
                                    break;
                                case 26146025:
                                    printf("\nAlias:CSGO.CMS2018\nCBU: 0080079800240026845369");
                                    break;
                                default:
                                    printf("Error en el DNI ingresado");
                            };
                            break;
                        case 2:
                            printf("Puede contactar a su Oficial de Cuentas Axel Potarsky por medio de su numero Tel/Cel 11.5391.7631 o por su mail: axel.potarsky@bancodematias.com.ar");
                            break;
                        case 3:
                            printf("Su chequera ha sido solicitada, retirela por ventanilla en 10 dias habiles.");
                            break;
                        case 4:
                            printf("Usted tiene pre aprobado un prestamo de Hasta 250.000 pesos, para acceder a la misma contactese con su oficial de cuenta");
                            break;

                        case 5:
                            deseo = 0;
                            break;
                        default:
                            printf("ingrese un numero valido");
                    };
                    break;
                default:
                    printf("Por favor ingrese un numero valido");
            }
        } else {
            puts("Error en el DNI ingresado");
        }

    }
	return 0;
}
