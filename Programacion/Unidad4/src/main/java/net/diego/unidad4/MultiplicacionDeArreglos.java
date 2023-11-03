package net.diego.unidad4;

import java.util.Random;
import java.util.Scanner;

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
    // Generar un arreglo de n elementos aleatorios.
    // Esta funcion se utiliza principalmente para no
    // ingresar datos de forma manual y de esa forma 
    // Agilizar el proceso.
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
        Scanner in = new Scanner(System.in);
        int A[], B[], C[];
        int i = 0, j = 19, len = 20;
        
        // generar arreglos
        A = new int[20];
        B = new int[20];
        C = new int[20];
        
        // Leer arreglos
        System.out.println("----[ ARREGLO A ]-------------------------------------------------");
        for(i = 0; i < len; i++) {
            System.out.print("Ingrese el elemento "+i+" del arreglo: ");
            A[i] = in.nextInt();
        }
        System.out.println("----[ ARREGLO B ]-------------------------------------------------");
        for(i = 0; i < len; i++) {
            System.out.print("Ingrese el elemento "+i+" del arreglo: ");
            B[i] = in.nextInt();
        }
        
        // Multiplicar arreglos
        for(i = 0; i < len; i++) {
            C[i] = A[i] * B[j-i];
        }
        
        // Mostrar Arreglos
        System.out.println("----[ RESULTADO ]-------------------------------------------------");
        print_int_array(A);
        print_int_array(B);
        print_int_array(C);
    }
}
