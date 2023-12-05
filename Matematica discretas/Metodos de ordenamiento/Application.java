import java.util.Scanner;

public class Application
{
    public static void lines() {
        System.out.println("--------------------------------------------------");
    }
    public static void main(String[] args)
    {
        // Variables
        Scanner input = new Scanner(System.in);
        
        String names[], original_list[];
        int n = 0, i = 0, j = 0;

        // Solicitar datos
        do {
            System.out.print("Ingrese el numero de nombres a ingresar (5-20): ");
            n = input.nextInt();
        } while(n < 5 || n > 20);

        names = new String[n];

        for(i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            names[i] = input.next();
        }

        original_list = names.clone(); // Clonar arreglo

        // Ordenar
        for(i = 0; i < n; i++) {
            for(j = 0; j < n - 1; j++) {
                if(names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Mostrar datos
        lines();
        System.out.println("Original\t\t\tOrdenado");
        lines();

        for(i = 0; i < n; i++) {
            System.out.println(original_list[i] + "\t\t\t\t" + names[i]);
        }

        lines();
    }
}