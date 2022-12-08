/*Crea una clase Persona con las siguientes variables:
La edad,El nombre, El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre
 y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */


public class main {
    public static void main(String args[]){
        Cliente clienteNuevo = new Cliente();

        clienteNuevo.nombre = "Fernando";
        clienteNuevo.edad = 25;
        clienteNuevo.telefono = 70135118;
        clienteNuevo.setCredito(51365.1254 );

        System.out.println("Nombre:  " + clienteNuevo.nombre);
        System.out.println("Edad: " + clienteNuevo.edad);
        System.out.println("Telefono: " + clienteNuevo.telefono);
        System.out.println("Credito aprobado: " + clienteNuevo.getCredito() + " $");

        System.out.println("******************************");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Carmen";
        trabajador.edad = 30;
        trabajador.telefono = 70261985;
        trabajador.setSalario(500);

        System.out.println("Nombre:  " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario de trabajador: " + trabajador.getSalario() + " $");
    }
}

class Persona{
    String nombre;
    int edad;
    int telefono;
}

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