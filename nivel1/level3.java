package nivel1;

import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int k = scan.nextInt();
            scan.close();
            for(int i=1; i<=k; i++){
                System.out.println("");
                for(int j=1; j<=i; j++){
                    System.out.print(j + " ");

                }

            }
    }
        




}

