package estudos5;
import java.util.Scanner;
public class exercicios2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if ((x % 2) != 0) {
			System.out.println("IMPAR");
		}
		else {
			System.out.println("PAR");
		}
		
		sc.close();
	}

}
