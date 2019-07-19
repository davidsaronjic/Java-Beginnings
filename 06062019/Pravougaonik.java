package domaci0606;

public class Pravougaonik {
	
	private int a;
	private int b;
	
	
	public Pravougaonik() {
		
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}

	public void setAB(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int povrsina(int a, int b) {
		return a * b;
	}
	
	public int obim(int a, int b) {
		return 2*a + 2*b;
	}
	
	

}
