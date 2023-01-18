/* Crea un archivo JS que contenga las siguientes líneas
- Una función sin parámetros que devuelva siempre "true" */
function siempreTrue(){
    return true
}
console.log(siempreTrue())
//- Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado

async function asinc(){
    setTimeout(() => {
        console.log("Hola soy una promesa");
      }, "5000")
}

 asinc() 

//- Una función generadora de índices pares automáticos

function* indPares(){
    let a=0;
    while(true){
        yield a+=2
    }
}

const sumaDoble=indPares()
console.log(sumaDoble.next())
console.log(sumaDoble.next())
console.log(sumaDoble.next())
console.log(sumaDoble.next())