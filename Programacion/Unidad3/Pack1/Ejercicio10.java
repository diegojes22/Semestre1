package net.diego.unit3.EjerciciosConCiclos;

import java.util.Scanner;

/* 
 * Problema:
 * Escriba un programa que lea un número entre 1 y 12, 
 * si el número está en ese rango, despliega el nombre
 * del mes correspondiente y termina, en caso contrario, 
 * vuelve a pedir el número. (USE CICLO DO-WHILE)
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int read_val = 0;
        
        // entrada
        do {
            System.out.println("Ingrese un numero del 1 al 12: ");
            read_val = in.nextInt();
        } while(read_val < 1 || read_val > 12);
        
        // proceso
        switch(read_val) {
            case 1:
                System.out.println("Mes correspondiente: Enero");
                break;
            case 2:
                System.out.println("Mes correspondiente: Febrero");
                break;
            case 3:
                System.out.println("Mes correspondiente: Marzo");
                break;
            case 4:
                System.out.println("Mes correspondiente: Abril");
                break;
            case 5:
                System.out.println("Mes correspondiente: Mayo");
                break;
            case 6:
                System.out.println("Mes correspondiente: Junio");
                break;
            case 7:
                System.out.println("Mes correspondiente: Julio");
                break;
            case 8:
                System.out.println("Mes correspondiente: Agosto");
                break;
            case 9:
                System.out.println("Mes correspondiente: Septiembre");
                break;
            case 10:
                System.out.println("Mes correspondiente: Octubre");
                break;
            case 11:
                System.out.println("Mes correspondiente: Noviembre");
                break;
            case 12:
                System.out.println("Mes correspondiente: Diciembre");
                break;
        }
    }
}
