package net.diego.unidad4;

import java.util.Random;

/**
 *
 * @author Diego Muñoz
 * TECNOLOGICO NACIONAL DE MEXICO
 * 
 * 1/noviembre/2023
 * 
 * PROBLEMA: Diseñe un programa que lea 2 vectores 
 * llamados "A" y "B" de 20 elementos cada uno y 
 * multiplique el prime elemento de "A" con el ultimo 
 * elemento de "B" y luego el segundo de "A" por el 
 * penultimo de "B" y asi sucesivamente hasta llegar 
 * al ultimo de "A" por el primero de "B". El resultado 
 * de la  multiplicacion quedara quedara en "C" en el 
 * orden en que fueron efectuados, por ultimo imprimir 
 * los 3 vectores.
 */
public class MultiplicacionDeArreglos {
    // Generar un arreglo de n elementos aleatorios
    public static int[] gen_array(int len) {
        Random gen = new Random();
        int array[] = new int[len];
        
        for(int i = 0; i < len; i++) {
            array[i] = gen.nextInt(50);
        }
        return array;
    }
    
    // Imprimir un arreglo
    public static void print_int_array(int[] array) {
        System.out.print("[");
        for(int n : array) {
            System.out.print(n+", ");
        }
        System.out.print("]\n");
    }
    
    public static void main(String[] args) {
        // variables
        int A[], B[], C[];
        int i = 0, j = 19, len = 20;
        
        // generar arreglos
        A = gen_array(len);
        B = gen_array(len);
        C = gen_array(len);
        
        // Multiplicar arreglos
        for(i = 0; i < len; i++) {
            C[i] = A[i] * B[j-i];
        }
        
        // Mostrar Arreglos
        print_int_array(A);
        print_int_array(B);
        print_int_array(C);
    }
}
