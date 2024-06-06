package estudos10;

import java.util.Scanner;

import estudos10en.Rent;

public class Room {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rent[] x = new Rent[10];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.println("Name: ");
			String name = sc.nextLine();
			String email = sc.next();
			int room = sc.nextInt();
			x[room] = new Rent(name, email, room);
		}
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (x[i] != null) {
				System.out.println(x[i]);
			}
		}
		
		sc.close();

	}

}
