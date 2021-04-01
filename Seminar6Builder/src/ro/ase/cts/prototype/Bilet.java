package ro.ase.cts.prototype;

public class Bilet implements AbstractPrototype{
	private int codBilet;
	private String echipaA;
	private String echipaB;
	private String dataMeci;
	private String locBilet;
	
	private Bilet() {
		super();
	}

	public Bilet(int codBilet, String echipaA, String echipaB, String dataMeci, String locBilet) {
		super();
		this.codBilet = codBilet;
		this.echipaA = echipaA;
		this.echipaB = echipaB;
		this.dataMeci = dataMeci;
		this.locBilet = locBilet;
	}

	public void setCodBilet(int codBilet) {
		this.codBilet = codBilet;
	}

	public void setLocBilet(String locBilet) {
		this.locBilet = locBilet;
	}

	@Override
	public String toString() {
		return "Bilet [codBilet=" + codBilet + ", echipaA=" + echipaA + ", echipaB=" + echipaB + ", dataMeci="
				+ dataMeci + ", locBilet=" + locBilet + "]";
	}

	@Override
	public AbstractPrototype copiaza() {
		Bilet bilet = new Bilet();
		bilet.codBilet = this.codBilet;
		bilet.dataMeci = this.dataMeci;
		bilet.echipaA = this.echipaA;
		bilet.echipaB = this.echipaB;
		bilet.codBilet = this.codBilet;
		
		return bilet;
	}
	
	
}
