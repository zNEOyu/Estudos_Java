package estudos5;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		if (a <= 25 && a >= 0) {
			System.out.println("Intervalo [0, 25]");
		}
		else if (a > 25 && a <= 50) {
			System.out.println("Intervalo [25, 50]");
		}
		else if (a > 50 && a <= 75) {
			System.out.println("Intervalo [50, 75]");
		}
		else if (a > 75 && a <= 100) {
			System.out.println("Intervalo [75, 100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}
}
