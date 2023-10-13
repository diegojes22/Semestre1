package net.diego.unit3.pack2;

import java.util.Random;
import java.util.Scanner;

/* 
 * @autor Diego Jesus Muñoz Andrade
 * @company TecNM Campus la Piedad
 *
 * Problema:
 * Realize un programa que simule un juego de BlackJack
 *
 * paquete 2
 * 
*/

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int playerTotal = 0;
        int computerTotal = 0;
        
        while (true) {
            int card = random.nextInt(13) + 1; // Genera una carta con valor entre 1 y 13
            if (card > 10) {
                card = 10; // Cartas con valor mayor que 10 valen 10 puntos
            }
            
            playerTotal += card;
            System.out.println("Tu carta: " + card);
            System.out.println("Tu total de puntos: " + playerTotal);
            
            if (playerTotal > 21) {
                System.out.println("¡Te pasaste de 21! ¡Has perdido!");
                break;
            }
            
            System.out.print("¿Quieres otra carta? (Si/No): ");
            String respuesta = scanner.nextLine();
            
            if (!respuesta.equalsIgnoreCase("Si")) {
                break;
            }
        }
        
        // Simulación de la jugada de la computadora
        while (computerTotal < 17) {
            int card = random.nextInt(13) + 1;
            if (card > 10) {
                card = 10;
            }
            computerTotal += card;
        }
        
        System.out.println("Total de puntos de la computadora: " + computerTotal);
        
        if (computerTotal > 21 || (playerTotal <= 21 && playerTotal > computerTotal)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("La computadora gana.");
        }
        
        scanner.close();
    }
}
