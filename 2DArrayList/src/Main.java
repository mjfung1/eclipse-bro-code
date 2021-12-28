
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		
		produceList.add("potato");
		produceList.add("garlic");
		produceList.add("tomato");
		
		ArrayList<String> drinkList = new ArrayList<String>();
		
		drinkList.add("juice");
		drinkList.add("soda");
		drinkList.add("beer");
	
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList.get(0));
		
	}
}
