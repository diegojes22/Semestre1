import java.util.Scanner;

/**
 * @author Diego
 * @company TecNM Campus La Piedad
 * 
 * Problema:
 * Escribe un programa que lea un entero mayor o igual a 2 e
 * imprima el resultado de la siguiente multiplicatoria:
 *          n / n-1
 * Programar con for
 * 
 * paquete 2
 */
public class Multiplicatoria {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;
        float multiplicatoria = 1;
        
        // pedir datos
        do{
            System.out.print("Ingrese un numero <mayor a 2>: ");
            n = in.nextInt();
        }while(n < 2);
        
        // hacer multiplicatoria
        System.out.print("Multiplicatoria("+n+") = ");
        for(float i = 2; i <= n; i++) {
            multiplicatoria *= i / (i - 1);
            
            System.out.print(i+"/"+(i-1)+" * ");
        }
        
        // Mostrar resultado
        System.out.println("\nMultiplicatoria = "+multiplicatoria);
    }
}
