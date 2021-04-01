package ro.ase.cts.builder;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new ConcreteBuilder().setAreBauturaRacoritoare(true).setCodRezervare(1).setAreMancareInclusa(true).build();
		Rezervare rezervare2 = new ConcreteBuilder().setAreMancareInclusa(true).setCodRezervare(2).setAreMuzicaAmbientala(true).build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		
		ConcreteBuilder builder = new ConcreteBuilder().setAreBauturaRacoritoare(true);
		Rezervare rezervare3 = builder.build();
		Rezervare rezervare4 = builder.setCodRezervare(125).build();
		rezervare3.setCodRezervare(250);
		
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());
	}
}
