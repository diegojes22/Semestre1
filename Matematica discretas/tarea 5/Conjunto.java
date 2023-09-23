/**
 * NOMBRE DEL PROYECTO: Conjuntos JAVA
 * Version: 1.0.0-Console
 * Fecha de inicio: 21/09/2023
 * 
 * Grupo.: 1-C Bis
 * EQUIPO: - Diego Jesus Muñoz Andrade       ! Ingeniebro en software 
 *         - Enoc Arturo Guzmán Rodríguez    ! Estaba en el chisme
 *         - Laura Fernanda Nuñez Guardado   ! Tambien estaba en el chisme
 *         - Kike (mencion honorifica)       ! No pertenece oficialmente pero dio apoyo moral
 * 
 * Organizacion: Tecnologico Nacional de Mexico
 * Plantel.....: Campus La Piedad
 * 
 * PROBLEMA:
 * Realizar un programa que permita generar los conjuntos A y B con 'n' y
 * 'm' elementos respectivamente los cuales seran pedidos al usuario y
 * deberan tener un rango de entre 5 y 20 elementos por conjunto.
 * Los elementos deberan ser generados aleatoriamente considerando solamente
 * el abecedario en minusculas.
 */

//-- Librerias --//
import java.util.Random;
import java.util.Scanner;

class Conjunto{
    //--[ Main ]--//
    public static void main(String[] args) {
        /* Declaracion de variables */
        int lenght1, lenght2;
        int i = 0, j = 0;
        
        Random generador = new Random();
        char letra_conjunto = ' ';

        Scanner in = new Scanner(System.in);

        char back = (char)8;

        /* Entrada */
        // Sistema de entrada, el rango es de 5 y 20
        do {
            System.out.print("Ingrese la longitud del conjunto 1 (entre 5 y 20): ");
            lenght1 = in.nextInt();

            System.out.print("Ingrese la longitud del conjunto 2 (entre 5 y 20): ");
            lenght2 = in.nextInt();

            System.out.println("========================================================");
        } while(!((lenght1 >= 5 && lenght1 <= 20) && (lenght2 >= 5 && lenght2 <= 20)));

        /* Proceso */
        // Crear los conjuntos
        char[] conjunto1 = new char[lenght1];
        char[] conjunto2 = new char[lenght2];

        // Generacion aleatoria de caracteres para el conjunto 1
        for(i = 0; i < lenght1; i++) {
            letra_conjunto = (char)(generador.nextInt(26)+'a');

            for(j = 0; j < i; j++) { // aqui verifico que no exista dicho caracter generado
                if(letra_conjunto == conjunto1[j]) {
                    letra_conjunto = (char)(generador.nextInt(26)+'a');
                }
            }

            conjunto1[i] = letra_conjunto;
        }

        // Generacion aleatoria de caracteres para el conjunto 2
        for(i = 0; i < lenght2; i++) {
            letra_conjunto = (char)(generador.nextInt(26)+'a');

            for(j = 0; j < i; j++) { // aqui verifico que no exista dicho caracter generado
                if(letra_conjunto == conjunto2[j]) {
                    letra_conjunto = (char)(generador.nextInt(26)+'a');
                }
            }

            conjunto2[i] = letra_conjunto;
        }

        /* Salida */
        // Imprimir en formato de conjunto
        System.out.print("A = {");
        for(i = 0; i < lenght1; i++) {
            System.out.print(conjunto1[i]+", ");
        }

        System.out.print(back+""+back+"} \nB = {");
        for(i = 0; i < lenght2; i++) {
            System.out.print(conjunto2[i]+", ");
        }

        /* Salida */
        System.out.print(back+""+back+"}\n\n");

        in.close();
    }
}