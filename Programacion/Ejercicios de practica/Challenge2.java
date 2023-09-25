/*
 * Reto 2: FACTORIAL DE UN NUMERO
 * Fecha: 24/9/2023
 * 
 * Problema: Escribe un programa que calcule el factorial de un número dado. 
 * El factorial de un número entero n se calcula como el producto de todos 
 * los enteros positivos desde 1 hasta n.
 */

 import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        long factor = 1;
        int number = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular su factorial: ");
        number = in.nextInt();

        for(; number > 0; number--) {
            factor *= number;
        }

        System.out.println("Factorial del numero es: "+factor);

        in.close();

    }
}