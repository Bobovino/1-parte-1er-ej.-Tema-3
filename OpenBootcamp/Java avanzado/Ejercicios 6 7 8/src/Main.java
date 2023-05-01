//Identifica las características principales de los patrones de diseño más conocidos,
// indica para qué valen y un caso de uso para cada uno de ellos.

// Los patrones de diseño se pueden clasificar en:
// Creacionales:Solucionan problemas de creación/instanciación de objetos.Ej: Singleton,Builder.
// Estructurales:Solucionan problemas de composición de objetos dentro de un sistema. Ej: Adapter, Facade.
// Comportamiento:Abordan los problemas de interacción entre objetos.Ej:Observer, State.


//Crea una pequeña aplicación implementando el patrón Singleton y demuestra que,
// efectivamente, no crea instancias nuevas. Puedes tomar la sesión 7 como referencia.
public class Main {
    public static void main(String[] args) {

        Singleton singleton=Singleton.getInstance();
        singleton.setContador(15);
        System.out.println(singleton.getContador());
        System.out.println(singleton);

        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton2.getContador());
        System.out.println(singleton2);


    }
}