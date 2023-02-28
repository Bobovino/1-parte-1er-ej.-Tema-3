//Crea un ArrayList de tipo String, con 4 elementos.
// Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento
package ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<String>();
        lista.add("Elemento1");
        lista.add("Elemento2");
        lista.add("Elemento3");
        lista.add("Elemento4");

        LinkedList<String> listaLinked=new LinkedList<String>(lista);

        System.out.println("Arraylist: ");
        for(String elemento:lista){
            System.out.println(elemento+" ");
        }

        System.out.println("\nLinkedlist: ");
        for(String elemento:listaLinked){
            System.out.println(elemento+" ");
        }


    }
}
