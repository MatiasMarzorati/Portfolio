#include<stdio.h>
int main(){
	
	float a;
	
	printf("intoduzca su anterior salario:");
	scanf("%f",&a);
	
	float fin;
	fin = a * 1.25;
	printf("el precio con el descuento aplicado es:%.2f", fin);
	
	
	return 0;
}
