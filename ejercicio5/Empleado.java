package ejercicio5;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado implements Comparable<Empleado>{
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    Double sueldo;

    public Empleado(String nombre, String apellido, String fechaNacimiento, String sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = convertirFecha(fechaNacimiento);;
        this.sueldo = Double.valueOf(sueldo);
    }
    public int obtenerEdad(){
        int edad = 0;
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        edad = periodo.getYears();

        return edad;
    }
    private LocalDate convertirFecha(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDateNac = LocalDate.parse(date, formatter);
        return localDateNac;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " Apellido: " + apellido + " Fecha de Nac.: " + fechaNacimiento + " Sueldo: " + sueldo + "\n";
    }
    @Override
    public int compareTo(Empleado o) {
        String a = new String(String.valueOf(this.nombre)+this.apellido);
        String b = new String(String.valueOf(o.nombre)+o.apellido);
        return a.compareTo(b);
    }
}