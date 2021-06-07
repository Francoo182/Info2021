package nivel1;

import java.util.Scanner;

public class level4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Ingrese el numero que desee saber su factorial");

        int numero = scan.nextInt();
        int n=1;

        for(int i= numero; i>0 ; i--){
            n = n*i;

            
            
            
        System.out.println("el factorial es" + n);
        }
        scan.close();
    }     
}
