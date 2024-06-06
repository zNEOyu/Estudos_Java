package estudos10;

import java.util.Scanner;

import estudos10en.Numero;

public class Negativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		do {
			System.out.println("Quantos numeros? ");
			n = sc.nextInt();
		}
		while(n <= 0 || n > 10);
		
		Numero[] s = new Numero[n];

		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			s[i] = new Numero(number);
		}
		
		System.out.println("Numeros negativos: ");
		
		for(int i = 0; i < n; i++) {
			if (s[i].getNumber() < 0 ) {
				System.out.println(s[i].getNumber());
			}
		}
		
		sc.close();

	}

}
