package net.diego.unit3.EjerciciosConCiclos;

import java.util.Scanner;

public class SistemaDeComision_LaPiedadSA {
    public static void main(String[] args) {
        // variables
        float venta = 0, comision = 0, taza = 0;
        Scanner in = new Scanner(System.in);
        
        int vendedor = 1;
        while(vendedor <= 20) {
            System.out.print("Ingrese el monto del vendedor "+vendedor+": >");
            venta = in.nextFloat();
            
            // verificar comision
            if(venta >= 1_000_000 && venta < 3_000_000) {
                taza = 0.03f;
                comision = venta * taza;
            }
            else if(venta >= 3_000_000 && venta < 5_000_000) {
                taza = 0.04f;
                comision = venta * taza;
            }
            else if(venta >= 5_000_000 && venta < 7_000_000) {
                taza = 0.05f;
                comision = venta * taza;
            }
            else if(venta >= 7_000_000) {
                taza = 0.06f;
                comision = venta * taza;
            }
            else {
                taza = 0;
                comision = 0;
            }
            
            // mostrar datos
            System.out.println("Porcentaje de anancia: %"+taza);
            System.out.println("Comision: $"+comision);
            
            vendedor++;
        }
    }
}
