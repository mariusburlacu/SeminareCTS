package ro.ase.cts.command;

public class Main {

	public static void main(String[] args) {
		ContBancar contBancar = new ContBancar("Mrsk", 0);
		
		ManagerComenzi managerComenzi = new ManagerComenzi();
		managerComenzi.invoca(new ComandaConstituire(contBancar, 1000));
		managerComenzi.invoca(new ComandaDepunere(contBancar, 200));
		managerComenzi.executaComanda();
		
		managerComenzi.invoca(new ComandaRetragere(contBancar, 500));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}

}
