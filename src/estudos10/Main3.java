package estudos10;

import java.util.Scanner;

import estudos10en.Product;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		for( int i=0; i<n ; i++) {
			sc.nextInt();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for( int i=0; i<n ; i++) {
			sum+= vect[i].getPrice();
		}
		double avg = sum / n;
		System.out.println("Average = " + avg);
		
		sc.close();
	}

}
