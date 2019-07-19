package dobarpaket;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		// a = kredit,  b = kamata,  c = novac za vracanje
		double a, b, c;
		System.out.println("Unesi iznos podignutog kredita");
		a = sc.nextDouble();
		System.out.println("Unesi procenat kamatne stope");
		b = sc.nextDouble();
		c = a*(1+0.01*b);
		System.out.println("Kolicina novca za vracanje bance iznosi "+c);

	}

}
