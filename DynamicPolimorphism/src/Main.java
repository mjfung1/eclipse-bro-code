import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("please select an animal?");
			System.out.println("1=cat or 2=dog");
			int choice = scanner.nextInt();
			

			if (choice == 1) {
				animal = new Cat();
				animal.speak();
			} 
			else if (choice == 2) {
				animal = new Dog();
				animal.speak();
			}
			else {
				animal = new Animal();
				System.out.println("try again");
				animal.speak();
			}
		} catch(Exception e)
		 {
			System.out.println("Please input a number. no letter");
			System.out.println(e);
		}
		
	}

}
