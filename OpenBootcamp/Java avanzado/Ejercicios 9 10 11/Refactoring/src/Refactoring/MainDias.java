package Refactoring;
//    public boolean hoyEsDomingo() {
//        boolean isDomingo=hoyEsDiaNumero(7);
//        if(isDomingo){
//            System.out.println("Es domingo");
//        }
//    }
//
//    public static boolean hoyEsDiaNumero(int numero) {
//        if (numero==7){
//            return true;
//        }
//        return false;
//    }
public class MainDias {
    public static void main(String[] args) {
        hoyEsDomingo(5);
    }

        public static void hoyEsDomingo(int numero){
            boolean isDomingo = (numero == 7 ? true : false);
            if (isDomingo) {
                System.out.println("Es domingo");
            }else {
                System.out.println("No es domingo");
            }


        }
}

