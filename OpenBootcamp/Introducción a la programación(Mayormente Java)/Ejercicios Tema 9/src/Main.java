public class Main {
    public static void main(String[] args) {

    Cliente Cliente1=new Cliente();
        Cliente1.setEdad(18);
        Cliente1.setNombre("Juan Luis Pérez Coimbra");
        Cliente1.setTelefono(612345789);
        Cliente1.setCredito(100000.10);
        System.out.println("Cliente: " + Cliente1.getNombre());
        System.out.println("Edad: "+Cliente1.getEdad()+ " años");
        System.out.println("Teléfono: "+ Cliente1.getTelefono());
        System.out.println("Crédito: "+ Cliente1.getCredito()+ " €");
        System.out.println();

    Trabajador Trabajador1=new Trabajador();
        Trabajador1.setEdad(40);
        Trabajador1.setNombre("Alba Vicente Tolmo");
        Trabajador1.setTelefono(611111111);
        Trabajador1.setSalario(2000.00);
        System.out.println("Trabajador: " + Trabajador1.getNombre());
        System.out.println("Edad: "+Trabajador1.getEdad()+" años");
        System.out.println("Teléfono: "+ Trabajador1.getTelefono());
        System.out.println("Salario: "+ Trabajador1.getSalario()+ " €");

    }
}

 class Persona {
     private int edad;
     private String nombre;
     private int telefono;

     public void setEdad(int edad) {
         this.edad = edad;
     }


     public int getEdad() {
         return this.edad;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public String getNombre() {
         return this.nombre;
     }

     public void setTelefono(int telefono) {
         this.telefono = telefono;
     }

     public int getTelefono() {
         return this.telefono;
     }
 }
//Iba a usar abstract pero creo que no hace falta.
class Cliente extends Persona{
    private double credito;


    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}
class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}