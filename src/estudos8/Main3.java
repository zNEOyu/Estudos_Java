package estudos8;

import java.util.Scanner;

import estudos8en.Product;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product a;
		
		a = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Price: ");
		a.price = sc.nextDouble();
		System.out.print("Name: ");
		a.name = sc.next();
		System.out.print("Quantity in stock: ");
		a.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + a.toString());
		
		System.out.print("Enter the number of prodcts to be addedin stock: ");
		int quantity = sc.nextInt();
		a.AddProducts(quantity);
		System.out.println("Updated data: " + a.toString());
		
		System.out.print("Enter the number of prodcts to be addedin stock: ");
		quantity = sc.nextInt();
		a.removeProducts(quantity);
		
		System.out.println("Updated data: " + a.toString());
		sc.close();
	}

}
