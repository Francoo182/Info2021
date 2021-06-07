package nivel2;
import java.util.ArrayList;
import java.util.List;
public class level7 {
    public static void main(String[] args) {

        
        System.out.println(numMulti(1,8));
        
        
    }

    private static List<String> numMulti(int n1, int n2) {

        List<String> listaNum = new ArrayList<>();

        for (int i = n1; i < n2 ; ++i) {

            String l = String.valueOf(i);

            if (i%2 == 0 && i%3 == 0 ) {

                l = "FizzBazz";

            }

            else if (i%2 == 0) {

                l = "Fizz";
            }

            else if ( i%3 == 0) {

                l = "Buzz";
            }

            

            listaNum.add(l);

        }

        return listaNum;

    }
    
}
