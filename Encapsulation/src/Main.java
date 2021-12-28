
public class Main {

	
	public static void main(String[] args) {
		
		// Encapsulation =	attributes of a class will be hidden or private,
		//					Can be accessed only thru methods (getters n setters)
		// 					You should make attributes private if you don't have a reason to make them public
		
		Car car = new Car("tesla", "model s", 2023);
		
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		System.out.println(car.getName());
	}
}
