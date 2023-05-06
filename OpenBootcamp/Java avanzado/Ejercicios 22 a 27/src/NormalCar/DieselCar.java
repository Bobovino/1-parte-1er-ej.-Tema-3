package NormalCar;

import NormalCar.Car;

//-Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible
//        y uno híbrido y aplica el principio de substitución de Liskov (L),
//        las subclases deben ser sustituibles por la superclase coche.
public class DieselCar extends Car {
    private int fuelCapacity;

    public DieselCar(String make, String model, int year, int fuelCapacity) {
        super(make, model, year);
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void start() {
        System.out.println("Starting diesel car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping diesel car...");
    }

}