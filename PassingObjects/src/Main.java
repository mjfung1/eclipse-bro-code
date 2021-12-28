
public class Main {

	
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car1 = new Car("Tesla");
		Car car2 = new Car("Honda");
		Car car3 = new Car("Lambo");
		Car car4 = new Car("Smart car");

		
		garage.park(car1);
		garage.park(car2);
		garage.park(car3);
		garage.park(car4);

	}
}
