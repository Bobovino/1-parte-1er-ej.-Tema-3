package NormalCar;

import NormalCar.Car;

//-Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible
//        y uno híbrido y aplica el principio de substitución de Liskov (L),
//        las subclases deben ser sustituibles por la superclase coche.
public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;

    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }


    @Override
    public void start() {
        System.out.println("Starting electric car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping electric car...");
    }




}
