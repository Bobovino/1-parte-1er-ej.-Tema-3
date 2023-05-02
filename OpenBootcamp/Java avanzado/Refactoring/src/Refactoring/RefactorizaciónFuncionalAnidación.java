//        Aplica refactoring a cualquiera de los proyectos que se han ido tratando en el curso,
//        recuerda hacerte valer de las técnicas vistas en clase incluidos los patrones de diseño.

//CÓDIGO ORIGINAL
//package Refactoring;
//
//public class Main {
//    public static void main(String[] args) {
//        int [] numeros={12,23,45,1,9};
//        imprimeMayorYMenor(numeros);
//    }
//
//        public static void imprimeMayorYMenor(int []numeros){
//            int mayor=0;
//            int menor=numeros[0];
////          for (int i=0;i<numeros.length;i++){
////                if (mayor<numeros[i]){
////                    mayor=numeros[i];
////                }
////
////                if (menor>numeros[i]){
////                    menor=numeros[i];
////                }
////            }
//
//            System.out.println("Mayor: " +mayor + "\nMenor: " +menor);
//        }
//}

//CÓDIGO REFACTORIZADO con Operador Ternario y for acortado

//package Refactoring;
//
//public class Main {
//    public static void main(String[] args) {
//        int [] numeros={12,23,45,1,9};
//        imprimeMayorYMenor(numeros);
//    }
//
//    public static void imprimeMayorYMenor(int []numeros){
//            int mayor=0;
//            int menor=numeros[0];
//
//
//            for (int i:numeros){
//                mayor=mayor<i ? i :mayor;
//                menor=menor>i ? i :menor;
//                }
//
//            System.out.println("Mayor: " +mayor + "\nMenor: " +menor);
//    }
//
//}

//PROGRAMACIÓN FUNCIONAL

package Refactoring;

import java.util.Arrays;

public class RefactorizaciónFuncionalAnidación {
    public static void main(String[] args) {



        int [] numeros={12,23,45,1,9};
        imprimeMayorYMenor(numeros);
    }

    public static void imprimeMayorYMenor(int []numeros){
        int mayor= Arrays.stream(numeros).reduce(0,(a,b) -> a>b ? a :b);
        int menor=Arrays.stream(numeros).reduce(numeros[0],(a,b) -> a<b ? a :b);

        //Operador Ternario y for acortado
        for (int i:numeros){
            mayor=mayor<i ? i :mayor;
            menor=menor>i ? i :menor;
        }

        System.out.println("Mayor: " +mayor + "\nMenor: " +menor);
    }
    public static int ifAnidado1(){
        int valor1=10;
        int valor2=10;

//        if (valor1>valor2){
//            return valor1;
//        }else {
//            return valor2;
//        }

        //Extraer el valor de retorno
        if (valor1>valor2){
            return valor1;
        }
        return valor2;
        }
    }




