//Dada la función:
//public static String reverse(String texto) { }
//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".


public class StringsReverser {
    public static void main(String[] args) {
        System.out.println(reverse("Hi my name is Pablo"));
    }
    public static String reverse(String texto) {
        String textoI="";
        for (int i = texto.length()-1; i >=0; i--) {
            textoI+=texto.charAt(i);
        }
        return textoI;
    }
}