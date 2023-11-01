package net.diego.unidad4;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Diego Muñoz
 * TECNOLOGICO NACIONAL DE MEXICO
 * 
 * 1/noviembre/2023
 * 
 * PROBLEMA: Diseñe un programa que declare e inicialize 
 * un arreglo de numeros flotantes (20 numeros); 
 * posteriormente lea un numero cualquiera del teclado 
 * e indique cuantos numeros del arreglo son menores o 
 * iguales al valor leido.
 */
public class CompareArrayNumbers {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        
        float[] numeros = new float[20];
        float read_num;
        
        // rellenar el arreglo
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = gen.nextFloat() * (0 + 100);
        }
        
        // pedir datos
        System.out.print("Ingrese un numero decimal <0 a 100>: ");
        read_num = in.nextFloat();
        
        // comparar
        System.out.println("----[ Numeros menores ]-------------------------------------------------");
        for(float n : numeros) {
            if(n <= read_num) {
                System.out.println(n);
            }
        }
        
    }
}
