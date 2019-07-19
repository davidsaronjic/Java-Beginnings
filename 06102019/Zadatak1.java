package domaci0610;

public class Zadatak1 {
	public static void main(String args[]) {
		int n=6;
		double cena=100;
		Vozac v= new Vozac("Misko Maric",150);
		Autobus a= new Autobus("Misko Komerc",cena,n);
		Putnik p1= new Putnik("Nikola",150,1000);
		Putnik p2= new Putnik("Jovan",150,50);
		Putnik p3= new Putnik("Milica",150,400);
		a.dodajVozaca(v);
		dodavanjePutnika(a.dodajPutnika(p1, 0));
		dodavanjePutnika(a.dodajPutnika(p2, 1));
		dodavanjePutnika(a.dodajPutnika(p3, 2));
		
		a.naplatiKartu();
		System.out.println(a);
		p2.dodajNovce(200);
		dodavanjePutnika(a.dodajPutnika(p2, 4));
		a.naplatiKartu();
		System.out.println(a);
	}
	private static void dodavanjePutnika(boolean rez) {
		System.out.println((rez?"Uspesno":"Neuspesno")+" dodat" );
	}
}
