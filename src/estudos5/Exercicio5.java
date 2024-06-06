package estudos5;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a == 1) {
			System.out.printf("Total: R$ %.2f", 4.00 * b);
		}
		
		if (a == 2) {
			System.out.printf("Total: R$ %.2f", 4.50 * b);
		}
		
		if (a == 3) {
			System.out.printf("Total: R$ %.2f", 5.00 * b);
		}
		
		if (a == 4) {
			System.out.printf("Total: R$ %.2f", 2.00 * b);
		}
		
		if (a == 5) {
			System.out.printf("Total: R$ %.2f", 1.50 * b);
		}
		sc.close();

	}

}
