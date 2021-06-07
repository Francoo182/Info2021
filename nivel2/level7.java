package nivel2;
import java.util.ArrayList;
import java.util.List;
public class level7 {
    public static void main(String[] args) {

        
        System.out.println(numMulti(1,8));
        
        
    }

    private static List<String> numMulti(int n1, int n2) {

        List<String> listaNum = new ArrayList<>();

        for (int o = n1; o < n2 ; ++o) {

            String l = String.valueOf(o);

            if (o%2 == 0 && o%3 == 0 ) {

                l = "FizzBazz";

            }

            else if (o%2 == 0) {

                l = "Fizz";
            }

            else if ( o%3 == 0) {

                l = "Buzz";
            }           

            listaNum.add(l);

        }

        return listaNum;

    }
    
}
