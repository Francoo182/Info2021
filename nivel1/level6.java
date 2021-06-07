package nivel1;

import java.util.Scanner;

public class level6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int a= scan.nextInt();
        System.out.println("Ingrese el exponente ");
        int b= scan.nextInt();
        int c=1;
        for(int j = 1; j<=b; j++){
            c*=a;
        }
        System.out.print(c);

        scan.close();
    }
    
}
