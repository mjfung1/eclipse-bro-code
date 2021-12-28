package package2;
import package1.*;

public class C {
	
	// 'seen' across packages
	public 	  String publicMessage = "this is public";
	
	// 'seen' across packages but only child can see it (super - child)
	protected String protectedMessage = "this is protected";

	
	// 'seen' within package. not seen outside of package. default
			  String defaultMessage = "this is default";
			  
	// 'seen' within class only. sibling classes has no access
	private   String privateMessage = "this is private";
}
