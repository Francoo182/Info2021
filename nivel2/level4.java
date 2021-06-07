package nivel2;
import java.util.ArrayList;
import java.util.List;

public class level4 {

    public static void main(String[] args) {
        

        List<String> alumnos = new ArrayList<>();

        alumnos.add("Maria");
        alumnos.add("Eujenia");
        alumnos.add("Carlos");
        alumnos.add("Mariana");
        alumnos.add("Lorenzo");
        alumnos.add("Jose");
        alumnos.add("Pedro");
        alumnos.add("Juan");
        alumnos.add("David");
        alumnos.add("Gaston");
        alumnos.add("Lorena");
        alumnos.add("Abel");

        List<String> grumo1 = alumnos.subList(0, 4);

        List<String> grumo2 = alumnos.subList(4, 8);

        List<String> grumo3 = alumnos.subList(8, 12);

        System.out.println("Grupo 1");

        for (String g1 : grumo1) {

            System.out.println(g1);
            
        }

        System.out.println("________________________________");
        System.out.println("________________________________");

        System.out.println("Grupo 2");

        for (String g2 : grumo2) {

            System.out.println(g2);

        }

        System.out.println("________________________________");
        System.out.println("________________________________");

        System.out.println("Grupo 3");

        for (String g3 : grumo3) {
            
            System.out.println(g3);
            
        }

        




    }
}