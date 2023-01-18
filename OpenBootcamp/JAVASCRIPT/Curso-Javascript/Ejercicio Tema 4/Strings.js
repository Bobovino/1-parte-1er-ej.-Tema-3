/* - Una cadena de texto con tu Nombre */
var nombre="Rodrigo"

/* - Otra cadena de texto con tu Apellido */
var apellido="Martínez"

/* - Una cadena de texto que se llame "estudiante" concatenando tu Nombre y tu Apellido con un espacio entre medias */
var estudiante=nombre.concat(" ",apellido)
console.log(estudiante)

/* - Una cadena de texto que se llame "estudianteMayus" que contenga la cadena estudiante pero todo en mayúsculas */
var estudianteMayus=estudiante.toUpperCase()
console.log(estudianteMayus)

/* - Una cadena de texto que se llame "estudianteMinus" que contenga la cadena estudiante pero todo en minúsculas */
var estudianteMinus=estudiante.toLowerCase()
console.log(estudianteMinus)

/* - Una variable que contenga el número de letras de la cadena "estudiante" contando los espacios */
var numLetras=estudiante.length
console.log(numLetras)

/* - Una variable que contenga la primera letra del Nombre */
var primeraNombre=nombre.charAt(0)
console.log(primeraNombre)

/* - Otra variable que contenga la última letra del Apellido */
var ultimaApellido=apellido.charAt(apellido.length-1)
console.log(ultimaApellido)

/* - Una cadena de texto que elimine los espacios de la variable "estudiante" */
var estSinEsp=estudiante.trim()
console.log(estSinEsp)
    
/* - Una variable booleana que diga si el Nombre está contenido en la variable "estudiante" */
var nombreEstContenido=estudiante.includes(nombre)
console.log(nombreEstContenido)