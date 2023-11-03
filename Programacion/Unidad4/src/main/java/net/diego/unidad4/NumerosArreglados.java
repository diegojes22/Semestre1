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
 * PROBLEMA: Diseñar un programa que lea 20 numeros y 
 * los guarde en un arreglo A (Introducirlos de forma 
 * ascendente), leer otros 20 numeros y guardarlos en 
 * arreglo B (de forma ascendente). Posteriormente 
 * mezclarlos en el arreglo C de forma ascendente. 
 * Por ultimo, imprimir los tres arreglos.
 */
public class NumerosArreglados {
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
    
    public static void main(String args[]) {
        // Variables
        Scanner in = new Scanner(System.in);
        int A[], B[], C[];
        int len = 20;
        
        A = new int[len];
        B = new int[len];
        C = new int[len*2];
        
        int i = 0, j = 0;
        
        
        // Pedir datos
        System.out.println("----[ ARREGLO A ]-------------------------------------------------");
        do {
            System.out.print("Ingrese el dato "+(i+1)+" del arreglo: ");
            j = in.nextInt();
            
            if(i > 0) {
                if(j >= A[i-1]) {
                    A[i] = j;
                    i++;
                }
                else {
                    System.out.print("Error, ingrese un numero mayor> ");
                }
            }
            else {
                A[0] = j;
                i++;
            }
        } while(i < len);
        
        System.out.println("----[ ARREGLO B ]-------------------------------------------------");
        i = 0;
        do {
            System.out.print("Ingrese el dato "+(i+1)+" del arreglo: ");
            j = in.nextInt();
            
            if(i > 0) {
                if(j >= B[i-1]) {
                    B[i] = j;
                    i++;
                }
                else {
                    System.out.print("Error, ingrese un numero mayor> ");
                }
            }
            else {
                B[0] = j;
                i++;
            }
        } while(i < len);
        
        // Guardar A y B en el arreglo C
        j = 1;
        for(i = 0; i < len; i++) {
            C[i*2] = A[i];
            C[j] = B[i];
            
            j+=2;
        }
        
        // salida
        print_int_array(A);
        print_int_array(B);
        print_int_array(C);
        
        in.close();
    }
}
