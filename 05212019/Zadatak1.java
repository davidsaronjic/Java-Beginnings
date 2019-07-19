package domacizadaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		int x = 1;
		
		while(x != 0) {
			x = sc.nextInt();
			suma += x;
		}
		System.out.println(suma);
	}

}
