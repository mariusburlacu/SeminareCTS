package ro.ase.cts.main;

import ro.ase.cts.clase.DepartamentFinanciarEager;
import ro.ase.cts.clase.DepartamentFinanciarLazy;

public class Main {

	public static void main(String[] args) {
		DepartamentFinanciarEager primulDepartamentFinanciarEager = DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepartamentFinanciarEager = DepartamentFinanciarEager.getInstance();
		
		System.out.println(primulDepartamentFinanciarEager.toString());
		System.out.println(alDoileaDepartamentFinanciarEager.toString());
		
		primulDepartamentFinanciarEager.setNrAngajati(15);
		alDoileaDepartamentFinanciarEager.setNumeDirector("Ionescu");
		
		System.out.println(primulDepartamentFinanciarEager.toString());
		System.out.println(alDoileaDepartamentFinanciarEager.toString());
		
		DepartamentFinanciarLazy primulDepartamentFinanciarLazy = DepartamentFinanciarLazy.getInstance(25, "Georgescu", 3500);
		DepartamentFinanciarLazy alDoileaDepartamentFinanciarLazy = DepartamentFinanciarLazy.getInstance(30, "Andreescu", 4000);
		
		System.out.println(primulDepartamentFinanciarLazy.toString());
		System.out.println(alDoileaDepartamentFinanciarLazy.toString());
		
		primulDepartamentFinanciarLazy.setNrAngajati(50);
		alDoileaDepartamentFinanciarLazy.setSalariulDeBaza(7000);
		
		System.out.println(primulDepartamentFinanciarLazy.toString());
		System.out.println(alDoileaDepartamentFinanciarLazy.toString());
	}

}
