package ro.ase.cts.facade;

public class Picolo {
	public boolean esteMasaDebarasata(int cod) {
		if(cod % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean areMasaServetele(int cod) {
		if(cod % 3 == 1) {
			return true;
		} else {
			return false;
		}
	}
}
