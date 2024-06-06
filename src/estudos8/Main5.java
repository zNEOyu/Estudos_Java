package estudos8;

import java.util.Scanner;

import estudos8en.Student;

public class Main5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student x;
		
		x = new Student();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f", x.media());
		
		if (x.media() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", x.miss());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();
	}
}
