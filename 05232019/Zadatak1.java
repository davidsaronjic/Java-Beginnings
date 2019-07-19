package domacizadacidva;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int suma = 0;
		int raz = 0;
		
		while(x != 0) {
			x = sc.nextInt();
			if(x%2==0) {
				suma += x;
				
			}else if(x%2!=0) {
				raz -= x;
				
			}

			
		}
		System.out.println(suma);
		System.out.println(raz);

	}

}
