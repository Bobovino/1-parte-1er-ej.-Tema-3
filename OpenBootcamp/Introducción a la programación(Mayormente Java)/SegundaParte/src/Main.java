public class Main {
    public static void main(String[] args) {
        coche miCoche=new coche();
        System.out.println("Las puertas del coche son:"+ miCoche.masPuertas());
    }

    public static class coche{
        //Variable numérica que almacene el número de puertas que tiene(La inicializo con 4)
        int puertas=4;

        //Una función que incremente el número de puertas que tiene el coche.
        public  int masPuertas(){
           puertas++;
           return puertas;
        }
    }
}