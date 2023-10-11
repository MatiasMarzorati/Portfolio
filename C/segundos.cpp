#include<stdio.h>
int main(){

	int segs,mins,horas,a,b,total;
	
	printf("intoduzca las horas :");
	scanf("%i",&horas);
	printf("intoduzca los minutos :");
	scanf("%i",&mins);
	printf("intoduzca los segundos :");
	scanf("%i",&segs);

	a = horas * 3600;
	b = mins * 60;
	total = a + b + segs;
	printf("la totalidad de segundos es:%i",total);
	
return 0;
}
