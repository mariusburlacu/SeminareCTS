package ro.ase.cts.simpleFactory;

public class Program {

	public static void main(String[] args) {
		PersonalSpital personal1;
		PersonalSpital personal2;
		try {
			personal1 = new FactoryPersonal().createPersonal(TipPersonal.Medic, "Popescu", 2500);
			personal2 = new FactoryPersonal().createPersonal(TipPersonal.Brancardier, "Ion", 3500);
			
			System.out.println(personal1.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
