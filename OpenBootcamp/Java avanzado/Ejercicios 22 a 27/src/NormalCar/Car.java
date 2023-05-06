package NormalCar;
import Engine.Engine;

//Crea una clase coche aplicándole el principio de responsabilidad única (S).
public abstract class Car implements Engine {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    //Setters and getters
    public String getMake() {return make;}

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

    //Implementación de la interfaz
    @Override
    public abstract void start();
    @Override
    public abstract void stop();

}
