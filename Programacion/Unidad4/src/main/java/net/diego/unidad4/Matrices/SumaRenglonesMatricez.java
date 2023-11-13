package Matrices;

import java.util.Scanner;

/**
 *
 * @author Diego Muñoz
 * TECNOLOGICO NACIONAL DE MEXICO
 * 
 * 6/noviembre/2023
 * 
 * Programa que muestre una matriz de 20x20
 * con diagonal principal en 1 en las otras
 * posiciones 0
 */
public class SumaRenglonesMatricez {
    public static void print_int_array(int[] array) {
        System.out.print("[");
        for(int n : array) {
            System.out.print(n+", ");
        }
        System.out.print("]\n");
    }
    
    public static void main(String[] args) {
        // Variables
        Scanner MarcoAntonioSolizMendieta = new Scanner(System.in);
        
        int matrix[][] = new int[5][3];
        int vector[] = new int[5];
        int cache = 0;
        
        // leer
        for(int j = 0; j < 5; j++) {
            for(int i = 0; i < 3; i++) {
                System.out.print("Ingrese un numero ("+j+","+i+") para el vector: ");
                matrix[j][i] = MarcoAntonioSolizMendieta.nextInt();
            }
        }
        
        // operacion especial: suma de renglones
        for(int j = 0; j < 5; j++) {
            cache = 0;
            for(int i = 0; i < 3; i++) {
                cache += matrix[j][i];
            }
            
            vector[j] += cache;
        }
        
        // imprimir arreglos
        System.out.println("[");
        for(int i = 0; i < 5; i++) {
            System.out.print("\t[");
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("]");
        }
        System.out.println("]");
        
        print_int_array(vector);
        
    }
}
