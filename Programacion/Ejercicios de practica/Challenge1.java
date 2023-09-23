/*
 * FECHA: 22/09/2023
 * 
 * Reto a resolver:
 * Escribe un programa que verifique si una cadena es un palíndromo.
 * Un palíndromo es una cadena que se lee igual de izquierda a derecha
 * y de derecha a izquierda, como "radar" o "oso".
 */

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        // variables
        String word, reverse = "";
        boolean word_is = false;

        Scanner in = new Scanner(System.in);

        // entrada
        System.out.print("Ingrese un palabra: ");
        word = in.nextLine();

        // obtener la cadena al reves
        for(int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        // comparar
        for(int j = 0; j < word.length(); j++) {
            if(reverse.charAt(j) == word.charAt(j)) {
                word_is = true;
            }else {
                word_is = false;
                break;
            }
        }

        // imprimir
        if(word_is) {
            System.out.println(word+" es un palíndromo :D");
        }else {
            System.out.println(word+" no un palíndromo :/");
        }

        in.close();
        
    }
}