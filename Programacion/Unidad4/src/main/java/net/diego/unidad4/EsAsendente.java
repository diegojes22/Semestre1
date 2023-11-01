package net.diego.unidad4;

import java.util.Scanner;

/**
 *
 * @author Diego Muñoz
 * TECNOLOGICO NACIONAL DE MEXICO
 * 
 * 1/noviembre/2023
 * 
 * PROBLEMA: Diseñar un programa en el que declare e 
 * inicialize un arreglo de tipo String con 2 nombres; 
 * posteriormente idenifique si el arreglo esta ordenado 
 * de manera asendente.
 */
public class EsAsendente {
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        String nombres[] = new String[20];
        
        boolean state = true;
        
        // pedir datos
        for(int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre "+(i+1)+": ");
            nombres[i] = in.nextLine();
        }
        
        // verificar si el arreglo es asendente
        for(int i = 0; i < nombres.length; i++) {
            if(i < nombres.length-1) {
                if(nombres[i].charAt(0) > nombres[i+1].charAt(0)) {
                    state = false;
                }
            }  
        }
        
        // salida
        if(state) {
            System.out.println("El arreglo si es asendente");
        }else {
            System.out.println("El no es asendente!");
        }
    }
}
