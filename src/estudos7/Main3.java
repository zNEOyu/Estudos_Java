package estudos7;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int high = max(a, b, c);
		
		showResult(high);
		
		sc.close();

	}
	public static int max(int x, int y, int z) {
		int aux;
		if (x > z && x > y) {
			aux = x;
		}
		else if (z > x && z > y) {
			aux = z;
		}
		else {
			aux = y;
		}
		return aux;
	}
	public static void showResult(int h) {
		System.out.println("Higher= " + h);
	}

}
