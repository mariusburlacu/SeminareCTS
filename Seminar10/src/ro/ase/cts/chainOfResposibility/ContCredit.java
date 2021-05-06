package ro.ase.cts.chainOfResposibility;

public class ContCredit extends Handler {

	public ContCredit(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma) {
			System.out.println("S-a realizat plata de " + suma + " din contul de credit");
			super.setSold((super.getSold()-suma));
		} else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
