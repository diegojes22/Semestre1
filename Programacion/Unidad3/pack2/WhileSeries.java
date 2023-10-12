package net.diego.unit3.pack2;

import java.util.Scanner;

/* 
 * @autor Diego Jesus Muñoz Andrade
 * @company TecNM Campus la Piedad
 *
 * Problema:
 * Escriba un programa que lea un valor entero n mayor o igual a
 * uno (el programa debe validar esto) e imprima el resultado de
 * la siguiente serie:
 *               Serie(n) = 21 – 22 + 23 – 24 + 25…
 *
 * paquete 2
 * 
*/
public class WhileSeries {
    /*-- Metodos --*/
    public static int Serie(int val, boolean printer) {
        /* Aqui esta el proceso */
        
        // variables
        int i = 0, sucecion = 21, result = 0;
        
        // calcular sucecion
        while(i < val) {
            if(printer) // imprimir si el usuario lo desidio asi
                System.out.print(sucecion+", ");
            
            // calcular sucecion
            result += sucecion;
            
            sucecion *= -1;
            if(sucecion < 0) {
                sucecion--;
            }else {
                sucecion++;
            }
            
            i++;
        }
        
        System.out.print("\n"); // salto de linea
        return result;
    }
    
    /*--[ Main ]--*/
    public static void main(String[] args) {
        // vaiables
        Scanner in = new Scanner(System.in);
        int val = 0;
        boolean print_series = false;
        
        // entrada
        System.out.print("Ingrese la longitud de la sucesion: ");
        val = in.nextInt();
        System.out.print("Desea que se muestre la sucecion? true/false \n\t>_");
        print_series = in.nextBoolean();
        
        // llamar proceso y salida
        System.out.println(Serie(val, print_series));
    }
}
