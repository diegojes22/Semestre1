import java.util.Scanner;

public class App {
    /*--[ Main ]--*/
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        float radius, height, volume, area;
        
        // Entrada
        System.out.print("Ingrese el radio del cilindro: ");
        radius = in.nextFloat();
        System.out.print("Ingrese la altura del cilindro:  ");
        height = in.nextFloat();
        
        // Proceso
       volume = (float) (Math.PI * height * Math.pow(radius, 2));
       area = (float) (2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius, 2));
       
       // Salida
       System.out.println("Volumen = "+volume);
       System.out.println("Area = "+area);
    }
}
