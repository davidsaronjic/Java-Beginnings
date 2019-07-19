package domaci0610;

public class Putnik extends Covek{
	
	private double novac;

	public Putnik(String ImeC, int tez, double novci) {
		super(ImeC, tez);
		novac = novci;
	}
	
	
	public double getNovac() {
		return novac;
	}



	public boolean dodajNovce(double josNov) {
		if(josNov > 0) {
		novac+=josNov;
		return true;
		}else return false;
	}
	
	public boolean oduzmiNovce(double manjeNov) {
		if(manjeNov <= novac) {
		novac-=manjeNov;
		return true;
		}else return false;
	}
	
	
	public String toString() {
		return "Putnik[" + novac + "]-[" + getID() + "]" + getIme() + ": {" + getTezina() + "}";
	}
		
	
	
}
