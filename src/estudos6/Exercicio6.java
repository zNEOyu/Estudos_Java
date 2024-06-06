package estudos6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a, b ,c;
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			System.out.printf("%.1f", ((a * 2)+(b * 3)+(c * 5)) / 10);
		}
		sc.close();
	}

}
