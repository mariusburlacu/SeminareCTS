package ro.ase.cts.builderV2;

public class Main {

	public static void main(String[] args) {
		ConcreteBuilder builder = new ConcreteBuilder().setAreBauturaRacoritoare(true).setAreMancareInclusa(true).setAreScaunErgonomic(true);
		
		Rezervare rezervare1 = builder.build();
		Rezervare rezervare2 = builder.build();
		rezervare2.setAreBauturaRacoritoare(false);
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());

	}

}
