/**
 * NOMBRE DEL PROYECTO: Conjuntos JAVA
 * Version: 1.2.0-Console
 * Fecha de inicio: 21/09/2023
 * 
 * Grupo.: 1-C Bis
 * EQUIPO: - Diego Jesus Muñoz Andrade        
 *         - Enoc Arturo Guzmán Rodríguez    
 *         - Laura Fernanda Nuñez Guardado  
 * 
 * MENCIONES HONORIFICAS: 
 *         - Kike (testigo)
 *         - Yisus (testigo y apoyo moral)
 *         - Luis (el wicho fue por los refrescos)
 *         - Profe Zambrano (Es el profe)     
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

// Librerias
import java.util.Scanner;
import java.util.Random;

public class Conjuntos {
    /*-- Configurarcion y trabajo con conjuntos (arreglos) --*/

    /*
     * Separador de informacion en consola
     * (por estetica)
     */
    public static void separator() {
        for(int large = 0; large < 55; large++) {
            System.out.print("=");
        }
        System.out.println(""); // salto de linea
    }

    /*
     * Aqui verifico si dos un numero generado aleatoriamente
     * no ha sido generado ya...
     */
    public static boolean check(char[] array, char element, int len) {
        int i;

        for(i = 0; i < len; i++) {
            if(array[i] == element) {
                return true;
            }
        }

        return false;
    }

    /*
     * Genero un caracter aleatorio mediante un
     * objeto Random, y luego hago una conversion
     * explicita  un char
     */
    public static char randChar() {
        Random gen = new Random();

        return (char)(gen.nextInt(26) + 'a');
    }

    /*
     * Genero un conjunto de letras unicas y
     * totalmente aleatorias, ¡si el conjunto
     * sobrepasa 27 elemento, el programa se
     * ciclaria!
     */
    public static char[] genRandGroup(int len) {
        char[] array = new char[len];
        char caract;
        int i = 0;

        // generar la exepcion mencionada para evitar un loop
        if(len > 27) {
            System.out.println("Exepcion: valor fuera de rango permitido, maximo 27!");
            System.exit(1);
        }

        // generacion aleatoria
        while(i < len) {
            caract = randChar();

            // hasta que exista un caracter diferente, avanzamos
            if(! check(array, caract, len)) {
                array[i] = caract;
                i++;
            }
        }
        
        return array;
    }

    /*
     * Imprimir un arreglo de tipo char para que
     * parezca un conjunto y se vea bien
     */
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

    /*
     * Convertir los String con los que realizamos las distintas operaciones
     * de los conjuntos en algo presentable para mostrarlo al usuario.
     */
    public static String niceViewGroup(String A) {
        // codigo ASCII nesesario para una impresion estetica del arreglo
        char back = (char)(0+8);
        String backspace = back+""+back;

        String view = "{";
        for(char element : A.toCharArray()) {
            view += element + ", ";
        }
        view += backspace+"}";

        return view;
    }

    /*-- Operaciones basicas con dos conjuntos --*/
    /*
     * Interseccion: solo obtengo los caracteres
     * que coincidan entre ambos arreglos
     */
    public static String intersection(char[] A, char[] B) {
        String C = "";
        int i = 0, j = 0;

        for(i = 0; i < A.length; i++) {
            for(j = 0; j < B.length; j++) {
                if(A[i] == B[j]) {
                    C += A[i];
                }
            }
        }

        return C;
    }

    /*
     * Union: Obtengo la dferencia de B para eliminar elementos
     * repetidos y luego agrego todo el conjunto A
     */
    public static String union(char[] A, char[] B) {
        String C = "";

        for(char element : A) {
            C += element;
        }

        return C + difference(B, A);
    }

    /* 
     * Diferencia: Obtengo la interseccion de ambos conjuntos, para
     * eliminar las coincidencias que existan del conjunto A con la
     * interseccion.
     */
    public static String difference(char[] A, char[] B) {
        String C = "";
        String N = intersection(A, B);

        int i = 0;

        // agregar los elementos de A en C
        for(i = 0; i < A.length; i++) {
            C += A[i];
        }

        // eliminar los elementos de la interseccion
        for (char n : N.toCharArray()) {
            C = C.replace(String.valueOf(n), "");
        }

        return C;
    }

    /*
     * Diferencia simetrica: Obtengo la diferencia de ambos conjuntos
     * para concatenarla
     */
    public static String symmetricalDifference(char[] A, char[] B) {
        String C = difference(A, B);
        String D = difference(B, A);

        return C + D;
    }

    /*--==[ Main ]==--*/
    public static void main(String[] args) {
        // variales
        int len1, len2;
        Scanner in = new Scanner(System.in);

        // entrada
        System.out.println("====[ Conjuntos JAVA]==================================");
        do {
            System.out.print("Ingrese el numero de elementos del conjunto 1 (entre 5 y 20): ");
            len1 = in.nextInt();
            System.out.print("Ingrese el numero de elementos del conjunto 1 (entre 5 y 20): ");
            len2 = in.nextInt();
            separator();
        } while(!(len1 >= 5 && len1 <= 20) && (len2 >= 5 && len2 <= 20));

        // proceso
        char[] c1 = genRandGroup(len1); // generar arreglos
        char[] c2 = genRandGroup(len2);

        printArray(c1, "A"); // mostar los conjuntos generados aleatoriamente
        printArray(c2, "B");
        separator();

        System.out.println("Union (A u B) ..............: "+niceViewGroup(union(c1, c2)));       // realizar las operaciones basicas con ambos conjuntos
        System.out.println("Interseccion (A n B) .......: "+niceViewGroup(intersection(c1, c2)));
        System.out.println("Diferencia (A - B) .........: "+niceViewGroup(difference(c1, c2)));
        System.out.println("Diferencia (B - A) .........: "+niceViewGroup(difference(c2, c1)));
        System.out.println("Diferencia simetrica (A + B): "+niceViewGroup(symmetricalDifference(c1, c2)));
        separator();

        in.close();
    }
}
