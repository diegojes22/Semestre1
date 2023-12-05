package net.diego.unidad5.ActividadesI;
import java.util.Scanner;

/**
 * @author: Diego Jesus Muñoz Andrade
 * 
 * 1-C Bis
 * 
 * Instituto Tecnológico de La Piedad
 * Ingeniería en Sistemas Computacionales
 * 
 * Fecha de elaboración: 28/11/2020
 * 
 * Conjunto de actividades en clase
 * Actividad 2: 
 */
public class Ejercicio2 {
    
    public static void ascendente(int val1, int val2, int val3) {
        if(val1 < val2 && val1 < val3) {
            System.out.print(val1+" ");
        }
        else if(val2 < val1) {
            System.out.println(val2+" ");
        }
        else if(val3 < val1 && val3 < val2) {
            System.out.print(val3+" ");
        }
    }
    
    public static void ascendente(int numbers[]) {
        int a = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length-1; j++) {
                if(numbers[j] > numbers[j+1]) {
                    a = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    
                    numbers[j] = a;
                }
            }
        }
        
        print_array(numbers);
    }
    
    public static void desendente(int numbers[]) {
        int a = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length-1; j++) {
                if(numbers[j] < numbers[j+1]) {
                    a = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    
                    numbers[j] = a;
                }
            }
        }
        
        print_array(numbers);
    }
    
    private static void lines() {
        System.out.println("----------------------------------------------------");
    }
    
    public static void print_array(int array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] r = new int[3];
        
        lines();
        
        for(int i = 0; i < 3; i++) {
            System.out.print("Ingrese el "+i+" numero: ");
            r[i] = in.nextInt();
        }
        
        lines();
        System.out.print("En orden ascendente: ");
        ascendente(r);
        
        System.out.print("En orden decendente: ");
        desendente(r);
    }
}
