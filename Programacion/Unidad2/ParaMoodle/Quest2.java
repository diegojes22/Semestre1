import java.util.Scanner;

/*
 * Problema:
 * En un outlet se ofrecen todos los productos con un 20% de descuento, 
 * escribir un programa que calcule el total a pagar por un producto 
 * con descuento.
 */

public class Quest2 {
    public static void main(String[] args) {
        // variables
        float precio_producto = 0, descuento = 0, total = 0;
        Scanner in = new Scanner(System.in);

        // entrada
        while(precio_producto <= 0) {
            System.out.print("Ingrese el precio del producto: ");
            precio_producto = in.nextInt();
        }

        // proceso
        descuento = (precio_producto * 20) / 100;
        total = precio_producto - descuento;

        // salida
        System.out.println("Precio final: $"+total);

        in.close();
    }
}
