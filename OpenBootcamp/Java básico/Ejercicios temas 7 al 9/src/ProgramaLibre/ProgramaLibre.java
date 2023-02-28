//Sorpréndenos creando un programa de tu elección que utilice InputStream,
// PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
package ProgramaLibre;

import java.io.*;
import java.util.*;

public class ProgramaLibre {
    public static void main(String[] args) {
        String file="src/ProgramaLibre/Diccionario.dat";
        Diccionario diccionario = new Diccionario();
        Scanner scanner = new Scanner(System.in);

        try {
        //Abrimos el fichero
        InputStream fichero = new FileInputStream(file);
        BufferedInputStream ficheroBuffered=new BufferedInputStream(fichero);
        byte[] datos = ficheroBuffered.readAllBytes();
        fichero.close();
        ficheroBuffered.close();

        //Imprimimos en pantalla el diccionario actual
        for(byte dato:datos){
            System.out.print((char)dato);
        }


        System.out.println("Bienvenido al diccionario: ");
        while(true) {
            System.out.println("Introduzca la palabra que quiere introducir al diccionario(Si ha terminado escriba !exit)");
            String entrada = scanner.nextLine();
            if (entrada.equals("!exit")) {
                break;
            }
            System.out.println("Introduzca las acepciones de la palabra");
            String acepcion = scanner.nextLine();
            diccionario.agregarPalabra(entrada,acepcion);

        }
        while(true){
            System.out.println("Introduca alguna curiosidad al diccionario (Si ha terminado escriba !exit)");
            String curiosidad = scanner.nextLine();

            if (curiosidad.equals("!exit")) {
                break;
            }
            diccionario.agregarCuriosidad(curiosidad);
        }

        //Escribimos en el fichero
            ObjectOutputStream objectOutputStream = null;
            PrintWriter printWriter = null;

            try {
                // Escribir el objeto Diccionario en un archivo binario
                objectOutputStream = new ObjectOutputStream(new FileOutputStream("diccionario.dat"));
                objectOutputStream.writeObject(diccionario);

//                // Escribir el contenido del archivo en formato de texto plano
//                printWriter = new PrintWriter(new FileWriter("diccionario.txt"));
//                printWriter.println("Palabras en el diccionario:");
//                for (String palabra : diccionario.palabras.keySet()) {
//                    printWriter.println(palabra);
//                    String significados = diccionario.palabras.get(palabra);
//                    for (String significado : significados) {
//                        printWriter.println("- " + significado);
//                    }
//                    printWriter.println();
//                }
                System.out.println("El diccionario ha sido guardado en el archivo diccionario.dat y diccionario.txt.");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (printWriter != null) {
                    printWriter.close();
                }
            }

        //Salimos del programa
        System.out.println("Gracias por utilizar el diccionario.");
        diccionario.mostrarPalabras();

        }catch(Exception e){
            System.out.println("Error del programa"+e.getMessage());
        }

}
}

    class Diccionario implements Serializable{
        //Declaramos variables
         HashMap<String, String> palabras;
         ArrayList<String> curiosidades;

        //Constructor
        public Diccionario() {
            this.curiosidades = new ArrayList<>();
            this.palabras = new HashMap<>();
        }

        public void agregarPalabra(String palabra, String significado) {
            palabras.put(palabra,significado);
        }

        public void agregarCuriosidad(String curiosidad){
            curiosidades.add(curiosidad);
        }

//        public ArrayList<String> buscarPalabra(String palabra) throws Exception {
//            ArrayList<String> significados = palabras.get(palabra);
//            if (significados == null) {
//                throw new Exception("La palabra " + palabra + " no se encuentra en el diccionario.");
//            } else {
//                return significados;
//            }
//        }

        public void mostrarPalabras() {
            System.out.println("Palabras en el diccionario:");
            for (String palabra : palabras.keySet()) {
                System.out.println(palabra);
            }
            System.out.println("Curiosidades en el diccionario:");
            for (String curiosidad : curiosidades) {
                System.out.println(curiosidad);
            }
        }
    }