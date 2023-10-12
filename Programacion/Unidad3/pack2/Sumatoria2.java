package net.diego.unit3.pack2;

import java.util.Scanner;

/* 
 * @autor Diego Jesus Muñoz Andrade
 * @company TecNM Campus la Piedad
 * 
 * Problema 6:
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
public class Sumatoria2 {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        
        int N, X;
        float resultado = 0, sumatoria = 0;
        
        // Entrada
        System.out.print("Ingrese el rango de la sumatoria: ");
        N = in.nextInt();
        System.out.print("Ingrese el valor de X: ");
        X = in.nextInt();
        
        System.out.println("\n");
        System.out.print("Sumatoria("+X+"^"+N+") = ");
        
        // proceso
        for(int i = 1; i <= N; i++) {
            resultado = (float)( Math.pow(X, i+1) );
            sumatoria += resultado;
            System.out.print(X+"^"+(i+1)+" + ");
        }
        
        // resultado
        System.out.println("\n\nResultado = "+sumatoria);
        
        in.close();
    }
}