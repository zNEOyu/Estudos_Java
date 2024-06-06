package estudos6;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int in = 0, out = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x > 9 && x < 21) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.println(in + " In");
		System.out.println(out + " Out");
		sc.close();

	}

}
