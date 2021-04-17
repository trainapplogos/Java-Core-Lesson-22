package ua.lviv.trainapplogos.L5mod;

public class ApplicationTask2 {
	public static void main(String[] args) {
		Frog frogToEat = () -> System.out.println("000");
		Frog frogToSleep = () -> System.out.println("123");
		Frog frogToSwim = () -> System.out.println("456");
		Frog frogToWalk = () -> System.out.println("789");
		
		action(frogToEat);
		action(frogToSleep);
		action(frogToSwim);
		action(frogToWalk);
		
	}
	
	public static void action(Frog frog) {
		frog.activity();
	}
	
}

@FunctionalInterface
interface Frog extends Amphibia {}

@FunctionalInterface
interface Amphibia {
	void activity();
}