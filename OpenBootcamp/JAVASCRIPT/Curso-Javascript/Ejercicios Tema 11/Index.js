//Crea un nuevo fichero JS que contenga las siguientes líneas
//- Una clase llamada "Estudiante" que tenga:
class Estudiante{

    //- Una variable llamada nombre
    //- Otra variable lista llamada asignaturas con 3 asignaturas: Javascript, HTML, CSS
    _nombre="Rodrigo"
    _asignaturas=["Javascript","HTML","CSS"]

    //- Un método "obtenDatos" que devuelva un objeto con las propiedades nombre y asignaturas
    obtenDatos(){
        return this._nombre,this._asignaturas
    }
}

//- Crea una nueva instancia de "Estudiante"
estudiante=new Estudiante()

//- Haz la llamada al método obtenDatos
console.log(estudiante.obtenDatos())






