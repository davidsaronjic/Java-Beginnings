package dobarpaket;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// a je promenljiv broj,  b je ucitan broj N
		int a, b;
		a = 1;
		System.out.println("Uneti vrednost broja N");
		b = sc.nextInt();
		while(a<=b) {
			if(a % 15 == 0) {
				System.out.println(a);
			}
			a += 1;
		}

	}

}
