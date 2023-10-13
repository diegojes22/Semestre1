package net.diego.unit3.pack2;

import java.util.Scanner;

/* 
 * @autor Diego Jesus Muñoz Andrade
 * @company TecNM Campus la Piedad
 *
 * Problema:
 * Escriba un programa que despliegue el mensaje “¿Desea
 * continuar S o N?” hasta que la respuesta sea igual a ‘N’.
 *
 * paquete 2
 * 
*/
public class YesNo {
    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        char opc;
        
        // entrada
        do {
            System.out.print("Desea continuar con el programa? S / N \n\tC:\\>");
            opc = in.next().charAt(0);
            
        } while(opc != 'n' && opc != 'N');

        in.close();
    }
}
