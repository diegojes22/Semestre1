/*
 * Reto 5: Susecion de Fibonacci
 * Fecha: 24/09/2023
 * 
 * Problema: Escribe un programa que genere la secuencia de Fibonacci hasta 
 * un número dado de términos. La secuencia de Fibonacci comienza con 0 y 1,
 * y cada término posterior es la suma de los dos términos anteriores.
 */

public class Challenge5 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.println("SUCECION DE FIBONACCI");

        for(int i = 0; i < 20; i++) {
            System.out.print(a+", "+b+", ");
            a += b;
            b += a;
        }
    }
}