package net.diego.unit3.EjerciciosConCiclos;

import java.util.Scanner;

/* 
 * Problema:
 * Diseñe un algoritmo que lea 100 votos otorgados a cinco 
 * candidatos a presidente municipal e imprima el número 
 * del candidato ganador y su cantidad de votos.
*/
public class SistemaINE {
    public static void main(String[] args) {
        // Variables
        int morena = 0, pri = 0, pan = 0, prd = 0, partido_verde = 0;
        int voto = 0, i = 0;
        
        Scanner in = new Scanner(System.in);
        
        // pedir datos
        while(i < 110) {
            System.out.println("Por quien quiere votar?");
            System.out.println("[1] morena");
            System.out.println("[2] pri");
            System.out.println("[3] pan");
            System.out.println("[4] prd");
            System.out.println("[5] partido_verde");
            
            voto = in.nextInt();
            
            switch(voto) {
                case 1: {
                    morena++;
                    i++;
                    break;
                }
                case 2: {
                    morena++;
                    i++;
                    break;
                }
                case 3: {
                    morena++;
                    i++;
                    break;
                }
                case 4: {
                    morena++;
                    i++;
                    break;
                }
                case 5: {
                    morena++;
                    i++;
                    break;
                }
                default: {
                    System.out.println("Opcion no disponible, intente de nuevo por favor...");
                    break;
                }
            }
            
        }
        
        // verificar quien gano
        if(morena > pri && morena > pan && morena > prd && morena > partido_verde) {
            System.out.println("MORENA gana las elecciones");
        }
        else if(pri > morena && pri > pan && pri > prd && pri > partido_verde) {
            System.out.println("PRI gana las elecciones, ¡Fraude!");
        }
        else if(pan > morena && pan > pri && pan > prd && pan > partido_verde) {
            System.out.println("PAN gana las elecciones, ¡Fraude!");
        }
        else if(prd > morena && prd > pri && prd > pan && prd > partido_verde) {
            System.out.println("PRD gana las elecciones, ¡Fraude!");
        }
        else if(partido_verde > morena && partido_verde > pri && partido_verde > pan && partido_verde > prd) {
            System.out.println("Partido Verde gana las elecciones, ¡Fraude!");
        }
        else {
            System.out.println("¡Empate!");
        }
    }
}
