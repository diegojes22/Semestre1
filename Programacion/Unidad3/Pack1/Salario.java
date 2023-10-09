package net.diego.unit3.EjerciciosConCiclos;

/* 
 * Se ofrece un trabajo que paga a $100 la primera semana, 
 * pero triplica su salario cada semana; es decir, $100 la 
 * primera semana; $300 la segunda semana; $900 la tercera 
 * semana; …etc. Diseñar un algoritmo que determine (y escriba) 
 * el salario por cada semana y el salario pagado hasta la 
 * fecha por espacio de 20 semanas.
*/
public class Salario {
    public static void main(String[] args) {
        // variables
        int salario = 100;
        long acumulado = 0;
        
        for(int semana = 1; semana <= 20; semana++) {
            System.out.println("Salario en la semana "+semana+": $"+salario);
            salario *= 3;
            acumulado += salario;
        }
        
        System.out.println("\nSalario acumulado: $"+acumulado);
    }
}
