/*
 * Reto 3: Numeros primos
 * Fecha: 24/09/2023
 * 
 * Problema: Escribe un programa que determine si un número dado 
 * es primo o no. Un número primo es aquel que solo es divisible 
 * por 1 y por sí mismo.
 */

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        // variables
        int number = 0, i = 0;
        int res = 0, fail = 0;

        Scanner in = new Scanner(System.in);

        // entrada
        System.out.print("Ingrese un numero: ");
        number = in.nextInt();

        // verificar si es divisible entre mas numeros sin dar un decimal
        for(i = 2; i < number; i++) {
            res = number % i;
            if(res != 0) {
                fail ++;
            }
        }

        // mostrar el resultado
        if(fail == number-2) {
            System.out.println("Numero primo");
        }else {
            System.out.println("No es un numero primo");
        }

        in.close();
    }
}