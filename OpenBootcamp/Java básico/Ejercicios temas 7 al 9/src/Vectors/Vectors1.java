//Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
// Elimina el 2o y 3er elemento y muestra el resultado final.
package Vectors;
import java.util.Vector;

public class Vectors1 {
    public static void main(String[] args) {
        Vector <Integer> vec = new Vector();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);

        vec.remove(1);
        vec.remove(1);

        System.out.println(vec);

    }
}
//Indica cuál es el problema de utilizar un Vector
// con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

//RESPUESTA:El programa se volvería lento porque se usaría memoria inútilmente