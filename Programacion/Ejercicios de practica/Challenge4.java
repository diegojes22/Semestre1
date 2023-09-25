/*
 * Reto 4: Metodo de la burbuja
 * Fecha: 24/09/2023
 * 
 * Problema: Escribe un programa que ordene una lista de números 
 * enteros de menor a mayor utilizando el algoritmo de ordenamiento 
 * de burbuja.
 */
import java.util.Scanner;
import java.util.Random;

public class Challenge4 {
    public static void main(String[] args) {
        // variables
        Random spawner = new Random();
        Scanner in = new Scanner(System.in);

        int lenght = 0;
        int a,b;

        char back = (char) 0+8;
        String backspace = back+""+back;

        // Entrada
        System.out.print("Ingrese la longitud del conjunto: ");
        lenght = in.nextInt();

        // generacion del conjunto
        int[] array_1 = new int[lenght];

        System.out.print("{");
        for(int i = 0; i < lenght; i++) {
            array_1[i] = spawner.nextInt(100);
            System.out.print(array_1[i]+", ");
        }
        System.out.println(backspace+"}");
        
        // organizarlo
        for(int i = 0; i < array_1.length; i++) {
            for(int j = 0; j < array_1.length; j++) {
                if(j+1 < array_1.length) {
                    if(array_1[j] > array_1[j+1]) {
                        a = array_1[j];
                        b = array_1[j+1];

                        array_1[j] = b;
                        array_1[j+1] = a;
                    }
                }
            }
        }

        // mostar conjunto ordenado
        System.out.print("{");
        for(int i = 0; i < array_1.length; i++) {
            System.out.print(array_1[i]+", ");
        }
        System.out.println(backspace+"}");

        in.close();
    }
}