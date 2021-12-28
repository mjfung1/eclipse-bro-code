
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// constructor = special method that is called when an object is instantiated (created)
		
		Human human = new Human("bob", 20, 160.0);
		Human human1 = new Human("jayjay", 32, 140.0);

		Human human2 = new Human("bobyjay", 10, 80.0);

		
		System.out.println(human.name);
		System.out.println(human1.name);
		human2.eat();
		human1.drink();
		
		
//		Car myCar = new Car();
//		
//		System.out.println(myCar.make);
//		System.out.println(myCar.model);
//	
//		myCar.drive();
	}

}
