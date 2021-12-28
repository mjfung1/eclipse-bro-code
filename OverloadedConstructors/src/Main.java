
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza pizza = new Pizza("thick crust", "tomato", "cheddar", "mushroom");
		Pizza pizza1 = new Pizza("thick crust", "tomato", "cheddar");
		Pizza pizza2 = new Pizza("thick crust", "tomato");
		Pizza pizza3 = new Pizza("thick crust");

		System.out.println("here are the ingredients of your pizza ");
		System.out.println(pizza.bread);
		System.out.println(pizza.cheese);

		System.out.println(pizza.topping);

		System.out.println(pizza.sauce);

		
	}

}
