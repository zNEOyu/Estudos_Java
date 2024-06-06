package estudos5;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		
		if(r <= 2000.00) {
			System.out.println("Isento");
		}
		else if(r > 2000.00 && r <= 3000.00) {
			System.out.printf("R$ %.2f", (r - 2000.00) / 100 * 8);
		}
		else if(r > 3000.00 && r <= 4500.00) {
			System.out.printf("R$ %.2f", (80 + (r - 3000.00) / 100 * 18));
		}
		else{
			System.out.printf("R$ %.2f", (80 + 270 + (r - 4500.00) / 100 * 28));
		}
		sc.close();
	}

}
