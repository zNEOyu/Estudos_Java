package estudos10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estudos10en.Employe;

public class Increase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employe> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employe emp = new Employe(id, name, salary);
			list.add(emp);
		}
		
		System.out.print("Enter the Employee that will have salary increase: ");
		int ids = sc.nextInt();
		
		Integer pos = position(list, ids);
		
		if(pos == null) {
			System.out.println("This id non equizist");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		for(Employe emp : list) {
			System.out.println(emp);
		}
		sc.close();
	}
	
	public static Integer position(List<Employe> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
