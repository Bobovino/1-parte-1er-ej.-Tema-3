//                              ENUNCIADO1:
//        Durante estos ejercicios se va a trabajar sobre las letras S, O y L de los principios SOLID, deberás:
//        -Crea una clase coche aplicándole el principio de responsabilidad única (S).
//        -Continúa con el código extendiéndolo para aumentar su funcionalidad pero sin
//        modificarlo aplicando el principio abierto/cerrado(O).
//        -Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible
//        y uno híbrido y aplica el principio de substitución de Liskov (L),
//        las subclases deben ser sustituibles por la superclase coche.

//  ----------------------------------------------------------------
//                              ENUNCIADO2:
//        Continúa con el proyecto de los anteriores ejercicios ahora se va a trabajar
//        sobre las letras I y D de los principios SOLID, deberás:
//        -Si no has creado interfaces ya, créalas siguiendo el principio de segregación de interfaz (I)
//        el cual indica que las interfaces grandes se deben segregar en varias interfaces pequeñas.
//        Si ya las has creado, modifícalas para que cumplan el principio.
//        -Deberás crear una conexión a base de datos aplicando el último principio de la inversión de dependencias (D).


import AutonomousCar.SelfDrivingCar;
import DatabaseConnection.Database;
import DatabaseConnection.PostgresDatabase;
import NormalCar.DieselCar;
import NormalCar.ElectricCar;
import NormalCar.HybridCar;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2022 , 100);
        HybridCar hybridCar = new HybridCar("Toyota", "Prius", 2022 ,20, 10);
        DieselCar dieselCar = new DieselCar("Volkswagen", "Passat", 2022 ,50);
        SelfDrivingCar selfDrivingCar = new SelfDrivingCar("Tesla", "X", 2020, 20);

        //We try the methods of the car objects
        electricCar.start();
        electricCar.stop();
        hybridCar.start();
        hybridCar.stop();
        dieselCar.start();
        dieselCar.stop();
        selfDrivingCar.start();
        selfDrivingCar.driveAutonomously();
        selfDrivingCar.stop();

        try {
            // create a Database object (Yes I know that the link is wrong, but we get the idea)
            String url= "jdbc:postgresql://localhost:5432/carDatabase";
            Database database = new PostgresDatabase(url);

            // create a CarDao object
            PostgresDatabase carDbObject = new PostgresDatabase(database);

            // save the cars to the database
            carDbObject.saveCar(electricCar);
        }catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}



