import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
		// ArrayList = a resizable array.  Elements can be added and removed after compilation
		// 				phase. Stores reference data types
		
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		food.clear();
		
		System.out.println(food);
	}
}
