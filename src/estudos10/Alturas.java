package estudos10;

import java.util.Scanner;

import estudos10en.People;

public class Alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		People[] x = new People[n];

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			double height = sc.nextDouble();
			x[i] = new People(name, age, height);
		}
		
		double sum = 0.0;
		int person = 0;
		
		for (int i = 0; i < n; i++) {
			sum += x[i].getHeight();
			if(x[i].getAge() < 16) {
				person++;
			}
		}
		
		double avg = sum / n;
		double percent = ((double)person / n) * 100.0;
		
		System.out.println("Altura media: " + avg);
		System.out.println("Pessoas com menos de 16 anos: " + percent);
		for (int i = 0; i < n; i++) {
			if(x[i].getAge() < 16) {
				System.out.println(x[i].getName());
			}
		}
		
		sc.close();

		
	}

}
