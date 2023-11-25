// Funciones recursivas
// Imprimir 3, 2, 1
function funcionRecursiva(numero){
    // Caso Base 
    if(numero == 1)
        console.log(numero);
    else{
        console.log(numero);
        funcionRecursiva(numero - 1);
    }
}

// Llamamos la funcion recursiva
funcionRecursiva(3);