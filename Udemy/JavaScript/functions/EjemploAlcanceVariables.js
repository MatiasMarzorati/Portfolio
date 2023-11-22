// Alcance de Variables en JS

let variableGlobal = 5;

// Modificar el valor
variableGlobal = 10;

// Definicion funcion
function miFuncion(variableLocal){
    console.log(variableLocal);
    // Modificamos la variable global
    variableGlobal = 20;
    // No podemos redefinir una variable global (let)
    //let variableGlobal = 30;
}

// Llamamos la funcion
miFuncion(variableGlobal);

