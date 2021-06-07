package nivel1;

import java.util.Scanner;

public class level5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c=0;
        for(int j = 1; j<=b; j++){

            c = c+a;
        }
        System.out.print(c);

        scan.close();
    }
}
