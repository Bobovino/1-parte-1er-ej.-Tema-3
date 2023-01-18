

public class Main {
    public static void main(String[] args) {

        //PRIMERA PARTE DEL EJERCICIO
        //Creo un número aleatorio entre 100 y -100
        int min=-100;
        int max=100;

        int numeroIf=(int)Math.floor(Math.random()*(max-min+1)+min);

        //Condicional
        if(numeroIf<0){
            System.out.println("El número "+numeroIf+" generado aleatoriamente es negativo");
        }
        else if(numeroIf==0){
            System.out.println("El número "+numeroIf+" generado aleatoriamente es igual a cero");
        }
        else{ System.out.println("El número "+numeroIf+" generado aleatoriamente es positivo");
                }
        //SEGUNDA PARTE DEL EJERCICIO
        int numeroWhile=0;
        while(numeroWhile<3){
            System.out.println("El valor de la variable incremental numeroWhile es: "+numeroWhile);
            numeroWhile++;
        }
        //TERCERA PARTE DEL EJERCICIO
        int numeroDoWhile=0;
        do{
            System.out.println("El valor de la variable incremental numeroDoWhile es: "+numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile<=0);

        //CUARTA PARTE DEL EJERCICIO
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("El valor de la variable incremental numeroFor es: "+ numeroFor);
        }
        //QUINTA PARTE DEL EJERCICIO

        String estacion="Atocha";
        switch (estacion) {
            case "Verano":
                System.out.println("Estamos en " + estacion);
                break;
            case "Primavera":
                System.out.println("Estamos en " + estacion);
                break;
            case "Otoño":
                System.out.println("Estamos en " + estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en " + estacion);
                break;
            default:
                System.out.println("La variable introducida " + estacion + " no es una estación del año");
                break;
        }
    }
}