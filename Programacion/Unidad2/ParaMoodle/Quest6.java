import java.util.Scanner;

/*
 * Problema 6:
 * Escribir un programa que imprima las horas, minutos y segundos 
 * de un tiempo proporcionado en segundos.
 */

public class Quest6 {

    public static void main(String[] args) {
        // variales
        Scanner in = new Scanner(System.in);
        int h = 0, m = 0, s = 0, input_seg;

        // Entrada
        System.out.print("Ingrese los segundos: ");
        input_seg = in.nextInt();

        //proceso
        for(int i = 0; i < input_seg; i++) {
            s += 1;
            if(s >= 60) {
                m += 1;
                s = 0;
            }
            if(m >= 60) {
                h += 1;
                m = 0;
            }
        }

        // Salida
        System.out.println("Horas....: "+h);
        System.out.println("Minutos..: "+m);
        System.out.println("Segundos.: "+s);
        System.out.println("Valor convertido: "+h+":"+m+":"+s);

        in.close();
    }
    
}
