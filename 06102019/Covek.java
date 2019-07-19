package domaci0610;

public class Covek {
	
	private String ime;
	private int tezina;
	private int ID;
	private static int idStatic;
	
	
	
	public Covek (String ImeC, int tez) {
		ime = ImeC;
		tezina = tez;
		++idStatic;
		idStatic = ID;
	}
	
	public String getIme() {
		return ime;
	}
	
	public int getTezina() {
		return tezina;
	}
	
	public int getID() {
		return ID;
	}

	public String toString() {
		return "[" +ID+ "]" + ime + ":{" + tezina + "}";
	}
}
