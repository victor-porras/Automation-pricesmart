export function getElementoAleatorio(arreglo) {
    //valor aleatorio entre 0  y 1

    let aleatorio = Math.random();
    //Multiplica la cantidad de elementos por valor
    aleatorio = Math.floor(aleatorio * arreglo.length);

    return arreglo[aleatorio];

}