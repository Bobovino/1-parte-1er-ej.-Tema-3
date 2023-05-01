public class Singleton {
    private static Singleton instancia;
    private int contador;
    private Singleton() { }


    public static Singleton getInstance(){

            if (instancia == null) {
                instancia = new Singleton();
            }

            return instancia;
    }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
