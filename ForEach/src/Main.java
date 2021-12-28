import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible
		
//		String[] animals= {"cat", "dog", "rat", "bird"};
		
		ArrayList<String> animals = new ArrayList<>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("shrimp");
		animals.add("horse");
		
		
		for (String animal : animals) {
			System.out.println(animal);
		}
	}
}
