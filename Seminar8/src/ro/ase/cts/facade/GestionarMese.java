package ro.ase.cts.facade;

public class GestionarMese {
	public boolean esteMasaLibera(int cod) {
		if(cod % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
