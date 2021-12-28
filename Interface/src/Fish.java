
public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
		System.out.println("i eats small fishies");
	}

	@Override
	public void flee() {
		System.out.println("i scared of big fishies");
	}

	@Override
	public void fight() {
		System.out.println("i fight some fishies");
		
	}

	@Override
	public void jump() {
		System.out.println("i dont jump =(");
		
	}

}
