package ro.ase.cts.simpleFactory;

public class Asistent extends PersonalSpital {

	public Asistent(String name, int salariu) {
		super(name, salariu);
	}

	@Override
	public String toString() {
		return "Asistent [getName()=" + getName() + ", getSalariu()=" + getSalariu() + ", getClass()=" + getClass()
				+ "]";
	}

	
}
