// operadores incremento / decremento

let a,b,c;
a = 0;

//Pre-incremento
++a;
console.log(a);
//post incremento
a++;
console.log(a);

//pre decremento
--a;
console.log(a)

//Poste decremento
a--;
console.log(a);

/*

la diferencia entre el post y el pre, es q el pre lo hace en la linea y el 
y el post lo hace cuando se vuelva a usar la variable, yq eu el post deja la modificacion pendiente


*/

//ejemplo

a = 5;
b = 2;
c = ++a *b--;
//como b no llega a decrementarse la mutiplicacion es igual a 9*2
console.log(c)
console.log(b)
console.log(a)

