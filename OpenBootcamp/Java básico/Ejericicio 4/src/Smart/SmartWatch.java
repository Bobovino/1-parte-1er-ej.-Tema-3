package Smart;

public class SmartWatch extends SmartDevice{
    String nfc;

    public SmartWatch() {
    }

    public SmartWatch(String modelo, double tamanyo, String color, String nfc) {
        super(modelo, tamanyo, color);
        this.nfc = nfc;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "nfc=" + nfc +
                ", modelo='" + modelo + '\'' +
                ", tamanyo=" + tamanyo +
                ", color='" + color + '\'' +
                '}';
    }
}