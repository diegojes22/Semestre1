package UnitThree;

import java.util.Scanner;

/**
 *
 * @author Diego Jesus Muñoz Andrade
 * @company TecNM campus la Piedad
 * @date 29/9/2023
 * 
 * En este paquete estaran los ejercicios de la unidad 3
 * 
 * Mas Informacion en: https://github.com/diegojes22/Semestre1/tree/main/Programacion
 */

public class LasPiramides {
    public static void lines() {
        for(int l = 0; l < 55; l++) {
            System.out.print("=");
        }System.out.print("\n");
    }
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int altura = 0;
        int i = 0, j = 0;
        
        // Piramide 1
        lines();
        System.out.print("Ingrese la altura de la piramide \'A\': ");
        altura = in.nextInt();
        
        for(i = 0; i <= altura; i++) {
            for(j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(""); // salto de linea
        }
        
        // Piramide 2
        lines();
        System.out.print("Ingrese la altura de la piramide \'B\': ");
        altura = in.nextInt();
        
        for(i = altura; i > 0; i--) {
            for(j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(""); // salto de linea
        }
        
        // Piramide 3
        lines();
        System.out.print("Ingrese la altura de la piramide \'C\': ");
        altura = in.nextInt();
        
        for(i = altura; i >= 0; i--) {
            for(j = 0; j <= altura; j++) {
                if(j > i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
            System.out.println(""); // salto de linea
        }
        
        // Piramide 4
        lines();
        System.out.print("Ingrese la altura de la piramide \'C\': ");
        altura = in.nextInt();
        
        for(i = 0; i <= altura; i++) {
            for(j = 0; j <= altura; j++) {
                if(j > i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
            System.out.println(""); // salto de linea
        }
    }
}
