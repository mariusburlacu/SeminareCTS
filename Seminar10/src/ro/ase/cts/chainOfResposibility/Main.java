package ro.ase.cts.chainOfResposibility;

public class Main {

	public static void main(String[] args) {
		Handler contCredit = new ContCredit(500);
		Handler contCurent = new ContCurent(250);
		Handler contEconomii = new ContEconomii(200);
		Handler refuzaTranzactia = new RefuzaTranzactia();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaTranzactia);
		
		contCurent.realizeazaPlata(700);
	}

}
