package net.diego.unit3.EjerciciosConCiclos;

import java.util.Scanner;

/* 
 * Problema:
 * Un grupo de 20 estudiantes presentan un examen de Programación. 
 * Diseñe un programa que lea por cada estudiante la calificación 
 * obtenida y calcule e imprima:
 *  a) La cantidad de estudiantes que obtuvieron una calificación menor a 50
 *  b) La cantidad de estudiantes que obtuvieron una calificación de 50 o más pero menor de 70
 *  c) La cantidad de estudiantes que obtuvieron una calificación de 70 o más pero menor que 80
 *  d) La cantidad de estudiantes que obtuvieron una calificación de 80 o más
*/
public class CalificacionExamen {
    public static void main(String[] args) {
        // Variables
        int calificacion = 0, grupo1 = 0, grupo2 = 0, grupo3 = 0, grupo4 = 0;
        
        /*
         * grupo1: menor a 50
         * grupo2: entre 50 a 70
         * grupo3: entre 70 a 80
         * grupo4: mas de 80
        */
        
        Scanner in = new Scanner(System.in);
        
        int i = 0, alumnos = 20;
        
        // recibir datos
        do {
            i++;
            
            System.out.print("Ingrese la calificación del alumno "+i+" : ");
            calificacion = in.nextInt();
            
            // verificar alumo aprobadoo reprobado
            if(calificacion < 50) {
                grupo1++;
            }else if(calificacion >= 50 && calificacion < 70) {
                grupo2++;
            }else if(calificacion >= 70 && calificacion < 80) {
                grupo3++;
            }else {
                grupo4++;
            }
        } while(i < alumnos);
        
       // Mostrar datos
       System.out.println("menor a 50 ..: "+grupo1);
       System.out.println("entre 50 a 70: "+grupo2);
       System.out.println("entre 70 a 80: "+grupo3);
       System.out.println("mas de 80 ...: "+grupo4);
        
        in.close();
    }
}
