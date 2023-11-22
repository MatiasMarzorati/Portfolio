// Paso por referencia JS
// Objetos (array) se pasan por referencia

function cambiarValor(parametro){
    parametro[0] = 20;
}

// Llamamos a la funcion
let arreglo = [10];
console.log(`Antes funcion: ${arreglo[0]}`);
cambiarValor(arreglo);
console.log(`Despues funcion: ${arreglo[0]}`);