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
 * Fecha de elaboración: 28/11/2020
 * 
 * 
 */
public class SumaMatrices {
    // Atributos o variables globales //
    static Scanner in = new Scanner(System.in);
    
    static boolean matrix_ready = false;
    
    static int row1, row2;
    static int c1, c2;
    static int opc = 0;
    
    static int x, y;
    
    static int A[][];
    static int B[][];
    static int C[][];
    
    // Metodos //
    private static void lines() {
        System.out.println("------------------------------------------------------------------------");
    }
    
    // Leer datos de forma manual para la matriz
    public static void read_matrix(int r, int c, int matrix[][]) {
        for(int row = 0; row < r; row++) {
            for(int col = 0; col < c; col++) {
                System.out.print("Ingrese el elemento ["+row+","+col+"] de la matriz: ");
                
                matrix[row][col] = in.nextInt();
            }
        }
    }
    
    // Sumar matrices
    public static void sum_matrix(int M1[][], int M2[][], int M3[][], int r, int c) {
        for(int row = 0; row < r; row++) {
            for(int col = 0; col < c; col++) {
                M3[row][col] = M1[row][col] + M2[row][col];
            }
        }
    }
    
    // restar matrices
    public static void rest_matrix(int M1[][], int M2[][], int M3[][], int r, int c) {
        for(int row = 0; row < r; row++) {
            for(int col = 0; col < c; col++) {
                M3[row][col] = M1[row][col] - M2[row][col];
            }
        }
    }
    
    // multiplicar matrices
    public static void mult_matrix(int M1[][], int M2[][], int M3[][], int r, int c) {
        for(int row = 0; row < r; row++) {
            for(int col = 0; col < c; col++) {
                M3[row][col] = M1[row][col] * M2[row][col];
            }
        }
    }
    
    // Imprimir una matriz
    public static void print_matrix(int matrix[][], int r, int c) {
        System.out.println("[");
        for(int row = 0; row < r; row++) {
            System.out.print("\t[");
            
            for(int col = 0; col < c; col++) {
                System.out.print(matrix[row][col]+", ");
            }
            System.out.println("]");
        }
        System.out.println("]\n");
    }
    
    // Menu
    public static void menu1() {
        System.out.print("Numero de renglones de la matriz A y B: ");
        row1 = in.nextInt();
        System.out.print("Numero de columnas de la matriz A y B: ");
        c1 = in.nextInt();
        
        c2 = c1;
        row2 = row1;
        
        if((row1 == row2) && (c1 == c2)) {
            // definir arreglos
            A = new int[row1][c1];
            B = new int[row2][c2];
            C = new int[row2][c2];
            
            // leer arreglos
            read_matrix(row1, c1, A);
            lines();
            
            read_matrix(row2, c2, B);
            
            matrix_ready = true;
        }
        else {
            System.out.println("Error: Dimensiones diferentes!");
        }
    }
    
    public static void select_menu(int menu_id) {
        switch(menu_id) {
            case 1: {
                menu1();
                break;
            }
            
            case 2: {
                if(matrix_ready) {
                    sum_matrix(A, B, C, row1, c1);
                    System.out.println("OK, las matrices se han sumado y el resultado esta en el arreglo C");
                }else {
                    System.out.println("Por favor, inicialize la matriz en el menu [1]");
                }
                break;
            }
            
            case 3: {
                if(matrix_ready) {
                    rest_matrix(A, B, C, row1, c1);
                    System.out.println("Ok, las matrices se han restado y el resultado esta en el arreglo C");
                }
                else {
                    System.out.println("Por favor, inicialize la matriz en el menu [1]");
                }
                break;
            }
                
            case 4: {
                if(matrix_ready) {
                     mult_matrix(A, B, C, row1, c1);
                    System.out.println("Ok, las matrices se han restado y el resultado esta en el arreglo C");
                }
                else {
                    System.out.println("Por favor, inicialize la matriz en el menu [1]");
                }
                
                break;
            }
                
            case 5: {
                if(matrix_ready) {
                    System.out.print("A = ");
                    print_matrix(A, row1, c1);
                    System.out.print("B = ");
                    print_matrix(B, row1, c1);
                    System.out.print("C = ");
                    print_matrix(C, row1, c1);    
                }
                else {
                    System.out.println("Por favor, inicialize la matriz en el menu [1]");
                }
                
                break;
            }
            
            default :
                break;
                
        }
    }
    
    public static void menu() {
        do {
            lines();
            System.out.println("[1] Leer matrices");
            System.out.println("[2] Sumar matrices");
            System.out.println("[3] Restar matrices");
            System.out.println("[4] Multiplicar matrices");
            System.out.println("[5] Imprimir matrices");
            System.out.println("[6] Salir");
            lines();
            
            System.out.print("Opcion >_ ");
            opc = in.nextInt();
            
            lines();
            select_menu(opc);
            
        } while(opc != 6);
        
        System.out.println("Adios =)");
    }
    
    public static void main(String[] args) {
        menu();
    }
}
