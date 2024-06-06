package estudos10;

import java.util.Scanner;

import estudos10en.Par;

public class Media_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vertor? ");
		int n = sc.nextInt();
		
		Par[] x = new Par[n];
		
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			x[i] = new Par(number);
		}
		int p = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(x[i].getNumber() % 2 == 0) {
				p++;
				sum += x[i].getNumber();
			}
		}
		if(p == 0) {
			System.out.println("Nenhum par");
		}
		else {
			double avg = sum / p;
			System.out.println("Media dos pares = " + avg);
		}
		
		
		sc.close();

	}

}
