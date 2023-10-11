package net.diego.unit3.EjerciciosConCiclos;

import java.util.Scanner;

/* 
 * Problema:
 * Escribe un programa que lea 3 números reales: el límite inferior
 * de la serie LI y el límite superior de la serie LS y el incremento
 * INC. Si el valor del incremento es negativo la serie deberá
 * decrecer, si el incremento es positivo la serie deberá ir
 * aumentando. Y utilizando un ciclo FOR . El programa deberá
 * imprimir en pantalla la secuencia de números desde LI hasta LS
 * en incrementos INC o desde LS hasta LI en decrementos INC.
 *
 * paquete 2
 * 
*/
public class LimitesIncremento {
    public static void main(String[] args) {
        // variables
        float lim_sup, lim_inf, inc;
        Scanner in = new Scanner(System.in);
        
        // pedir datos
        do{
            System.out.print("Ingrese el limite inferior: ");
            lim_inf = in.nextFloat();
            System.out.print("Ingrese el limite suprior: ");
            lim_sup = in.nextFloat();
            System.out.print("Ingrese el incremento: ");
            inc = in.nextFloat();
        }while(lim_inf >= lim_sup);
        
        // proceso
        for(float i = lim_inf; i <= lim_sup; i += inc) {
            System.out.print(i+" ");
        }
    }
}