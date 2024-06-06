package estudos6;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a, b;
			a = sc.nextDouble();
			b = sc.nextDouble();
			if (b == 0) {
				System.out.println("Impossivel");
			}
			else {
				System.out.printf("%.1f", a / b);
			}
		}
		sc.close();

	}

}
