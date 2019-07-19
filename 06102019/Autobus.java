package domaci0610;

public class Autobus {
	
	private String naziv;
	private Vozac v1;
	private double cenaKarte;
	private Putnik[] putnici;
	
	
	public Autobus(String naz, double cena, int brPutnika) {
		naziv = naz;
		cenaKarte = cena;
		putnici= new Putnik[brPutnika];
	}


	public void dodajVozaca(Vozac v) {
		v1 = v;
	}
	
	public void oduzmiVozaca(Vozac v) {
		v1 = null;
	}
	
	
	public boolean dodajPutnika(Putnik p1, int n) {
		for(int i = 0; i < putnici.length; i++) {
			if(putnici[i]==null && i <= putnici.length && i == n) {
				putnici[i] = p1;
				break;
			}
		}return true;
	}
	
	public boolean oduzmiPutnika(int ID) {
		for(int i = 0; i < putnici.length; i++) {
			if(putnici[i]!=null && putnici[i].getID()==ID) {
				putnici[i] = null;
			}
		}return true;
	}
	
	public void naplatiKartu() {
		for(int i = 0; i < putnici.length; i++) {
			if(v1!=null && putnici[i]!=null) {
				putnici[i].oduzmiNovce(cenaKarte);
			}
		}
	}

	public String toString() {
		String s = "[" + naziv + "]{" + cenaKarte + "}" + "\n";
	//	s += "[" + this.naziv;
	//	s += "]{";
	//	s += this.cenaKarte;
	//	s += "}\n";
		if(v1!=null) s+=v1;
		for(int i = 0; i < putnici.length; i++) {
			if(putnici[i]!=null) {
				s += "\n" + putnici[i];
			}
		}return s;
	}
	
	
	
}
