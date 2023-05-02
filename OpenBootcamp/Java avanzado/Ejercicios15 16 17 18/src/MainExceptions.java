//ENUNCIADO: En estos ejercicios vas a trabajar sobre las excepciones, tendréis que implementar:
//  1.Arithmetic exception tratando de hacer una división entre dos números, siendo el que divide 0.
//  2.ArrayIndexOutOfBounds con un array de 6 elementos, tratando de alcanzar el noveno elemento.
//  3.FileNotFound tratando de acceder a un fichero que no existe.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args){

        //Ejercicio 1
        try {
            double divisionCero = 8 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: "+e.toString());
        }

        //Ejercicio 2
        try {
            char[] cIndexOutOfBounds = {'a', 'b', 'c', 'd', 'e', 'f'};
            System.out.println(cIndexOutOfBounds[8]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.toString());
        }

        //Ejercicio 3


        try {
            // Creando el objeto archivo y su Scanner
            File archivo = new File("archivo.txt");
            Scanner scanner = new Scanner(archivo);

        } catch (FileNotFoundException e) {
                    System.out.println("Error: File not found.");
        }


    }
}




