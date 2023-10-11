#include<stdio.h>
int main(){
	
	float par1,par2,h,area,b,a;
	
	printf("intoduzca el valor de la primera base :");
	scanf("%f",&par1);
	printf("intoduzca el valor de la segunda base:");
	scanf("%f",&par2);
	printf("intoduzca la altura:");
	scanf("%f",&h);
	
	a = par1 + par2;
	b = a / 2;
	area = h * b;
	
	printf("el area de su trapecio es:%.3f",area);
	return 0;
}
