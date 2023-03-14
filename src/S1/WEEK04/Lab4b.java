package WEEK04;
import java.util.*;
public class Lab4b {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			String yn;
			boolean runnig = true;	
			do {
				System.out.println("like coding in java? (y/n) ");
				yn = in.nextLine();
				if (yn.equalsIgnoreCase("Y") || yn.equalsIgnoreCase("N")) {
				System.out.println("GREAT");
				runnig = false;
				}else{
					System.out.println("(Y/N) try agian ");
				}
			} while (runnig);
		}
	}
}
