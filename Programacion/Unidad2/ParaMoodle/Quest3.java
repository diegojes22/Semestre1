import java.util.Scanner;

/*
 * Problema:
 * Escribir un programa que convierta una cantidad leida en metros 
 * a centímetros.
 */

public class Quest3 {
    public static void main(String[] args) {
        // variables
        float metros = 0;
        int centimetros = 0;
        Scanner in = new Scanner(System.in);

        // entrada
        System.out.println("METROS A CENTIMETROS");
        System.out.println("Ingrese los metros para convertirlos a centimetros: ");
        metros = in.nextFloat();

        // proceso
        centimetros = (int) metros * 100;

        // Salida
        System.out.println(metros+"m -> "+centimetros+"cm");

        in.close();
    }
}
