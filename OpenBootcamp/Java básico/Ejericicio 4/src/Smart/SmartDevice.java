package Smart;

public abstract class SmartDevice {
    String modelo;
    double tamanyo;
    String color;

    public SmartDevice() {
        super();
    }
    public SmartDevice(String modelo, double tamanyo, String color) {
        this.modelo = modelo;
        this.tamanyo = tamanyo;
        this.color = color;
    }
}
