package ro.ase.cts.builder;

public class ConcreteBuilder implements AbstractBuilder {

	private Rezervare rezervare;

	public ConcreteBuilder() {
		rezervare = new Rezervare(0, false, false, false, false, "rock");
	}
	
	@Override
	public Rezervare build() {
		return rezervare;
	}

	public ConcreteBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	
	public ConcreteBuilder setAreBauturaRacoritoare(boolean areBautura) {
		this.rezervare.setAreBauturaRacoritoare(areBautura);
		return this;
	}
	
	public ConcreteBuilder setAreMuzicaAmbientala(boolean areMuzica) {
		this.rezervare.setAreMuzicaAmbientalaPersonalizata(areMuzica);
		return this;
	}
	
	public ConcreteBuilder setAreScaunErgonomic(boolean areScaun) {
		this.rezervare.setAreScaunErgonomic(areScaun);
		return this;
	}
	
	public ConcreteBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	public ConcreteBuilder setCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	}
}
