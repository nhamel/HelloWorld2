import java.util.Date;
import java.text.SimpleDateFormat;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Here ye Here ye: important message");
		
		System.out.println("The current date is: " + getDate());
		System.out.println("You have " + Runtime.getRuntime().freeMemory() + " bytes of free memory.");
		
		System.out.println("Conflict Resolved!");
		
		System.out.println("Hello World");
		System.out.println("That took way too much effort...");
		System.out.println("See ya later!");
	}

	public static String getDate(){
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date today = new Date();
		return format.format(today);
	}
}
