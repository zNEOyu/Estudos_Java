package estudos5;

import java.util.Scanner;

public class Exercicios9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = 50.00;
		
		int b = sc.nextInt();
		
		if (b > 100) {
			a += (2 * (b - 100));
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", a);
		
		sc.close();
	}

}
