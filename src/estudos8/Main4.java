package estudos8;

import java.util.Scanner;

import estudos8en.Employee;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee one;
		
		one = new Employee();
		
		System.out.print("Name: ");
		one.name = sc.next();	
		System.out.print("Gross salary: ");
		one.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		one.tax = sc.nextDouble();
		
		System.out.println("Employee: " + one);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		one.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + one);
		
		
		sc.close();
	}

}
