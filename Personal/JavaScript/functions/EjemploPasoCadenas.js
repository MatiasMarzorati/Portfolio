// Cadenas y funciones en JS
// cadenas inmutables en JS (no se puede modificar su valor)

function cambiarValor(parametro){
    parametro = 'Adios';
}

// Llamamos a la funcion
let argumento = 'Hola';
console.log(`Antes funcion: ${argumento}`);
cambiarValor(argumento);
console.log(`Despues funcion: ${argumento}`);