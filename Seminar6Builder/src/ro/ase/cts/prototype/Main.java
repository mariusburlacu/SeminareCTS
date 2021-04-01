package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		ContClient client = new ContClient("Georgica", 18);
		ContClient client2 = (ContClient) client.copiaza();
		
		System.out.println(client.toString());
		System.out.println(client2.toString());
		
		Bilet bilet1 = new Bilet(101, "Borussia Monchengladbach", "Bayern Munchen", "02/04/2021", "31C");
		Bilet bilet2 = new Bilet(201, "Eintracht Frankfurt", "Stuttgart", "04/04/2021", "23F");
		
		Bilet bilet3 = (Bilet) bilet1.copiaza();
		bilet3.setCodBilet(301);
		bilet3.setLocBilet("45H");
		
		Bilet bilet4 = (Bilet) bilet1.copiaza();
		bilet4.setCodBilet(401);
		bilet4.setLocBilet("29I");
		
		System.out.println(bilet1.toString());
		System.out.println(bilet2.toString());
		System.out.println(bilet3.toString());
		System.out.println(bilet4.toString());
	}

}
