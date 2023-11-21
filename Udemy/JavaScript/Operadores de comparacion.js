// operadores de comparacion

let a = 5;
let b = '5';
 
console.log(a)
console.log(b)

// operadores de tipo ==
// hace comparacion de contenido y si tiene que hacer una convercion lo hace
console.log("a es iguel de contenido a b (a == b)? -->" , a == b);

// operadores de  tipo ===
/// hace la comparacion de contenido y de tipo de variable, al se uno de tipo numero y el otro cadena seria false
console.log("A es identico de valor y tipo de valor que B? -->", a === b);

// String interpolation

console.log(`A = ${a} es igual a ${b}? --> ${a === b}`);

// operadores de tipo !=
// convierte valor si es necesario

console.log("Es distinto el valor de a que el de b? -->", a != b);

// operadores de tipo !==
//no conviert el vaor si es necsario

console.log("Es exactamente distinta la variable a que la variable b? -->", a!== b);

// operador menor/ mayor que

console.log(`${a} es menor que ${b}?---> ${a < b}`);

// operador menor/mayor o igua que

console.log(`${a} es menor o igual que ${b}?---> ${a <= b}`)