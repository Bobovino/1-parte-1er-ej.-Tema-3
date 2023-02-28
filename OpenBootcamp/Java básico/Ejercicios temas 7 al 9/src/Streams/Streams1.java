//Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

package Streams;

import java.io.*;

public class Streams1 {
    public static void main(String[] args) {
        //Si queremos introducir el nombre de los ficheros lo podemos hacer con Scanner
        String fileIn="src/Streams/Mangas.txt";
        String fileOut="src/Streams/CopiaMangas.txt";
        copiaFicheros(fileIn,fileOut);
        }

    public static void copiaFicheros(String fileIn,String fileOut){
        try {
            //Abrimos el fichero original
            InputStream fichero = new FileInputStream(fileIn);
            BufferedInputStream ficheroBuffered=new BufferedInputStream(fichero);
            byte[] datos = ficheroBuffered.readAllBytes();
            fichero.close();
            ficheroBuffered.close();

            //Imprimimos en pantalla
            for(byte dato:datos){
                System.out.print((char)dato);
            }

            //Copiamos el fichero
            PrintStream ficheroOut=new PrintStream(fileOut);
            ficheroOut.write(datos);
            ficheroOut.close();

        }catch(Exception e){
            System.out.println("No se encontró el fichero/No se pudo leer el fichero: "+ e.getMessage());
    }
}
}
