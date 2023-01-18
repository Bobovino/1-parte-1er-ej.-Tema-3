/* Crea un archivo llamado objetos.js que contenga las siguientes líneas
- Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador) */
const datosPers={
    Nombre:"Rodrigo",
    Apellido:"Martínez Tabernero",
    Edad:25,
    Altura:"188cm",
    eresDesarrollador:true
}
console.log(datosPers)

/* - Una variable que obtenga tu edad a partir del objeto anterior */
const miEdad=datosPers.Edad
console.log(miEdad)

/* - Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s */
const tresAmigos=[
    datosPers,
    {
        Nombre:"Natalia",
        Apellido:"Juan",
        Edad:47,
        Altura:"170cm",
        eresDesarrollador:false 
    },
    {
        Nombre:"Raquel",
        Apellido:"García",
        Edad:25,
        Altura:"160cm",
        eresDesarrollador:false
    }
]
console.log(tresAmigos)
/* - Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor */

const amigosOrdenados=tresAmigos.sort((a, b) => b.Edad - a.Edad)
console.log(amigosOrdenados)