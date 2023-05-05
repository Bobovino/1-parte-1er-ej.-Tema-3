
//        ENUNCIADO1: Implementa Args en uno de los proyectos que se han ido trabajando y aplica las buenas prácticas
//        que se han visto en la sesión 19:

//        -Podemos compilar la clase EjercicioArgsDemo, convertirla a jar, pasarle argumentos desde la línea de comandos(o en
//        este caso desde la configuración) y ejecutarla.

package Ejercicios1y2;

public class Ejercicio1ArgsDemo {
    public static void main(String[] args) {
        System.out.println(args.length);

        for (String arg : args)
        System.out.println(arg);

    }
}
