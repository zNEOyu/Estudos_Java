package estudos6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while (x != 2002) {
			System.out.println("Senha invalida");
			x = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		sc.close();

	}

}
