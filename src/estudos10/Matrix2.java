package estudos10;

import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		n =  sc.nextInt();
		m =  sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Position 0,1: ");
		System.out.println(mat[0][0]);
		System.out.println(mat[0][2]);
		System.out.println(mat[1][1]);
		
		sc.close();

	}

}
