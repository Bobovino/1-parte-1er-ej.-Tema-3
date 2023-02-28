//Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
package RecorreArraysStrings;

public class RecorreBidimensional {
    public static void main(String[] args) {
        int [][]enteros={{4,3},{2,1}};
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j <enteros[i].length; j++) {
                System.out.println("Posición: "+i+","+j+" Valor: "+enteros[i][j]);
            }
        }
    }
}
