package net.diego.unit3.pack2;

import java.util.Scanner;

/* 
 * @autor Diego Jesus Muñoz Andrade
 * @company TecNM Campus la Piedad
 * 
 * Problema 1:
 * Escriba un programa que lea un valor entero n mayor o igual a
 * 1 y regrese el resultado de la sumatoria, usando while
 * 
 * paquete 2
 * 
*/
public class Sumatoria1 {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        
        int N, X;
        float resultado = 0, sumatoria = 0;
        
        // Entrada
        System.out.print("Ingrese el rango de la sumatoria: ");
        N = in.nextInt();
        System.out.print("Ingrese el valor de X: ");
        X = in.nextInt();
        
        System.out.println("\n");
        
        // proceso
        int i = 1;
        while(i <= N) {
            resultado = (float)( Math.sqrt((7/5)* Math.pow(i, 2)) / (Math.sqrt(Math.pow(i, 5) - Math.pow(i, 2)) + 10) );
            sumatoria += resultado;
            System.out.println("f("+i+") = "+resultado);
            
            i++;
        }
        
        // resultado
        System.out.println("\nSumatoria = "+sumatoria);
        
        in.close();
    }
}
