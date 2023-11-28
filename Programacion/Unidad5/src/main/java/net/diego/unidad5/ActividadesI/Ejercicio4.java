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
 * Actividad 4: 
 */
public class Ejercicio4 {
    private static void lines() {
        System.out.println("------------------------------------------------------------------------");
    }
    
    public static double cube(float l) {
        return Math.pow(l, 3);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        double volume;
        
        lines();
        System.out.print("Ingrese un numero: ");
        n = in.nextInt();
        
        volume = cube(n);
        
        lines();
        System.out.println("Volumen de cubo: "+volume);
    }
}
