package net.diego.unit3.EjerciciosConCiclos;

import java.util.Scanner;

/* 
 * Problema:
 * Realice un programa que calcule la suma siguiente
 * 200 + 197+ + 194 +… +3 + 0 en este orden.
*/
public class Calificaciones {
    public static void main(String[] args) {
        // Variables
        int calificacion = 0, aprobados = 0, reprobados = 0;
        float taza_aprobados = 0;
        
        Scanner in = new Scanner(System.in);
        
        int i = 0, alumnos = 10;
        
        // recibir datos
        do {
            i++;
            
            System.out.print("Ingrese la calificación del alumno "+i+" : ");
            calificacion = in.nextInt();
            
            // verificar alumo aprobadoo reprobado
            if(calificacion >= 70) {
                aprobados ++;
            }else if(calificacion < 70) {
                reprobados ++;
            }
        } while(i < alumnos);
        
        taza_aprobados = (aprobados * 100) / 10; // calcular taza
        
        // Mostrar datos
        System.out.println("Porcentaje de alumnos aprobados: "+taza_aprobados+"%");
        System.out.println("Numero de alumnos aprobados: "+aprobados+"/"+alumnos);
        System.out.println("Numero de alumnos reprobados: "+reprobados+"/"+alumnos);
        
        in.close();
    }
}
