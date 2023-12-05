package net.diego.unidad5;
import java.util.Scanner;

/**
 * @author: Diego Jesus Muñoz Andrade
 * 
 * 1-C Bis
 * 
 * Instituto Tecnológico de La Piedad
 * Ingeniería en Sistemas Computacionales
 * 
 * Fecha de elaboración: 1/2/2023
 * 
 */


// FUNCIONAMIENTO 
// Columnas son los dias y las filas son las ciudades
//            | Lunes | Martes | Miercoles | ... |
// La piedad  |       |        |           |     |
// Zamora     |       |        |           |     |
// Leon       |       |        |           |     |
// Guadalajara|       |        |           |     |
// Yurecuaro  |       |        |           |     |
// Zinaparo   |       |        |           |     |
// Ecuandureo |       |        |           |     |
//
// * Hay que obtener el promedio de temperaturas por dia -OK!
// * Obtener el promedio de temperaturas mas baja y mas alta de toda la semana -OK!
// * Obtener ciudades con temperaturas mas bajas que el promedio -OK!
// * Dias con temperatura mas bajas que el promedio -OK!
public class Temperaturas {
    
    /* Atributos */
    static Scanner in = new Scanner(System.in);
    
    /* Main */
    public static void main(String[] args) {
        
        // Variables //
        String days[] = {
            "Lunes",
            "Martes",
            "Miercoles",
            "Jueves",
            "Viernes"
        };
        String ciudades[] = {
            "La Piedad",
            "Zamora",
            "Leon",
            "Guadalajara",
            "Yurecuaro",
            "Zinaparo",
            "Ecuandureo"
        };
        
        int rows = 7, cols = 5;
        int temperaturas[][] = new int[rows][cols];
        
        float promt = 0;
        float promt_ciudad = 0;
        
        // Solicitar datos
        lines();
        System.out.println("INGRESE TEMPERATURAS");
        read_matrix(temperaturas, ciudades, days, rows, cols);
        lines();
        
        // Calculos
        // Promedio de temperaturas por dia
        System.out.println("Promedio de temperaturas por dia: ");
        print_array(days);
        print_array(calculate_day_promt(temperaturas, rows, cols));
        
        lines();
        
        // Promedio de temperaturas semanal
        promt = promedio(calculate_day_promt(temperaturas, rows, cols));
        
        System.out.println("Promedio de temperatura semanal: ");
        System.out.println(promt);
        
        // Ciudades con temperaturas mas bajas que el promedio
        lines();
        
        promt_ciudad = promedio(calculate_city_promt(temperaturas, rows, cols));
        
        System.out.println("Ciudad con la temperatura mas baja que el promedio: ");
        System.out.println(ciudades[
                ciudad_promedio_menor(promt_ciudad, 
                        calculate_city_promt(temperaturas, rows, cols)
                )
        ]);
        System.out.println("Co una temperatura minima de "+
                ciudad_promedio_menor(promt_ciudad, 
                        calculate_city_promt(temperaturas, rows, cols)
                )
        );
        
        // Ciudades con temperaturas mas altas al promedio
        lines();
        
        promt_ciudad = promedio(calculate_city_promt(temperaturas, rows, cols));
        
        System.out.println("Ciudad con la temperatura mas altas que el promedio: ");
        System.out.println(ciudades[
                ciudad_promedio_mayor(promt_ciudad, 
                        calculate_city_promt(temperaturas, rows, cols)
                )
        ]);
        System.out.println("Con una temperatura maxima de "+
                ciudad_promedio_mayor(promt_ciudad, 
                        calculate_city_promt(temperaturas, rows, cols)
                )
        );
        
    }
    
    /* Otros metodos */
    public static void lines() {
        System.out.println("------------------------------------------------------------------------");
    }
    
    public static void print_array(float array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(i+"\t");
        }
    }
    
    public static void print_array(String array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(i+"\t");
        }
    }
    
    public static float promedio(float[] array) {
        float promedio = 0;
        for(int i = 0; i < array.length; i++) {
            promedio += array[i];
        }
        
        promedio /= array.length;
        
        return promedio;
    }
    
    public static int ciudad_promedio_menor(float promedio, float[] temperatura_ciudad) {
        int menor = 100;
        int pos = 0;
        
        for(int i = 0; i < temperatura_ciudad.length; i++) {
            if(temperatura_ciudad[i] < menor) {
                menor = (int)temperatura_ciudad[i];
                pos = i;
            }
        }
        
        return menor;
    }
    public static int pos_ciudad_promedio_menor(float promedio, float[] temperatura_ciudad) {
        int menor = 100;
        int pos = 0;
        
        for(int i = 0; i < temperatura_ciudad.length; i++) {
            if(temperatura_ciudad[i] < menor) {
                menor = (int)temperatura_ciudad[i];
                pos = i;
            }
        }
        
        return pos;
    }
    
    public static int ciudad_promedio_mayor(float promedio, float[] temperatura_ciudad) {
        int mayor = 0;
        int pos = 0;
        
        for(int i = 0; i < temperatura_ciudad.length; i++) {
            if(temperatura_ciudad[i] > mayor) {
                mayor = (int)temperatura_ciudad[i];
                pos = i;
            }
        }
        
        return mayor;
    }
    
    public static int pos_ciudad_promedio_mayor(float promedio, float[] temperatura_ciudad) {
        int mayor = 0;
        int pos = 0;
        
        for(int i = 0; i < temperatura_ciudad.length; i++) {
            if(temperatura_ciudad[i] > mayor) {
                mayor = (int)temperatura_ciudad[i];
                pos = i;
            }
        }
        
        return pos;
    }
    
    public static void read_matrix(int matrix[][], String[] ciudades, String[] days, int r, int c) {
        for(int i = 0; i < r; i ++) {
            System.out.println("TEMPERATURAS EN: "+ciudades[i]);
            for(int j = 0; j < c; j++) {
                System.out.print("En "+days[j]+": ");
                matrix[i][j] = in.nextInt();
            }
            
            System.out.println();
        }
    }
    
    public static float[] calculate_city_promt(int matrix[][], int r, int c) {
        float promedio[] = new float[r];
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                promedio[i] = matrix[i][j];
            }
            
            promedio[i] /= c;
        }
        
        return promedio;
    }
    
    public static float[] calculate_day_promt(int matrix[][], int r, int c) {
        float promedio[] = new float[c];
        
        for(int j = 0; j < c; j++) {
            for(int i = 0; i < r; i++) {
                promedio[j] += matrix[i][j]; 
            }
            
            promedio[j] /= r;
        }
        
        return promedio;
    }
    
}
