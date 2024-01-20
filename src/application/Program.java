package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of lines: ");
		int n = input.nextInt();
		System.out.print("Number of columns: ");
		int m = input.nextInt();
		
		int[][] matrix = new int[n][m];
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Position[" + (i + 1) + "][" + (j + 1) + "] :");
				matrix[i][j] = input.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Matrix:");
		for (int[] lines : matrix) {
			System.out.println();
			for (int elements : lines) {
				System.out.print(elements + " ");
			}
		}
		
		System.out.println("\n");
		System.out.print("Enter a element from matrix: ");
		int position = input.nextInt();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (position == matrix[i][j]) {
					System.out.println(("Position: [" + (i + 1) + "][" + (j + 1) + "]"));
					if (j > 0)
						System.out.println("Left: " + matrix[i][j-1]);
					if (j < matrix[i].length-1)
						System.out.println("Right: " + matrix[i][j+1]);
					if (i < matrix.length-1)
						System.out.println("Down: " + matrix[i+1][j]);
					if (i > 0)
						System.out.println("Up: " + matrix[i-1][j]);
				}
			}
		}
		
		input.close();
	}
}