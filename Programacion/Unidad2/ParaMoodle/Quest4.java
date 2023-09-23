import java.util.Scanner;

/*
 * Problema:
 * Escribir un programa que lea un número e imprima si el número es 
 * positivo, negativo o cero.
 */

public class Quest4 {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int number = 0;

        // Entrada
        System.out.print("Ingrese un numero: ");
        number = in.nextInt();

        // Proceso y salida
        if(number == 0) {
            System.out.println("El numero "+number+" es un cero, obvio ._.");
        }
        else if(number < 0) {
            System.out.println("El numero "+number+" es positivo :D");
        }
        else {
            System.out.println("El numero "+number+" es negativo :D");
        }

        in.close();
    }
}
