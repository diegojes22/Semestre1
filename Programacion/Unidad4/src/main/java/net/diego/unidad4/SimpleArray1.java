package net.diego.unidad4;

import java.util.Scanner;

/**
 *
 * @author Diego Muñoz
 * TECNOLOGICO NACIONAL DE MEXICO
 * 
 * 30/octubre/2023
 * 
 * # DECLARACION DE ARREGLOS
 */
public class SimpleArray1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // declarando arreglos
        float estaturas[] = new float[5];
        
        int calificaciones[];
        calificaciones = new int[20];
        
        String nombres[] = {"Jesus", "Diego", "Javier", "Pedro", "Luis", "Miguel"};
        
        // asignacion de valores a los arreglos
        estaturas[0] = 1.69f;
        estaturas[1] = 1.70f;
        estaturas[2] = 2.00f;
        estaturas[3] = 1.50f;
        estaturas[4] = 1.59f;
        //* estaturas[5] = 1.90f;
        
        // Pedir calificaciones
        for(int i = 0; i < 20; i++) {
            System.out.print("Ingrese la calificacion "+(i+1)+" <0 - 100>: ");
            calificaciones[i] = in.nextInt();
        }
        
        // Mostrar los arreglos
        System.out.println("\nARREGLO DE ESTATURAS");
        for(int i = 0; i < estaturas.length; i++) {
            System.out.print(estaturas[i]+" ");
        }
        
        System.out.println("\nARREGLO DE NOMBRES");
        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        
        System.out.println("\nARREGLO DE CALIFICACIONES");
        for(int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }
    }
}
