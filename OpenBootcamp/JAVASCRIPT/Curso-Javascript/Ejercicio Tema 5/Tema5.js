/* - Una variable que contenga tu altura en centímetros (entero) */
var alturaCm=new Number(190);

/* - Una variable que contenga tu altura en metros (número de coma flotante) */
var alturaMt=new Number(1.90);

/* - Una variable que contenga tu peso en kilogramos (número de coma flotante) */
var pesoKg=new Number(85.5)

//- Una variable que contenga tu altura en metros redondeada hacia arriba
var alturaArriba=Math.ceil(alturaMt)
console.log(alturaArriba)
//- Una variable que contenga tu peso en kilogramos redondeado hacia abajo
var pesoAbajo=Math.floor(pesoKg)
console.log(pesoAbajo)

//- Una variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" es igual al máximo valor que se puede obtener en Javascript
var maximoValor= Number.MAX_VALUE+1==Number.MAX_VALUE
console.log(maximoValor)