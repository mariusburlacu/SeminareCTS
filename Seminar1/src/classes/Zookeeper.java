package classes;

public class Zookeeper {
	private String keeperName;

	public String getKeeperName() {
		return keeperName;
	}


	public void setKeeperName(String keeperName) {
		this.keeperName = keeperName;
	}



	public void feed(Animal animal) {
		System.out.println(keeperName + " hraneste animalul " + animal.getName());
	}
}
