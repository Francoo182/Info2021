package nivel1;
import java.util.Scanner;

public class level9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String fra = scan.nextLine();

        System.out.println("Ingrese una letra: ");
        String letra = scan.nextLine();

        scan.close();

        int contador = 0;

        for (int i = 0; i < fra.length(); ++i){

            if ( letra.charAt(0) == fra.charAt(i)) {

                contador += 1;

            }


        }

        System.out.println(contador);
    }
}