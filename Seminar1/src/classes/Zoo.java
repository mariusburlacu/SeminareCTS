package classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> animals;
	private Zookeeper keeper;

	public Zoo() {
		super();
		animals = new ArrayList<Animal>();
		keeper = new Zookeeper();
	}

	public Zoo(List<Animal> animals, Zookeeper keeper) {
		super();
		this.animals = animals;
		this.keeper = keeper;
	}
	
	public void add(Animal animal) {
		animals.add(animal);
	}
	
	public void feedAnimals() {
		for(Animal animal : animals) {
			keeper.feed(animal);
		}
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zookeeper getKeeper() {
		return keeper;
	}

	public void setKeeper(Zookeeper keeper) {
		this.keeper = keeper;
	}
	
	

}
