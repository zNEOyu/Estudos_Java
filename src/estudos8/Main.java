package estudos8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d ,f ,g, p, p1;
		System.out.println("Entre com as medidas do triangulo 1");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		System.out.println("Entre com as medidas do trnagulo 2");
		d = sc.nextDouble();
		f = sc.nextDouble();
		g = sc.nextDouble();
		
		p = (a+b+c)/2.0;
		p1 = (d+f+g)/2.0;
		double area1 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		double area2 = Math.sqrt(p1 * (p1 - d) * (p1 - f) * (p1 - g));
		
		System.out.printf("Triangulo x area: %.4f%n", area1);
		System.out.printf("Triangulo y area: %.4f%n", area2);
		
		if(area1 > area2) {
			System.out.println("Maior area 1");
		}
		else {
			System.out.println("Maior area 2");
		}
		sc.close();
	}

}
