package ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Declaracion de variables
        List<Empleado> empleados = new ArrayList<Empleado>();
        List<Empleado> listaPorLetra = new ArrayList<Empleado>();
        List<Empleado> MenorYMayor = new ArrayList<Empleado>();
        List<Empleado> menosYMasGana = new ArrayList<>();
        
        crearEmpleados(empleados);
        System.out.println(empleados);
        System.out.println();

        listaPorLetra = listaPorLetra(empleados);
        System.out.println(listaPorLetra);

        MenorYMayor = MasGrandeYmasChico(empleados);
        System.out.println();
        System.out.println(MenorYMayor);
        System.out.println();

        menosYMasGana = menosYMas(empleados);
        System.out.println(menosYMasGana);
        System.out.println();

        Collections.sort(empleados);
        System.out.println(empleados);
    }
    public static List<Empleado> crearEmpleados(List<Empleado> empleados){
        File f = new File("C:/Users/Rudy_/Desktop/Java/info2021/ejercicio5/datos.txt");
        String linea;
        try {
            FileReader rd = new FileReader(f);
            BufferedReader br = new BufferedReader(rd);
            while((linea = br.readLine()) != null){
              String[] partes = linea.split(",");
              Empleado emp = new Empleado(partes[0], partes[1], partes[2], partes[3]);
              empleados.add(emp);  
            }
            br.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        return empleados;
    }
    public static List<Empleado> listaPorLetra(List<Empleado> empleados){
        Scanner sc = new Scanner(System.in);
        char letra;
        List<Empleado> listaPorLetra = new ArrayList<Empleado>();
        System.out.print("Ingrese una letra para buscar los apellidos: ");
        letra = sc.nextLine().toUpperCase().charAt(0);

        for(int i = 0; i<empleados.size();i++){
            Empleado aux = empleados.get(i);
            if(aux.apellido.toUpperCase().charAt(0) == letra){
                listaPorLetra.add(aux);
            }
        }

        
        sc.close();
        return listaPorLetra;
    }
    public static List<Empleado> MasGrandeYmasChico(List<Empleado> empleados){
        List<Empleado> jovenYMayor = new ArrayList<Empleado>();
        Empleado auxMayor = empleados.get(0);
        Empleado auxMenor = empleados.get(0);

        for(int i = 0;i<empleados.size();i++){
            if(empleados.get(i).obtenerEdad() > auxMayor.obtenerEdad()){
                auxMayor = empleados.get(i);
            }else if(empleados.get(i).obtenerEdad() < auxMenor.obtenerEdad()){
                auxMenor = empleados.get(i);
            }
        }
        jovenYMayor.add(auxMayor);
        jovenYMayor.add(auxMenor);
        return jovenYMayor;
    }
    public static List<Empleado> menosYMas(List<Empleado> empleados){
        List<Empleado> menosYMas = new ArrayList<>();
        Empleado menos = empleados.get(0);
        Empleado mas = empleados.get(0);

        for(int i=1;i<empleados.size();i++){
            if(empleados.get(i).sueldo > mas.sueldo){
                mas = empleados.get(i);
            }else if(empleados.get(i).sueldo < menos.sueldo){
                menos = empleados.get(i);
            }
        }
        menosYMas.add(mas);
        menosYMas.add(menos);

        return menosYMas;
    }


}