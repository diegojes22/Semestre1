/**
 * NOMBRE DEL PROYECTO: Conjuntos JAVA
 * Version: 1.2.0-Console
 * Fecha de inicio: 21/09/2023
 * 
 * Grupo.: 1-C Bis
 * EQUIPO: - Diego Jesus Muñoz Andrade        
 *         - Enoc Arturo Guzmán Rodríguez    
 *         - Laura Fernanda Nuñez Guardado   
 *         - Kike (mencion honorifica y testigo)       
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
 *
 * Origen:
 * https://github.com/diegojes22/Semestre1/blob/diegojes22-finalCorrect/Matematica%20discretas/tarea%205/Conjuntos.java
 */

import java.util.Scanner;
import java.util.Random;

public class Conjuntos {
    // Verificar si existe un elemento ya existente en el un arreglo
    public static boolean check(char[] array, char element, int len) {
        int i;

        for(i = 0; i < len; i++) {
            if(array[i] == element) {
                return true;
            }
        }

        return false;
    }

    // generar un carcter aleatorio
    public static char randChar() {
        Random gen = new Random();

        return (char)(gen.nextInt(26) + 'a');
    }

    // generar un conjunto de caracteres unicos de forma aleatoria (maximo 27)
    public static char[] genRandGroup(int len) {
        char[] array = new char[len];
        char caract;
        int i = 0;

        if(len > 27) {
            System.out.println("Exepcion: valor fuera de rango permitido, maximo 27!");
            System.exit(1);
        }

        // generacion aleatoria
        while(i < len) {
            caract = randChar();

            // hasta que exista un caracter diferente avanzamos
            if(! check(array, caract, len)) {
                array[i] = caract;
                i++;
            }
        }
        
        return array;
    }

    // Mostrar nuestro conjunto
    public static void printArray(char[] array, String name) {
        // codigo ASCII nesesario para una impresion estetica del arreglo
        char back = (char)(0+8);
        String backspace = back+""+back;


        System.out.print(name+" = { ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(backspace+"}");
    }

    public static void main(String[] args) {
        int len1, len2;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Ingrese el numero de elementos del conjunto 1 (entre 5 y 20): ");
            len1 = in.nextInt();
            System.out.print("Ingrese el numero de elementos del conjunto 1 (entre 5 y 20): ");
            len2 = in.nextInt();
        } while(!(len1 >= 5 && len1 <= 20) && (len2 >= 5 && len2 <= 20));

        char[] c1 = genRandGroup(len1);
        char[] c2 = genRandGroup(len2);

        printArray(c1, "A");
        printArray(c2, "B");

        in.close();
    }
}
