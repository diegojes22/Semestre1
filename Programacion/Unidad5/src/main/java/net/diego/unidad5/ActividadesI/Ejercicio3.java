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
 * Actividad 3: 
 */
public class Ejercicio3 {
    private static void lines() {
        System.out.println("----------------------------------------------------");
    }
    
    public static void triangle(String c, int l) {
        for(int i = 0; i < l; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        String c;
        
        lines();
        System.out.print("Ingrese un numero: ");
        n = in.nextInt();
        System.out.print("Ingrese una letra: ");
        c = in.next();
        
        lines();
        triangle(c, n);
        lines();
    }
}
