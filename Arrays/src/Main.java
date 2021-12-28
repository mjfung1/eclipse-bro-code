
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		
		// array = used to store multiple values in a single variable
		
		String[] cars = {"honda", "toyota", "tesla"};
		
		cars[0] = "appleCar";
		
		System.out.println(cars[0]);
		
		
		
		// can create array this way too
		
		String[] brands = new String[3];
		brands[0] = "zara";
		brands[1] = "hm";
		brands[2] = "express";
		
		System.out.println(Arrays.asList(brands));
	}
}
