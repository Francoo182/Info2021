package nivel1;

import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        System.out.println("Digite 2 numeros enteros que desee sumar dividir restar multplicar y obtener el resto");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        double division = (double) a/b;
        int resto = a%b;

        System.out.println("La suma de los enteros es igual a " + suma );
        System.out.println("La resta de los enteros es igual a " + resta );
        System.out.println("La multiplicacion de los enteros es igual a " + multiplicacion );
        System.out.println("La division de los enteros es igual a " + division );
        System.out.println("el resto de los enteros es igual a " + resto );

        scan.close();
    }
}
