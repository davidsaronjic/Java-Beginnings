package domacitri;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xc, yc, xb, yb;
		System.out.println("Unesi poz crne figure");
		xc = sc.nextInt();
		yc = sc.nextInt();
		System.out.println("Unesi poz bele figure");
		xb = sc.nextInt();
		yb = sc.nextInt();
		if(ispisSah(xc, yc, xb, yb)) {
			System.out.println("NOMNOM");
		}else System.out.println("NE");

	}

	static boolean ispisSah(int xc, int yc, int xb, int yb) {
		     //(xc>0 && xc<=8 && yc>0 && yc<=8 && xb>0 && xb <=8 && yb>0 && yb<=8) moze da se doda kao uslov zbog velicine table
			if(xc == xb || yc == yb || xc + yc == xb + yb || xc - yc == xb - yb) {
				return true;
			}
			else return false;
	}
	
	
}
