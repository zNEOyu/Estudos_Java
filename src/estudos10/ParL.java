package estudos10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estudos10en.Par;

public class ParL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int counter = 0;
		List<Par> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			if (number % 2 == 0){
				counter++;
			}
			Par emp = new Par(number);
			list.add(emp);
		}
		
		System.out.println("NUMEROS PARES: ");
		for(int i = 0; i < n; i++) {
			if(list.get(i).getNumber() % 2 == 0){
				System.out.print(list.get(i).getNumber() + "  ");
			}
		}
		System.out.println("Quantidade de Pares = " + counter);
		
		sc.close();
	}

}
