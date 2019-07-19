package dobarpaket;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// x je realan broj pa ce biti double
		double x, y;
		System.out.println("Uneti vrednost x");
		x = sc.nextDouble();
		y = 34 * x + x / 59;
		System.out.println("Vrednost y iznosi "+y);

	}

}
