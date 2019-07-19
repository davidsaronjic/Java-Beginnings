package domaci0611;

public abstract class Vozilo {
	
	String regBroj;
	String serBroj;
	int velRez;
	double trenGor;
	double potrosnja;
	
	public Vozilo(String sbr, int vrz, double pot) {
		serBroj = sbr;
		velRez = vrz;
		potrosnja = pot;
		trenGor = 0;
	}
	
	public void setRegBroj(String rgb) {
		regBroj = rgb;
	}
	
	public String getRegBroj() {
		return regBroj;
	}
	
	public String getSerBroj() {
		return serBroj;
	}
	
	public int getVelRez() {
		return velRez;
	}
	
	public double getTrenGor() {
		return trenGor;
	}
	
	public double getPotrosnja() {
		return potrosnja;
	}
	
	public void dodajGor(double josGor) {
		if((josGor+trenGor)<=velRez && josGor>0) {
			trenGor+=josGor;
		}else System.out.println("Sipate vise od moguceg ili ste uneli negativno gorivo");
	}
	
	public void oduzmiGor(double manjeGor) {
		if(manjeGor<=trenGor && manjeGor>0) {
			trenGor-=manjeGor;
		}else System.out.println("Oduzimate vise od moguceg ili ste uneli negativno gorivo");
	}

	public abstract double predjeniKm(double km);
	
	//Ser_broj{reg_broj}[gorivo/rezervoar] - potrosnja L/100km
	public String toString() {
		return serBroj + "{" + regBroj + "}[" + trenGor + "/" + velRez + "] - " + potrosnja + " L/100km";
	}
	
	
}
