package WEEK13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Lab13a {


	public static void main(String[] args) {
<<<<<<< HEAD
		// main goes here
		// Variables
=======
>>>>>>> 5159fc0ea9ad2949084b56c094d572b95001f8c1
		File file = new File("Pwd.txt");
		Scanner pf = null; // initialize scanner
		PrintWriter valid = null;
		PrintWriter invalid = null;
		String validStr = "validpwd.txt";
		String invalidStr = "invalidpwd.txt";
		String passwd = "";
		boolean done = false;

		while (!done) {
<<<<<<< HEAD
			// check if pwd.txt is found
=======
>>>>>>> 5159fc0ea9ad2949084b56c094d572b95001f8c1
			try {
				pf = new Scanner(file);
			} catch (Exception e) {
				System.out.println("Error. We cannot find this file.");
				break;
<<<<<<< HEAD
			} // end of try/catch

			// Create valid file
=======
			} 
>>>>>>> 5159fc0ea9ad2949084b56c094d572b95001f8c1
			try {
				valid = new PrintWriter(validStr);
			} catch (FileNotFoundException e) {
				System.out.println("Error! Unable to create: " + validStr);
			}
<<<<<<< HEAD

			// Create invalid file
=======
>>>>>>> 5159fc0ea9ad2949084b56c094d572b95001f8c1
			try {
				invalid = new PrintWriter(invalidStr);
			} catch (FileNotFoundException e) {
				System.out.println("Error! Unable to create: " + invalidStr);
			}
<<<<<<< HEAD

			// While loop to go through each word in Pwd.txt file
			while (pf.hasNext()) {
				passwd = pf.nextLine();
				// if statements
=======
			while (pf.hasNext()) {
				passwd = pf.nextLine();
>>>>>>> 5159fc0ea9ad2949084b56c094d572b95001f8c1
				if (!(passwd.length() >= 8)) {
					invalid.printf("%-15s Invalid Password! Must be at least 8 characters long.%n", passwd);
				} else if (!hasUpper(passwd)) {
					invalid.printf("%-15s Invalid Password! Must contain at least one UPPERCASE character.%n", passwd);
				} else if (!hasLower(passwd)) {
					invalid.printf("%-15s Invalid Password! Must contain at least one LOWERCASE character.%n", passwd);
				} else if (!hasNumber(passwd)) {
					invalid.printf("%-15s Invalid Password! Must contain at least one NUMBER.%n", passwd);
				} else if (!hasSpecial(passwd)) {
					invalid.printf("%-15s Invalid Password! Must contain at least one of {@,#,%s,-,&,*}.%n", passwd, "%");
				}else {
					valid.printf("%s%n", passwd);
				}
<<<<<<< HEAD

			} // end of while
			//close files
			invalid.close();
			valid.close();
			

			done = true;
		} // end of main while

	} // end of main()

	public static boolean hasUpper(String passwd) {
		// for loop to check every character in password
=======
			}
			invalid.close();
			valid.close();
			done = true;
		}
	}
	public static boolean hasUpper(String passwd) {
>>>>>>> 5159fc0ea9ad2949084b56c094d572b95001f8c1
		for (int i = 0; i < passwd.length(); i++) {
			if (Character.isUpperCase(passwd.charAt(i))) {
				return true;
			}
<<<<<<< HEAD
		} // end of for

		return false;

	} // end of hasUpper

	public static boolean hasLower(String passwd) {
		// for loop to check every character in password
=======
		} 
		return false;
	}
	public static boolean hasLower(String passwd) {
>>>>>>> 5159fc0ea9ad2949084b56c094d572b95001f8c1
		for (int i = 0; i < passwd.length(); i++) {
			if (Character.isLowerCase(passwd.charAt(i))) {
				return true;
			}
<<<<<<< HEAD
		} // end of for

		return false;

	} // end of hasLower

	public static boolean hasNumber(String passwd) {
		// for loop to check every character in password
=======
		} 
		return false;
	} 
	public static boolean hasNumber(String passwd) {
>>>>>>> 5159fc0ea9ad2949084b56c094d572b95001f8c1
		for (int i = 0; i < passwd.length(); i++) {
			if (Character.isDigit(passwd.charAt(i))) {
				return true;
			}
<<<<<<< HEAD
		} // end of for

		return false;

	} // end of hasNumber

	public static boolean hasSpecial(String passwd) {
		// for loop to check every character in password
		String special = "@#%-&*";
		for (int i = 0; i < passwd.length(); i++) {
			//Special character string
			for (int j = 0; j < special.length(); j++) {
				// compare each character with special characters
				if (passwd.charAt(i) == special.charAt(j)) {
					return true;
				}
			} // end of within for loop
		} // end of for

		return false;

	} // end of hasNumber

=======
		}
		return false;
	} 
	public static boolean hasSpecial(String passwd) {
		String special = "@#%-&*";
		for (int i = 0; i < passwd.length(); i++) {
			for (int j = 0; j < special.length(); j++) {
				if (passwd.charAt(i) == special.charAt(j)) {
					return true;
				}
			} 
		} 
		return false;
	}
>>>>>>> 5159fc0ea9ad2949084b56c094d572b95001f8c1
}
