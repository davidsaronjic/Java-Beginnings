package dobarpaket;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// a je promenljiv broj,  b je ucitan broj N
		int a, b;
		System.out.println("Unesi vrednost broja N");
		b = sc.nextInt();
		a = b - 1;
		
		while(a >= 1) {
			System.out.println(a);
			a = a - 1;
		}
		

	}

}
