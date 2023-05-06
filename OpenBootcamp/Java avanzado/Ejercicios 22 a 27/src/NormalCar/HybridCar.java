package NormalCar;

import NormalCar.Car;

//-Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible
//        y uno híbrido y aplica el principio de substitución de Liskov (L),
//        las subclases deben ser sustituibles por la superclase coche.
public class HybridCar extends Car {
    private int batteryCapacity;
    private int fuelCapacity;

    public HybridCar(String make, String model, int year, int batteryCapacity,int fuelCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    @Override
    public void start() {
        System.out.println("Starting hybrid car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping hybrid car...");
    }




}