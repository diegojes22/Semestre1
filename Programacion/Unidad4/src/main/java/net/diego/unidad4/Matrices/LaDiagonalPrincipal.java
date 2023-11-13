package Matrices;

/**
 *
 * @author Diego Muñoz
 * TECNOLOGICO NACIONAL DE MEXICO
 * 
 * 6/noviembre/2023
 * 
 * Programa que muestre una matriz de 20x20
 * con diagonal principal en 1 en las otras
 * posiciones 0
 */
public class LaDiagonalPrincipal {
    public static void main(String[] args) {
        // variables
        int matrix[][] = new int[20][20];
        
        // rellenar matriz
        for(int i = 0; i < 20; i++) {
            for(int j = 0; j < 20; j++) {
                if(j == i) {
                    matrix[i][j] = 1;
                }else {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // imprimir
        System.out.println("[");
        for(int i = 0; i < 20; i++) {
            System.out.print("\t[");
            for(int j = 0; j < 20; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
}
