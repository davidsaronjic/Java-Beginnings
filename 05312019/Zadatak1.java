package bg;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi n");
		int n = sc.nextInt();
		int[] niz = new int[n];
		//upisNiz(niz);
		if(upisNiz(niz)) {
			System.out.println("Rastuce");
		}
		else System.out.println("Nije rastuce");
		
		

	}

	static boolean upisNiz(int[]niz) {
		Scanner sc=new Scanner(System.in);
		boolean o = true;
		for(int i = 0; i < niz.length; i++) {
			System.out.println("Unesi vrednost elementa "+i);
			niz[i] = sc.nextInt();
		}
		for(int i = 0; i < niz.length-1; i++) {
			if(niz[i] > niz[i+1]) {
				return false;
			}
		}
		return true;
		
	}
	
	/*static boolean proveraNiz(int [] niz) {
		boolean o = false;
		for(int i = 1; i < niz.length; i++) {
			if(niz[i] > niz[i-1]) {
				o = true;
			}else o = false;
		}
		return o;
	}*/
	
}
