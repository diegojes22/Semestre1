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
 * Fecha de elaboración: 27/11/2020
 * 
 * Conjunto de actividades en clase
 * Actividad 1: 
 */
public class Ejercicio1 {
    private static void lines() {
        System.out.println("----------------------------------------------------");
    }
    
    public static void tabla_de_multiplicar(int number) {
        lines();
        System.out.println("Tabla del "+number);
        lines();
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(number+"x"+i+" = "+(number*i));
        }
        lines();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        
        System.out.print("Ingrese un numero: ");
        n = in.nextInt();
        
        tabla_de_multiplicar(n);
        
    }
}
