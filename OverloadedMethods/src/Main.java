

public class Main {

	
	public static void main(String[] args) {
		
		// overloaded methods = methods that share the same name but have different parameters
		// 						method name + parameters = method signature;
		
		System.out.println(add(2, 3));
		System.out.println(add(2, 3, 7));
		System.out.println(add(2, 3, 5, 8));

	}
	
	static int add(int a, int b) {
		System.out.println("this is 1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("this is 2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("this is 3");
		return a + b + c + d;
	}
}
