
public class Main {

	
	public static void main(String[] args) {
		
		// interface =	a template that can be applied to a class.
		// 				similar to inheritance, but specifies what a class has/must do.
		// 				classes can apply more than one interface, inheritance is limited to 1 super
	
		
	Rabbit rabbit = new Rabbit();
	rabbit.flee();
	rabbit.jump();
	
	Hawk hawk = new Hawk();
	hawk.fight();
	hawk.hunt();
	
	Fish fish = new Fish();
	fish.fight();
	fish.hunt();
	fish.flee();
	fish.jump();
	
	}
}
