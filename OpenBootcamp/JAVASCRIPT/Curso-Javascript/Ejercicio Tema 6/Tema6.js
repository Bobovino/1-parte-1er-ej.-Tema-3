/* Crea un archivo JS que contenga las siguientes líneas
- Una variable que contenga la lista de la compra (mínimo 5 elementos) */
let lista=['Leche','Huevos','Pan','Pavo','Cereales']
/* - Modifica la lista de la compra y añádele "Aceite de Girasol" */
lista.push("Aceite de Girasol")
console.log(lista)
/* - Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol" */
lista.splice(5,1)
console.log(lista)
/* - Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha) */

let pelisFav=[
    { 
    titulo:"El Señor de los Anillos:El retorno del rey",
    director:"Peter Jackson",
    fecha: new Date(2003,11,18,0,0,0,0)
    },
    { 
    titulo:"Esencia de mujer",
    director:"Martin Brest",
    fecha:new Date(1993,2,13,0,0,0,0)
    },
    { 
    titulo:"Kimi no na wa",
    director:"Makoto Shinkai",
    fecha:new Date(2016,7,27,0,0,0,0)
    },
]
console.log(pelisFav)

/* - Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter) */
const pelisNuevas=pelisFav.filter(pelisFav => pelisFav.fecha > new Date(2010, 0, 1))
console.log(pelisNuevas)

/* - Una nueva lista que contenga los directores de la lista de películas original (utilizando map) */
const listaDirectores=pelisFav.map(pelisFav =>{return pelisFav.director})
console.log(listaDirectores)

/* - Una nueva lista que contenga los títulos de la lista de películas original (utilizando map) */
const listaTitulos=pelisFav.map(pelisFav =>{return pelisFav.titulo})
console.log(listaTitulos)

/* - Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat) */
const listaConcat=listaTitulos.concat(listaDirectores)
console.log(listaConcat)

/* - Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación) */
const listaProp=[...listaDirectores,...listaTitulos]
console.log(listaProp)