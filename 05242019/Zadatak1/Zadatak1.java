package domacizadacidva;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rez = ispisSume(n);
		System.out.println(rez);
		//System.out.println(ispisSume(n));

	}
	
	
	static int ispisSume(int n) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int i = 1;
		while(i<=n) {
			suma += sc.nextInt();
			i++;
		}return suma;
		
	}

}
