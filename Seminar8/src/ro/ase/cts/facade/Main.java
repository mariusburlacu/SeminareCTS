package ro.ase.cts.facade;

public class Main {

	public static void main(String[] args) {
//		GestionarMese gestionarMese = new GestionarMese();
//		Picolo picolo = new Picolo();
		Masa masa = new Masa(4, 5);
//		
//		if(gestionarMese.esteMasaLibera(masa.getCod())) {
//			if(picolo.esteMasaDebarasata(masa.getCod())) {
//				if(picolo.areMasaServetele(masa.getCod())) {
//					System.out.println("Poftiti la masa cu codul " + masa.getCod());
//				} else {
//					System.out.println("Mai asteptati putin!");
//				}
//			} else {
//				System.out.println("Mai asteptati putin!");
//			}
//		} else {
//			System.out.println("Mai asteptati putin!");
//		}
		
		Facade facade = new Facade();
		if(facade.potAsezaLaMasa(masa)) {
			System.out.println("Poftiti la masa cu codul " + masa.getCod());
		} else {
			System.out.println("Mai asteptati putin");
		}
	}

}
