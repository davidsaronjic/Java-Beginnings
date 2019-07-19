package domaci0611;

public class Teretno extends Vozilo{
	
	//Vozilo v;

	public Teretno(String sbr, int vrz, double pot) {
		super(sbr, vrz, pot);
	}


	public double predjeniKm(double km) {
		return (getTrenGor() / (getPotrosnja() / 100))/3;
	}

	public String toString() {
		return "Teretno - " + serBroj + "{" + regBroj + "}[" + trenGor + "/" + velRez + "] - " + potrosnja + " L/100km";
	}
}
