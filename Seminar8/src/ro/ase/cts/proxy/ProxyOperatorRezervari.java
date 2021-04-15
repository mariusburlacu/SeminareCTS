package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari {

	private OperatorRezervari operatorRezervari;
	
	private static final int NR_MINIM_PERSOANE = 4;
	
	public ProxyOperatorRezervari(OperatorRezervari operatorRezervari) {
		super();
		this.operatorRezervari = operatorRezervari;
	}

	@Override
	public void realizeazaRezervare(int nrPersoane) {
		if(nrPersoane >= NR_MINIM_PERSOANE ) {
			operatorRezervari.realizeazaRezervare(nrPersoane);
		} else {
			System.out.println("Minim 4 persoane!");
		}
	}

}
