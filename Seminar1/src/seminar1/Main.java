package seminar1;

import classes.Animal;
import classes.Giraffe;
import classes.Zebra;
import classes.Zoo;
import classes.Zookeeper;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Hello!!!");
		
		Zoo zoo = new Zoo();
		Zookeeper keeper = new Zookeeper();
		keeper.setKeeperName("Gigel");
		
		zoo.setKeeper(keeper);
		
		Zebra zebra1 = new Zebra("Morty");
		Zebra zebra2 = new Zebra("Cruella");
		zoo.add(zebra1);
		zoo.add(zebra2);
		
		Giraffe giraffe1 = new Giraffe("Joshua");
		Giraffe giraffe2 = new Giraffe("Christopher");
		zoo.add(giraffe1);
		zoo.add(giraffe2);
		
		zoo.feedAnimals();
	}
}
