package ro.ase.cts.clase;

public class DepartamentFinanciarLazy {
	private int nrAngajati;
	private String numeDirector;
	private double salariulDeBaza;
	
	private static DepartamentFinanciarLazy departamentFinanciarLazy = null;

	private DepartamentFinanciarLazy(int nrAngajati, String director, double salariulDeBaza) {
		this.nrAngajati=nrAngajati;
		this.numeDirector=director;
		this.salariulDeBaza=salariulDeBaza;
	}
	
	public static synchronized DepartamentFinanciarLazy getInstance(int nrAngajati, String director, double salariulDeBaza) {
		if(departamentFinanciarLazy == null) {
			departamentFinanciarLazy = new DepartamentFinanciarLazy(nrAngajati, director, salariulDeBaza);
		}
		
		return departamentFinanciarLazy;
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
		return "DepartamentFinanciarLazy [nrAngajati=" + nrAngajati + ", numeDirector=" + numeDirector
				+ ", salariulDeBaza=" + salariulDeBaza + "]";
	}
}
