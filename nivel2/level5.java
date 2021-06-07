package nivel2;

import java.util.ArrayList;
import java.util.List;

public class level5 {

    public static void main(String[] args) {

        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> total = new ArrayList<>();

        // horas trabagadas por dia         // valor por dias
        horasTrabajadas.add(6);              valorPorHora.add(350);
        horasTrabajadas.add(7);              valorPorHora.add(345);
        horasTrabajadas.add(8);              valorPorHora.add(550);
        horasTrabajadas.add(4);              valorPorHora.add(600);
        horasTrabajadas.add(5);              valorPorHora.add(320);

        
        
        
        
        
       

        // calculando el total de la dos lista y agregando a otra lista 
        for (int i = 0 ;  i < horasTrabajadas.size() ; ++i){

            int t = horasTrabajadas.get(i) * valorPorHora.get(i);

            total.add(t);

        }

        // imprime el total
        int totalA = 0;

        for (Integer t : total) {

            totalA += t;
        }
        System.out.println(total);
        System.out.println("Total de horas trabajada: " + totalA);
        
    }
    
}