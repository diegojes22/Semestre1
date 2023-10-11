package UnitThree;

import java.util.Scanner;

/**
 *
 * @author Diego Jesus Muñoz Andrade
 * @company TecNM campus la Piedad
 * @date 4/10/2023
 * 
 * En este paquete estaran los ejercicios de la unidad 3
 * 
 * Este es un repaso de ciclos, calcularemos el promedio
 * de 10 cada alumno con 5 calificaciones.
 * a) Promedio de los aliumnos
 * b) Promedio general
 * c) Promedio mas alto
 * d) Promedio mas bajo
 * 
 * Mas Informacion en: https://github.com/diegojes22/Semestre1/tree/main/Programacion
 */
public class PromedioAlumnos {
    public static void main(String[] args) {
        // variables
        int alumnos = 10;
        int el_mas_burro = 0, el_mas_listo = 0;
        float calificacion_alumno = 0;
        float promedio_alumno = 0, promedio_grupal = 0;
        float mayor = 0, menor = 100;
        
        Scanner in = new Scanner(System.in);
        
        for(int alumno = 1; alumno <= alumnos; alumno++) {
            System.out.println("==================================================");
            
            // resetear variables a 0
            promedio_alumno = 0;
            calificacion_alumno = 0;
            
            // pedir calificaciones
            for(int cal = 1; cal <= 5; cal++) {
                System.out.print("Ingrese la calificacion "+cal+": ");
                calificacion_alumno += in.nextFloat();
            }
            
            // sacar promedio
            promedio_alumno = calificacion_alumno / 5;
            promedio_grupal += promedio_alumno;
            
            System.out.println("Promedio del alumno "+alumno+" es de "+promedio_alumno); // mostrar
            if(promedio_alumno < 70) {
                System.out.println("¡El alumno esta reprobado!");
            }
            else {
                System.out.println("¡El alumno esta aprobado!");
            }
            
            // verificar la calificacion mas alta y mas baja
            if(promedio_alumno > mayor) {
                mayor = promedio_alumno;
                el_mas_listo = alumno;
            }
            if(promedio_alumno < mayor && promedio_alumno < menor) {
                menor = promedio_alumno;
                el_mas_burro = alumno;
            }
        }
        
        // sacar promedios generales
        promedio_grupal /= alumnos;
        System.out.println("==================================================");
        System.out.println("El promedio grupal es de "+promedio_grupal);
        System.out.println("\nLa calificacion mayor es de "+mayor+" y pertenece al alumno "+el_mas_listo);
        System.out.println("La calificacion menor es: "+menor+" y pertenece al alumno "+el_mas_burro);
        
        in.close();
    }
}
