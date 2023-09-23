import java.util.Scanner;

/*
 * Problema:
 * Escribir un programa que calcule el perímetro de un triángulo 
 * rectángulo dada la base y la altura:
 * -- perímetro = base + altura + hipotenusa.
 * -- hipotenusa = raizCuadrada(base^2 + altura^2)
 */

public class Quest5 {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        float base = 0, altura = 0, hip = 0, perimetro = 0;

        // Entrada
        while(base < 1 && altura < 1) {
            System.out.print("Ingrese la base del triangulo: ");
            base = in.nextFloat();
            System.out.print("Ingrese la altura: ");
            altura = in.nextFloat();
        }
        
        // proceso
        hip = (float) Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        perimetro = base + altura + hip;

        // salida
        System.out.println("Hipotenusa = "+hip);
        System.out.println("Perimetro = "+perimetro);

        in.close();
    }
}
