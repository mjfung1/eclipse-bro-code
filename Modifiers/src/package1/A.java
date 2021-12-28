package package1;
import package2.*;

public class A {
	
	public static void main(String[] args) {
		
		C c = new C();
		
		// defaultMessage can only be accessed within a package
		// cannot be 'seen' across packages
		
		// System.out.println(c.defaultMessage);
		
		
		// public messages can be "seen" across packages
		System.out.println(c.publicMessage);
	}

}
