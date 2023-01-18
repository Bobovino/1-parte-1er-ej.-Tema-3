import humanoides.Persona;

public class Main {
    public static void main(String[] args) {
    Persona persona1=new Persona();
    persona1.setEdad(18);
    persona1.setNombre("Eustaquio Oliver García");
    persona1.setTelefono("+34 626065232");
        System.out.println("Nombre: "+ persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Telefono: "+persona1.getTelefono());
    }
}


