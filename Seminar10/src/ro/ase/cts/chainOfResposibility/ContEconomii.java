package ro.ase.cts.chainOfResposibility;

public class ContEconomii extends Handler {

	public ContEconomii(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma) {
			System.out.println("S-a realizat plata de " + suma + " din contul de economii");
			super.setSold((super.getSold()-suma));
		} else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
