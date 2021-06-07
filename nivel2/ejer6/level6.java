package nivel2.ejer6;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class level6 {
    

    public static void main(String[] args) {

        Set<Empleado> empleados = new HashSet<Empleado>();
        Map<String, Integer> sueldoTotal = new HashMap<>();


        
        Empleado e1 = new Empleado("Jose", "4500", 45, 600);
        Empleado e2 = new Empleado("Carlos", "2547", 30, 687);

        empleados.add(e1);
        empleados.add(e2);

        for (Empleado empleado : empleados) {

            System.out.println(empleado);
        }
        



        
        sueldoTotal.put(e1.obtDni(), e1.sueldo());
        sueldoTotal.put(e2.obtDni(), e2.sueldo());

        System.out.println(sueldoTotal);
       

    }

    
}