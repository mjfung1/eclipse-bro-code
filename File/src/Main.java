
import java.io.File;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// file = An abstract representation of file and directory pathnames
		
		File file = new File("secret_message.rtf");
		
		if (file.exists()) {
			System.out.println("the file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.canWrite());
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());
		}
		else {
			System.out.println("the file doesn't exist");
		}
	}

}
