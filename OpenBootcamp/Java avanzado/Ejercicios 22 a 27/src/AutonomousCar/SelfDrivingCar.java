package AutonomousCar;

import Engine.Engine;
import AutonomousCar.Autonomous;

//        -Continúa con el código extendiéndolo para aumentar su funcionalidad pero sin
//        modificarlo aplicando el principio abierto/cerrado(O).
public class SelfDrivingCar implements Engine, Autonomous {

    private String make;
    private String model;
    private int year;
    private int batteryCapacity;

    public SelfDrivingCar(String make, String model, int year, int batteryCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.batteryCapacity = batteryCapacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void start() {
        System.out.println("Starting self driving car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping self driving car...");
    }

    @Override
    public void driveAutonomously() {
        System.out.println("Driving autonomously...");
    }
}
