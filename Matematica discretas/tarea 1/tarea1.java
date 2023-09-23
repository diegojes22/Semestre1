import java.util.Scanner;

public class tarea1 
{
   public static void main(String[] args) {
      // declare variables
      int unidad = 0;
      int numero = 0;
      int contador = 0;
      int centena = 0;
      int decena = 0;

      Scanner in = new Scanner(System.in);
      
      while	(true) {
         System.out.print("Ingrese un numero entre 1 y 999: ");
         numero = in.nextInt();

         if (numero > 0 && numero < 1000)	
            break;
      }

      while (contador <= numero){
         unidad ++;

         if (unidad == 10) {
            unidad = 0;
            decena ++;
         }

         if (decena == 10) {
            decena = 0;
            centena ++;
         }

         contador ++;
      }

      System.out.println("Numero ingresado: " + numero);
      System.out.println("Unidades: " + (unidad-1));
      System.out.println("Decenas: " + decena);
      System.out.println("Centena: " + centena);

      in.close();
   } // close main
} // close tarea1
