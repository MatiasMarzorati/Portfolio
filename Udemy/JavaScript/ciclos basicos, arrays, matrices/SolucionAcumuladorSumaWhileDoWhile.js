// Sumar los primeros 5 numeros (do while)
let numero = 1, maximo = 5, acumuladorSuma = 0;
do{
    // Imprimimos lo que va a sumar
    console.log(`${acumuladorSuma} + ${numero}`);

    // Realizamos la suma parcial
    acumuladorSuma += numero;
    console.log(acumuladorSuma);
    numero++;
} while(numero <= maximo);
console.log(acumuladorSuma);