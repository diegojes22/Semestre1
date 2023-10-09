package net.diego.unit3.EjerciciosConCiclos;

import java.util.Scanner;

/* 
 * Diseñe el siguiente programa: Suponga que tiene una tienda 
 * y desea registrar sus ventas por medio de una computadora. 
 * Diseñe un algoritmo que lea por cada cliente (15 clientes)
 * el monto de la venta, calcule e imprima el iva (16%), calcule 
 * e imprima el total a pagar de cada uno de los clientes
*/
public class StoreSales {
    public static void main(String[] args) {
        // variables
        float venta = 0, iva = 0, total = 0, acumulado = 0;
        Scanner in = new Scanner(System.in);

        int i = 1;
        while( i <= 15) {
            System.out.println("Ingrese el monto de la venta del cliente "+i+": ");
            venta = in.nextFloat();
            
            // calcular datos
            iva = venta * 0.16f;
            total = iva + venta;
            
            acumulado += total;
            
            // mostrar
            System.out.println("Venta: $"+venta);
            System.out.println("IVA: $"+iva);
            System.out.println("Total: $"+total);
            System.out.println("=============================================");
            
            i++;
        }
        
        System.out.println("Total acumulado: "+acumulado);
    }
}
