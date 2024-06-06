package estudos8;

import java.util.Scanner;

import estudos8en.Calculator2;

public class Main7 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = Calculator2.circumference(radius);
		double v = Calculator2.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Math.PI);
		sc.close();
	}
}
