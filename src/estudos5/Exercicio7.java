package estudos5;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Origem");
		}
		sc.close();
	}
}
