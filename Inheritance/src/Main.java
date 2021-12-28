
public class Main {

	
	public static void main(String[] args) {
		
		Car car = new Car();
		Bycicle bike = new Bycicle();
		
		bike.stop();
		car.go();
		System.out.println(car.speed);
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);

		
	}
}
