
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// nested loops = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows");
		rows = scanner.nextInt();
		
		System.out.println("Enter # of columns");
		columns = scanner.nextInt();
		
		System.out.println("Enter symbol");
		symbol = scanner.next();
		
		
		for (int i = 0; i < rows; i++) {
			System.out.println();
			for (int j = 0; j < columns; j++) {
				System.out.print(symbol);
			}
		}
		
	}
}
