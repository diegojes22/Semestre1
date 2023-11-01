package net.diego.unidad4;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Diego Muñoz
 * TECNOLOGICO NACIONAL DE MEXICO
 * 
 * 31/octubre/2023
 * 
 * PROBLEMA: Diseñe un programa que guarde 20 numeros 
 * enteros en el arreglo "M" y otros 2 numeros en el 
 * arreglo "N". Identifique si los arreglos son iguales 
 * o son diferentes. Seran iguales cuando en la misma 
 * posicion de ambos se tiene el mismo valor para todos 
 * los elementos.
 */
public class DiferenciaIgualitaria {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        
        int two_array_len = 20;
        int M[] = new int[two_array_len];
        int N[] = new int[two_array_len];
        boolean check = false;
        
        // pedir datos
        System.out.println("---[ ARREGLO M ]------------------------");
        for(int i = 0; i < two_array_len; i++) {
            System.out.print("Ingrese el numero "+i+" :");
            M[i] = in.nextInt();
        }
        
        System.out.println("---[ ARREGLO N ]------------------------");
        for(int i = 0; i < two_array_len; i++) {
            System.out.print("Ingrese el numero "+i+" :");
            N[i] = in.nextInt();
        }
        
        // checar si ambos arreglos son iguales
        System.out.println("---[ RESULTADO ]------------------------");
        if(Arrays.equals(N, M)) {
            System.out.println("Ambos arreglos son iguales :)");
        }else {
            System.out.println("Los arreglos son parecidos pero no son iguales!");
        }
        
    }
}
