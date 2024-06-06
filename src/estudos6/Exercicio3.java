package estudos6;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gas = 0, alco = 0, dies = 0;
		int client = 0;
		while(client != 4) {
			System.out.println("1 gaso, 2 alco, 3 diesel, 4 fim");
			client = sc.nextInt();
			if(client == 2) {
				gas++;
			}
			if(client == 1) {
				alco++;
			}
			if(client == 3) {
				dies++;
			}
		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alco);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + dies);
		
		sc.close();

	}

}
