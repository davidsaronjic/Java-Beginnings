package bg;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi n");
		int n = sc.nextInt();
		System.out.println("Suma brojeva koji su delioci broja "+n+" iznosi "+ispisDelioci(n));

	}

	static int ispisDelioci( int n) {
		int suma = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i==0) {
				suma += i;
			}
		}return suma;
	}
	
}
