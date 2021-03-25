package ro.ase.cts.simpleFactory;

public class Medic extends PersonalSpital {

	public Medic(String name, int salariu) {
		super(name, salariu);
	}

	@Override
	public String toString() {
		return "Medic [getName()=" + getName() + ", getSalariu()=" + getSalariu() + ", getClass()=" + getClass() + "]";
	}

	
}
