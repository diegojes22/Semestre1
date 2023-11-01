package net.diego.unidad4;

import java.util.Scanner;

/**
 *
 * @author Diego Muñoz
 * TECNOLOGICO NACIONAL DE MEXICO
 * 
 * 31/octubre/2023
 * 
 * PROBLEMA: Diseñe un programa que lea 20 numeros, 
 * los guarde en un arreglo unidimensional y 
 * posteriormente los escriba en el orden inverso 
 * en que se leyeron.
 */
public class ImprimirInversa {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int numeros[] = new int[20];
        
        // entrada
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero "+(i+1)+" :");
            numeros[i] = in.nextInt();
        }
        
        System.out.println("------------------------------------------------------");
        
        // salida
        System.out.print("|");
        for(int i = numeros.length-1; 0 <= i; i--) {
            System.out.print(numeros[i]+"|");
        }
        
    }
}
