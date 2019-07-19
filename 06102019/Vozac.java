package domaci0610;

public class Vozac extends Covek {
	

	
	public Vozac(String ImeC, int tez) {
		super(ImeC, tez);
	
	}
	
	public String toString() {
		return "Sofer-[" + getID() + "]" + getIme() + ":{" + getTezina() + "}";
	}
	
	

}
