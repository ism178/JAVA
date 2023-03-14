package WEEK04;
import java.util.*;
public class Lab4c {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			Random random = new Random();

			boolean yn = true;
			String guess, yesno;
			int counter = 1 ;
			int gnum = 0;
			int cpg;
			boolean again = true;
			do {
				cpg = random.nextInt((100 - 1) + 1) + 1;
				System.out.println("**************THIS IS A GUESSING GAME**************");
				System.out.println("****THE COMPUTER WILL GENERATE A RANDOM NUMBER*****");
				System.out.println("***YOU TRY TO GUES THE NUMBER BETWEEN 1 AND 100****");
				System.out.println("LEST GET STARTED");
				System.out.println("IM THINKING A NUMBER BETWEEN 1 AND 100");
				boolean lvrunnig = true;
				boolean ivrunnig = true;
				do {
					do {
						// System.out.println(cpg);
						System.out.println("WHAT IS YOUR GUESS?");
						try {
							guess = in.nextLine();
							gnum = Integer.parseInt(guess);
							ivrunnig = false;
						} catch (Exception e) {
							System.out.println("ENTER VALID NUMBER");
						}
					} while (ivrunnig);
						if (cpg == gnum) {
						System.out.println("GREAT YOU GOT THIS!!! THE ANSWER WAS: " + cpg + "! IT TOOK YOU " + counter + " TRIES!");
						lvrunnig = false;
					} else {
						if (cpg > gnum ) {
							System.out.println("THINK BIGGER... TRY AGAIN");
							counter = counter + 1;
						} else {
							System.out.println("THINK SMALLER... TRY AGAIN");
							counter = counter + 1;
						}	
					}
				} while (lvrunnig);
				do {
					System.out.println("WANT TO PLAY AGAIN? Y/N");
					yesno = in.nextLine();
					if (yesno.equalsIgnoreCase("Y")) {
						System.out.println("GREAT");
						System.out.println("LETS PLAY AGAIN");
						counter = 1;
						yn = false;
					}if (yesno.equalsIgnoreCase("N")){
						System.out.println("SEE YOU SOON");
						System.out.println("GAME OVER");

					}else{
						System.out.println("(Y/N) try agian ");
					}	
				} while (yn);

			} while (again);
		}
	}
}