package WEEK02;
import java.util.*;
public class Lab2b
 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			String input = null;

			System.out.println("Please enter your name: ");
			input = in.nextLine();
			System.out.println("Hello " + input);

			System.out.println("What is your favorite dessert?");
			input = in.nextLine();
			System.out.println("I hope you like coding Java as much as you like to eat  " + input);
			
			System.out.println("What is your favorite color? ");
			input = in.nextLine();
			System.out.println("So, you like the color "+input+". My favorite color is 0000ff.");

			System.out.println("What is your favorite kind of pet? ");
			input = in.nextLine();
			System.out.println("I'm sure a "+input+" is safer than my pet. I have a pet mouse.... but it always BYTES! HaHaHa!");

			System.out.println("Where were you born? ");
			input = in.nextLine();
			System.out.println("I was born in Silicon Valley. If I had been born in "+input+", perhaps we would have been friends.");

			

		}
	}
}
