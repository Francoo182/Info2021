package nivel2.ejer6;

public class Empleado {
    String nombre;
    String dni;
    int horasTrabajadas;
    int valorPorHora;

    public Empleado(String nombre, String dni, int horasTrabajadas, int valorPorHora){

        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return   this.nombre + " - " + this.dni + " - " + String.valueOf(this.horasTrabajadas + " - " + this.valorPorHora) ;
    }

    public int sueldo(){

        return this.horasTrabajadas * this.valorPorHora;

    }

    public String obtDni(){

        return this.dni;

    }
    
}
