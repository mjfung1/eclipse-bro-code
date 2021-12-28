
public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("tesla", "model s", 2023);
		Car car2 = new Car("honda", "accord", 2024);
		Car car3 = new Car(car1);
		
//		car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
		
		System.out.println(car2);
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		
		System.out.println(car3);
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());
	}
}
