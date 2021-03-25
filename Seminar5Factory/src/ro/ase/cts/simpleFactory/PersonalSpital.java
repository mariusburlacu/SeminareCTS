package ro.ase.cts.simpleFactory;

public abstract class PersonalSpital {
	private String name;
	private int salariu;
	
	public PersonalSpital(String name, int salariu) {
		super();
		this.name = name;
		this.salariu = salariu;
	}

	public String getName() {
		return name;
	}

	public int getSalariu() {
		return salariu;
	}

//	@Override
//	public String toString() {
//		return "PersonalSpital [name=" + name + ", salariu=" + salariu + "]";
//	}
	
}
