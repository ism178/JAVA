package WEEK12;
import java.util.*;
public class Lab12x{
		public static void main(String[] args) {

		    Scanner in = new Scanner(System.in);	
		    ArrayList<String> users = new ArrayList<String>();
		    ArrayList<String> pass = new ArrayList<String>();
		    String choice;												
		    boolean run = true;
			do {
				System.out.println("\n1. Log in");
		        System.out.println("2. Sign up");
		        System.out.println("3. Exit");
				choice = in.nextLine();
				switch (choice){
					case "1":
					logIn(in,users, pass);
					break;
					case "2":
					signUp(in,users,pass);
					break;
					case "3":
					System.out.println("\n EXIT.");
					run = false;
					break;
					default:
						System.out.println("\ninvalid entry, try again.");
				}
			} while (run);
		}
		private static void signUp(Scanner in, ArrayList<String> users, ArrayList<String> pass) {
			boolean run = true;
			String input;
			do {
				System.out.println("\nEnter user name:");
				input = in.nextLine();
				if(users.contains(input)){
					System.out.println("\nusername already taken");
				}else{
					users.add(input);
					System.out.println("\nuser added");
					run = false;
				}			
			} while (run);

			run = true;

			do {
				System.out.println("\nEnter password");
				input = in.nextLine();
				if(input.length()<8){
					System.out.println("\nPassword weak, need 8 characters!");
				}else{
					pass.add(input);
					System.out.println("\nPassword added");
					run = false;
				}
				
			} while (run);


		}

		private static void logIn(Scanner in, ArrayList<String> users, ArrayList<String> pass) {
			Boolean run = true;
			int count = 0;
			String input;
			do {
				System.out.println("Enter your username:");
				input = in.nextLine();
				if(users.contains(input)){
					System.out.println("\nUser found");
					run = false;
				}else{
					System.out.println("\nUser not found");
					count += 1;
				}
				if(count == 3){System.out.println("too many tries"); run = false;}
			} while (run);
			run = true;
			do {
				System.out.println("\nEnter your password:");
				input  = in.nextLine();
				if(pass.contains(input)){
					System.out.println("\nPassword correct");
					run = false;
				}else{
					System.out.println("\nPassword incorrect");
					count += 1;

				}
				if(count == 3){System.out.println("Too many tries"); run = false;}
				
			} while (run);
		}


	}
