
public class Main {

	
	
	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		
		Friend friend1 = new Friend("goku");
		Friend friend2 = new Friend("gohan");
		Friend friend3 = new Friend("vegeta");
		Friend friend4 = new Friend("krilin");
		
		Friend.displayNumberOfFriends();
		
	}
}
