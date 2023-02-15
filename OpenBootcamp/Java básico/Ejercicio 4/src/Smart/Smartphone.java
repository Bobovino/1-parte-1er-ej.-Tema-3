package Smart;
    public class Smartphone extends SmartDevice{
        String sistemaOperativo;

        public Smartphone() {
            super();
        }

        public Smartphone(String modelo, double tamanyo, String color, String sistemaOperativo) {
            super(modelo, tamanyo, color);
            this.sistemaOperativo = sistemaOperativo;
        }

        @Override
        public String toString() {
            return "Smartphone{" +
                    "sistemaOperativo='" + sistemaOperativo + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", tamanyo=" + tamanyo +
                    ", color='" + color + '\'' +
                    '}';
        }
}
