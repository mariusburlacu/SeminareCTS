package ro.ase.cts.clase;

public class DepartamentFinanciarEager {
	private int nrAngajati;
	private String numeDirector;
	private double salariulDeBaza;
	
	private static DepartamentFinanciarEager departamentFinanciarEager = new DepartamentFinanciarEager(10, "Popescu", 3000);

	private DepartamentFinanciarEager(int nrAngajati, String director, double salariulDeBaza) {
		this.numeDirector=director;
		this.nrAngajati=nrAngajati;
		this.salariulDeBaza=salariulDeBaza;
	}
	
	public static DepartamentFinanciarEager getInstance() {
		return departamentFinanciarEager;
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setNumeDirector(String numeDirector) {
		this.numeDirector = numeDirector;
	}

	public void setSalariulDeBaza(double salariulDeBaza) {
		this.salariulDeBaza = salariulDeBaza;
	}
	
	@Override
	public String toString() {
		return "DepartamentFinanciarEager [nrAngajati=" + nrAngajati + ", numeDirector=" + numeDirector
				+ ", salariulDeBaza=" + salariulDeBaza + "]";
	}
}
