package domacitri;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n ");
		int n = sc.nextInt();
		System.out.println("Unesi k");
		int k = sc.nextInt();
		int a[]= new int[n];
		System.out.println("Suma deljivih elemenata sa brojem "+k+" iznosi "+ispisNiza(a, k));
	}

	static int ispisNiza(int[] niz, int k) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		for(int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element "+i);
			niz[i]= sc.nextInt();
			if(niz[i]%k==0) {
				suma += niz[i];
			}
			
		}
		return suma;
		
		
	}
	
	
	
}
