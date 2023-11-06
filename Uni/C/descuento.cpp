#include<stdio.h>

int main(){

	float a;
	
	printf("introduzca el prcio de su productos para aplicarle el descuento:");
	scanf("%f",&a);
	
	float mul = a * 0.85;
	printf("el precio con el descuento aplicado es:%.2f", mul);
	return 0;
}

