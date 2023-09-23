import java.util.Scanner;

/* 
 * Problema:
 * Una empresa desea un programa que calcule el sueldo a pagar por semana a cada uno de sus agentes de ventas según los siguientes criterios: 
 * 1. Todos los agentes de ventas tienen un sueldo fijo semanal de 1,500.00
 * 2. Si el agente tuvo ventas mayores a 5000.00 se le agregará un 30% de comisión a su salario fijo.
 * 3. Si el agente tuvo ventas menores a 5000.00 pero mayores a 1000.00 se le agregrá un 15% de comisión a su salario fijo.
 * 4. Si el agente tuvo ventas menores o iguales a 1000.00 no cobrará comisión.
 */
public class Quest1 
{
    public static void main(String[] args) {
        // Variables
        int sueldo_fijo = 1500, comision = 0;
        float ventas = 0, taza = 0, total = 0;

        Scanner in = new Scanner(System.in);

        // Entrada
        System.out.println("Ingrese las ventas del agente es pesos: ");
        ventas = in.nextFloat();

        // Proceso
        if(ventas >= 5000) {
            comision = 30;
            taza = (ventas * comision) / 100;
        }else if(ventas < 5000 && ventas >= 1000) {
            comision = 15;
            taza = (ventas * comision) / 100;
        }else {
            comision = 0;
            taza = 0;
        }

        total = sueldo_fijo+taza;

        // Salida
        System.out.println("INFORMACION DE PAGA");
        System.out.println("Salario fijo ..............: $"+sueldo_fijo);
        System.out.println("Ventas ....................: $"+ventas);
        System.out.println("Porcentaje de la comision .: "+taza+"%");
        System.out.println("Taza de ganancia ..........: $"+taza+"\n");
        System.out.println("Total .....................: $"+total);

        in.close();
    }
}