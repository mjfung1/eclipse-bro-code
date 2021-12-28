
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// recursion = 	the process in which a method calls itself continously
		// a method that calls itself is called a recursive method
		// useful for factorials, traversing trees, and simplifying tasks
		
		HelloWorld(5);
		
	}
	
	static void HelloWorld(int numTimes) {
		if (numTimes == 0) {
			System.out.println("no more hellos");
			return;
		}
		
		System.out.println(numTimes + "this is amount of times");
		HelloWorld(numTimes - 1);
	}

}
