package ro.ase.cts.simpleFactory;

public class Brancardier extends PersonalSpital{

	public Brancardier(String name, int salariu) {
		super(name, salariu);
	}

	@Override
	public String toString() {
		return "Brancardier [getName()=" + getName() + ", getSalariu()=" + getSalariu() + ", getClass()=" + getClass()
				+ "]";
	}
	
	

}
