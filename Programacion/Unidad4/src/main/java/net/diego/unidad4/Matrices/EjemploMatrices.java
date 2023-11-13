package Matrices;

import java.util.Scanner;

public class EjemploMatrices {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int Matriz1[][] = new int [3][4];
		
		System.out.println("Leer matriz1 de 3x4");
		
		for(int r=0; r<3; r++) {
			
			for(int c=0; c<4; c++) {
				
				System.out.print("Introduce el elemento "+r+", "+c+": ");
				Matriz1[r][c] = tcld.nextInt();
			}
		}
		
		System.out.println();
		
		for(int r=0; r<3; r++) {
			
			for(int c=0; c<4; c++) {
				
				System.out.print(Matriz1[r][c]+" | ");
			}
			System.out.println();
		}
	}

}