//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//        Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//        Crear constructor vacío y con todos los parámetros para cada clase.
//        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

import Smart.*;

public class Main {
    public static void main(String[] args) {
        Smartphone miMovil=new Smartphone("Redmi note 11", 6.0,"Negro","Android");
        SmartWatch miReloj=new SmartWatch("FelipuQu",1.69,"Negro","NFC");

        System.out.println(miMovil);
        System.out.println(miReloj);

    }
}