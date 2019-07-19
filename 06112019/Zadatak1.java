package domaci0611;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Automobil a = new Automobil("00104", 50, 6);
		a.setRegBroj("BG364HU");
		a.dodajGor(30);
		System.out.println(a);
		System.out.println(a.predjeniKm(500));
		
		
		Teretno t = new Teretno("00451", 100, 10);
		t.setRegBroj("BG890DO");
		t.dodajGor(30);
		System.out.println(t);
		System.out.println(t.predjeniKm(500));
		

	}

}
