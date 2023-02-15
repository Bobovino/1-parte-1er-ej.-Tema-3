
//Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

public class Main {
    public static void main(String[] args) {
       double resultado=precioConIva(3);
        System.out.println("El precio con IVA es: "+resultado);
    }

    public static double precioConIva(double precio){
        return precio*1.21;
    }
}