package estudos8;

import java.util.Scanner;

import estudos8en.Triangle;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do triangulo 1");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do trnagulo 2");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		
		double area1 = x.area();
		double area2 = y.area();
		
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
