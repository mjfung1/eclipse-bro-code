
public class Main {

	public static void main(String[] args) {
		
		
		// polymorphism = 	greek word for poly-'many', morph-'form'
		// 					The ability of an object to identify as more than one type
		// 					when/why do we need it? you may ask
		//					when putting something inside array (all must be same type)
		
		
		
		Boat boat = new Boat();
		Bycicle bike = new Bycicle();
		Car car = new Car();
		
	
		Vehicle[] racers = { boat, bike, car };
		
		for (Vehicle racer : racers) {
			racer.go();
		}
	}
}
 