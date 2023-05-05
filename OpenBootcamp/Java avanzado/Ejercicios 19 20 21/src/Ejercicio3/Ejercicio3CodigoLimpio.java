//        ENUNCIADO3: Teniendo en cuenta lo visto en la sesión 21, utiliza un proyecto de los trabajados y límpialo.
//        Si encuentras código duplicado, elimínalo y realiza la minimización de las clases y métodos.


package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3CodigoLimpio {
    public static void main(String[] args) {

        //We handle user input exceptions and change name variables
        try{
            ArrayList<String> wordsList = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);

            //With the changes now we can enter more than 5 words
            System.out.println("Please enter words till you are done, then type Stop:");
            String input=scanner.nextLine();
            while(!input.equals("Stop")){
                wordsList.add(input);
                input=scanner.nextLine();
            }

            //Changing the for loop with a foreach instead
            System.out.println("The words you entered are:");
            for (String word: wordsList) {
                System.out.println(word);
            }
        }
           catch(Exception e){
               System.out.println("Error: " + e.getMessage());
        }

        //We can also extract the methods if necessary
    }
}