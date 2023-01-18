/* Crea un nuevo fichero JS que contenga las siguientes líneas
- Una función que admita un parámetro "num", y devuelva una lista con esa cantidad 
de números de la secuencia de Fibonacci (Por ejemplo: num = 6 => Resultado [1, 1, 2, 3, 5, 8])
- Ejecuta la depuración de VSCode para visualizar la ejecución de la función */


const num =6

function Fibonacci(num){
    sumador=1;
    acumulado=[1,1]
    if (num===1){
        this.acumulado=[1] 
        return this.acumulado
    }
    if (num===2)return acumulado
    
    for (let i = 2; i < num; i++) {
        sumador =acumulado[i-1]+acumulado[i-2];
        acumulado=[...acumulado,sumador]
      }
    return acumulado
}

console.log("Resultado: " +Fibonacci(num))