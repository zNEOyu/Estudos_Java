package estudos10;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] x = new String[n];
		double[] y = new double[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = sc.next();
			y[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += y[i];
		}
		System.out.println("Average price = " + sum / n);
		sc.close();

	}

}
