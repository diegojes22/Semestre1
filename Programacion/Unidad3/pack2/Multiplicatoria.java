package UnitThree;

import java.util.Scanner;

/**
 * @author Diego
 * @company TecNM Campus La Piedad
 * 
 * Problema:
 * Escribe un programa que lea un entero mayor o igual a 2 e
 * imprima el resultado de la siguiente multiplicatoria:
 *          n / n-1
 * Programar con for
 * 
 * paquete 2
 */
public class Multiplicatoria {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;
        float resultado = 0, multiplicatoria = 1;
        
        // pedir datos
        do{
            System.out.print("Ingrese un numero <mayor a 2>: ");
            n = in.nextInt();
        }while(n < 2);
        
        // hacer multiplicatoria
        System.out.print("Multiplicatoria("+n+") = ");
        for(int i = 2; i <= n; i++) {
            resultado = i / (i - 1);
            multiplicatoria *= resultado;
            
            System.out.print(i+"/"+(i-1)+" * ");
            System.out.println(multiplicatoria);
        }
        System.out.println("");
        
        // Mostrar resultado
        System.out.println("Multiplicatoria = "+multiplicatoria);
    }
}
