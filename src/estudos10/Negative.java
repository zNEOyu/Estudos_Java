package estudos10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estudos10en.Nega;

public class Negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar");
		int n = sc.nextInt();
		
		List<Nega> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um valor: ");
			int number = sc.nextInt();
			Nega emp = new Nega(number);
			list.add(emp);
		}
		System.out.println("Numeros negativos");
		for(int i = 0; i < n; i++) {
			if(list.get(i).getNumber() < 0){
				System.out.println(list.get(i).getNumber());
			}
		}
		sc.close();

	}

}
