package estudos10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i]; 
		}
		System.out.println(sum / n);
		sc.close();

	}

}
