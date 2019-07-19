package domacizadaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		System.out.println("Upisi vrednost za x, y i z");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		int suma = 0;
		for(int a = x; a <= y; a+=1) {
			if(a % z == 0) {
				suma += a;
			}
		}
		System.out.println("Suma deljivih brojeva sa z je "+suma);

	}

}
