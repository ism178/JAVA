package WEEK03;
import java.util.*;
public class Lab3a {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int num = 0;
			String numStr;
			boolean runnig = true;	
			do {
				System.out.println("please enter a number: ");
				numStr = in.nextLine();
				try {
					num = Integer.parseInt(numStr);
					System.out.println("you entered: " + num);
					runnig = false;
				} catch (Exception e) {
					System.out.println( "WRONG "  + num + " its not a number!");
				}
			} while (runnig);
		}
	}
}
