package nivel2;
import java.util.ArrayList;
import java.util.List;

public class level1 {

    public static void main(String[] args) {
        
        List<String> ciudades = new ArrayList<>();

        rankingCiudad(ciudades);

        int cont = 0;

        for (String ciu : ciudades) {
            
            System.out.println("#"+ (cont += 1) + " - " +ciu);

        }

    }

    public static void rankingCiudad(List<String>  ciudades) {
        ciudades.add("Resistencia");
        ciudades.add("Mendoza");
        ciudades.add("Misiones");
    }
}