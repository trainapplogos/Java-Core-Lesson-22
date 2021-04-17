package ua.lviv.trainapplogos.L5mod;

public class ApplicationTask1 {
	public static void main(String[] args) {
		Pet cow = () -> System.out.println("I'm cow - Moo-Moo");
		voice(cow);
		
		Pet cat = () -> System.out.println("I'm cat - Meow-Meow");
		voice(cat);
		
		Pet dog = () -> System.out.println("I'm dog - Bark-Bark");
		dog.voice();
//		voice(dog);
	}
	public static void voice(Pet pet) {
		pet.voice();
	}
}

@FunctionalInterface
interface Pet {
	void voice(); 		
}