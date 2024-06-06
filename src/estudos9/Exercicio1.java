package estudos9;

import java.util.Scanner;

import estudos9en.Exercicio1en;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercicio1en a;

		a = new Exercicio1en();

		System.out.print("Enter account number: ");
		a.setNumber(sc.nextInt());
		System.out.print("Enter account holder: ");
		a.setName(sc.next());
		System.out.println("Is there an initial deposit (y/n)? ");
		char c = sc.next().charAt(0);

		if (c == 'y') {
			System.out.print("Enter initial deposit value: ");
			a.addValue(sc.nextDouble());
		} 
		else {
			a.addValue(0);
		}

		System.out.printf("Account data%nAccount %d, Holder: %s, Balance: $ %.2f", a.getNumber(), a.getName(),
				a.getValue());

		System.out.printf("%nEnter deposit value: ");
		a.addValue(sc.nextDouble());

		System.out.printf("Updated Account data%nAccount %d, Holder: %s, Balance: $ %.2f", a.getNumber(), a.getName(),
				a.getValue());

		System.out.printf("%nEnter withdraw value: ");
		a.minusValue(sc.nextDouble());

		System.out.printf("Updated Account data%nAccount %d, Holder: %s, Balance: $ %.2f", a.getNumber(), a.getName(),
				a.getValue());

		sc.close();
	}

}
