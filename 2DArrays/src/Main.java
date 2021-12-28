


public class Main {

	public static void main(String[] args) {
		
		
		
		
		// 2D array = arrays within array
		
		String[][] cars = new String[3][3];
		cars[0][0] = "camaro";
		cars[0][1] = "silverado";
		cars[0][2] = "mustang";
		cars[1][0] = "camaro12";
		cars[1][1] = "silverado12";
		cars[1][2] = "mustang12";
		cars[2][0] = "camaro21";
		cars[2][1] = "silverado21";
		cars[2][2] = "mustang21";
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[0].length; j++) {
				System.out.print(cars[i][j]);
			}
		}
		
		
		
		
		// another way to create nested array
		String[][] brands = {
				{"gucci", "prada", "balenciaga"},
				{"hm", "banana", "express"},
				{"walmart", "target", "kmart"}
		};
		
		for (int i = 0; i < brands.length; i++) {
			System.out.println();
			for (int j = 0; j < brands[0].length; j++) {
				System.out.print(brands[i][j]);
			}
		}
		
	}
}
