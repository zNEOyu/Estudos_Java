package estudos6;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		while(x == 0) {
			System.out.println("escreva X");
			x = sc.nextInt();
		}
		while(y == 0) {
			System.out.println("escreva Y");
			y = sc.nextInt();
		}
		
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
