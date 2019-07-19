package domacizadacidva;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n i k");
		int n = sc.nextInt();
		int k =sc.nextInt();
		int rez = ispisFormule(n,k);
		System.out.println("n! * k! je "+rez);

	}
	
	static int ispisFormule(int n, int k) {
		int i = 1;
		int faktn = 1;
		while(i<=n) {
			faktn *= i;
			i++;
		}
		int a = 1;
		int faktk = 1;
		while(a<=k) {
			faktk *= a;
			a++;
		}
		int formula = faktn * faktk;
		return formula;
	}

}
