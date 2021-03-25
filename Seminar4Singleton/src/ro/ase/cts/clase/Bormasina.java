package ro.ase.cts.clase;

public class Bormasina {
	private String nume;
	private double putere;
	private int pret;
	
	private static Bormasina bormasina = null;

	private Bormasina(String nume, double putere, int pret) {
		this.nume = nume;
		this.putere = putere;
		this.pret = pret;
	}
	
	public static synchronized Bormasina getInstance(String nume, double putere, int pret) {
		if(bormasina == null) {
			bormasina = new Bormasina(nume, putere, pret);
		}
		return bormasina;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPutere(double putere) {
		this.putere = putere;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Bormasina [nume=" + nume + ", putere=" + putere + ", pret=" + pret + "]";
	}
}
