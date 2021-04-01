package ro.ase.cts.builderV2;

public class ConcreteBuilder implements AbstractBuilder{
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaRacoritoare;
	private boolean areMuzicaAmbientalaPersonalizata;
	private boolean areScaunErgonomic;
	private String genMuzica;
	
	public ConcreteBuilder setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}
	public ConcreteBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}
	public ConcreteBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		return this;
	}
	public ConcreteBuilder setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		return this;
	}
	public ConcreteBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}
	public ConcreteBuilder setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	@Override
	public Rezervare build() {
		return new Rezervare(codRezervare, areMancareInclusa, areBauturaRacoritoare, areMuzicaAmbientalaPersonalizata,
				areScaunErgonomic, genMuzica);
	}
}
