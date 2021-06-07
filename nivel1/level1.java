package nivel1;

import java.util.Scanner;

public class level1{
    public static void main(String[] args) {

        System.out.println("Ingrese su nombre de usuario");

        Scanner scan = new Scanner(System.in);

        String usuario = scan.nextLine();

        System.out.println("Hola: " + usuario);

        scan.close();

    }

    




}