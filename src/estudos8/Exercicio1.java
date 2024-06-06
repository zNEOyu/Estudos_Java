package estudos8;

import java.util.Scanner;

import estudos8en.Dolar;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cot, amount;
		
		System.out.print("What is the dollar price? ");
		cot = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		amount = sc.nextDouble();
		
		double valor = Dolar.real(cot, amount);
		
		System.out.printf("Amount to be paid in reais = %.2f", valor);
		sc.close();
	}

}
