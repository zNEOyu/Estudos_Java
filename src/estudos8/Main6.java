package estudos8;

import java.util.Scanner;

import estudos8en.Circulo;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circulo a;
		
		a = new Circulo();
		System.out.print("Enter radius: ");
		a.r = sc.nextDouble();
		
		System.out.println("Circumference: " + a.circu());
		System.out.println("Volume: " + a.volum());
		System.out.println("PI value: 3.14");
		
		sc.close();
	}

}
