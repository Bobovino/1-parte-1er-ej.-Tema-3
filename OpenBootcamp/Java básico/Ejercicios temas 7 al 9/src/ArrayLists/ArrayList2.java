//Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
// A continuación, con otro bucle, recórrelo y elimina los numeros pares.
// Por último, vuelve a recorrerlo y muestra el ArrayList final.
// Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
package ArrayLists;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            lista.add(i+1);
        }
        System.out.println(lista);

        for (int i = lista.size()-1; i >=0 ; i--) {
            if(lista.get(i)%2==0){
                lista.remove(i);
            }
        }
        System.out.println(lista);

    }
}
