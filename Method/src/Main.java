

public class Main {

	
	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		String name = "Ethan";
		hello(name);
		
		int result = add(1, 3);
		System.out.println(result);
		
	}
	
	
	static int add(int x, int y) {
		return x + y;
	}
	
	
	
	
	
	static void hello(String name) {
		System.out.println("hello " + name);
	}
	

}
