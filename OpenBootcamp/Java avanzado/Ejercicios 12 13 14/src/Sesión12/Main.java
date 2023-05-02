package Sesión12;
import java.util.Hashtable;

//ENUNCIADO 1: Siguiendo las normas de nombrado de la sesión 12, diseña dos funciones limpias.

//ENUNCIADO 2: Teniendo en cuenta lo visto en la sesión 14, comenta uno de los proyectos sobre
// los que hayas trabajado en el curso, si ya contenían comentarios y has detectado algún comentario
// sobrante, confuso, redundante o mal descrito, indícalo.



public class Main {
    public static void main(String[] args) {
        printTill(3);
        createVariables();
    }

    /**
     * Primera función limpia
     * @param number Número hasta el que quieres imprimir desde el uno
     * @throws Exception No tiene control de excepciones
     * @return Result Es de tipo void
     * @see campus.openbootcamp.com
     * @since 3/5/2023 (european date)
     */
    public static void printTill(int number){
        for(int i=1;i<= number;i++) {
            System.out.println(i);
        }
    }
    //Ejemplos de como usar la notación húngara
    public static void createVariables(){
        int[] aNumeros = {1,2,3,4,5,6,7,8};
        boolean bEsDeDia=false;
        char cLetra='a';
        double dValor=1.21d;
        Hashtable<String,Integer> hUsuarios=new Hashtable<String,Integer>();
    }
    //enum is a set of named constants. Later can be called like this: nEstado.INICIAL, nEstado.EN_PROGRESO.
    enum nEstado{
        INICIAL,
        EN_PROGRESO;
    }
}