package estudos5;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			if (a % b != 0) {
				System.out.println("Nao sao Multiplos");
			}
			else {
				System.out.println("Sao Multiplos");
			}
		}
		else {
			if (b % a != 0) {
				System.out.println("Nao sao Multiplos");
			}
			else {
				System.out.println("Sao Multiplos");
			}
		}
		sc.close();
		
	}

}
