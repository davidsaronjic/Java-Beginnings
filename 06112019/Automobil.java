package domaci0611;

public class Automobil extends Vozilo{
	
	//Vozilo v;

	public Automobil(String sbr, int vrz, double pot) {
		super(sbr, vrz, pot);
	}


	public double predjeniKm(double km) {
	//	if((getPotrosnja()/100)*km==getTrenGor())return km;
		 return getTrenGor()/(getPotrosnja()/100);
	}
	
	public String toString() {
		return "Auto - " + serBroj + "{" + regBroj + "}[" + trenGor + "/" + velRez + "] - " + potrosnja + " L/100km";
	}

}
