package estudos6;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n == 0) {
			System.out.println(1);
			sc.close();
			return;
		}
		int nu = 1;
		for (int i = 1; i <= n; i++) {
			nu = nu * i;
		}
		System.out.println(nu);
		sc.close();
	}

}
