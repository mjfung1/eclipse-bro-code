import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		// exception = 	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions
		
		Scanner scanner = new Scanner(System.in);
	
		try {
			
			System.out.println("please enter a number");
			int number1 = scanner.nextInt();
			
			System.out.println("enter another number");
			int number2 = scanner.nextInt();
			
			int number3 = number1 / number2;
			System.out.println("result is " + number3);
			
		} 
		// its better to catch each exception separately for custom errors
		catch (ArithmeticException e) {
			System.out.println("cant divide by 0 buddy");
		}
		catch (InputMismatchException e) {
			System.out.println("numbers only. no letters");
		}
		// in case we overlook/miss an exception
		// catches all exception
		catch (Exception e) {
			System.out.println("something went wrong");
		}
		finally {
			// everything inside finally always runs
			// usually for closing scanners. (memory leaks)
			scanner.close();
		}

		
		
		
		
	}
}
