
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		// HashMap implements the Map interface (need import)
		// HashMap is similar to ArrayList, but with key-value pairs
		// stores objects, need to use Wrapper Class.
		// ex: (name, email), (username,userID), (country,capital)
	
		HashMap<String, String> countries = new HashMap<>();
		
		// add a key and value
		countries.put("USA", "Washington DC");
		countries.put("India", "New Delhi");
		countries.put("China", "Beijing");
		
	
//		countries.remove("USA");
//		String value = countries.get("China");
//		System.out.println(value);
//		
//		
////		countries.clear();
//		countries.replace("USA", "NEW YORK");
//		System.out.println(countries);
//		
//		System.out.println(countries.containsKey("China"));
		
		for (String key : countries.keySet()) {
			System.out.println(key);
			System.out.println(countries.get(key));
		}
	
	}
}
