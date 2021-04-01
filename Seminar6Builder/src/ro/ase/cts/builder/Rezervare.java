package ro.ase.cts.builder;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaRacoritoare;
	private boolean areMuzicaAmbientalaPersonalizata;
	private boolean areScaunErgonomic;
	private String genMuzica;
	
	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areBauturaRacoritoare,
			boolean areMuzicaAmbientalaPersonalizata, boolean areScaunErgonomic, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		this.areScaunErgonomic = areScaunErgonomic;
		this.genMuzica = genMuzica;
	}
	
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}



	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}



	public void setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
	}



	public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
	}


	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}



	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areMancareInclusa=" + areMancareInclusa
				+ ", areBauturaRacoritoare=" + areBauturaRacoritoare + ", areMuzicaAmbientalaPersonalizata="
				+ areMuzicaAmbientalaPersonalizata + ", genMuzica=" + genMuzica + "]";
	}
	
	
	
}
