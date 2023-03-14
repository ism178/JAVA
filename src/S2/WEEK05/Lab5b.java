package WEEK05;



import java.util.*;



public class Lab5b {



   public static void main(String[] args) {
    boolean depo;
    boolean running = true;
    boolean yesno = true;
    boolean inte;
    boolean months;
    String input;
    Double deposit = 0.0;
    Double balance = 0.0;
    Double interest = 0.0;
    int years = 0 ;
        try (Scanner in = new Scanner(System.in)) {
            do {
                do {
                    depo = false;
                    System.out.println("Enter the amount deposit each month: ");
                    try {
                        input = in.nextLine();
                        deposit = Double.parseDouble(input);
                        depo = true;
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a number.");
                    }
                } while (!depo);
                do {
                    inte = false;
                    System.out.println("Enter the annual interest rate: ");
                    try {
                        input = in.nextLine();
                        interest = Double.parseDouble(input);
                        inte = true;
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a number.");
                    }
                } while (!inte);
                do {
                    months = false;
                    System.out.println("Enter the numbers of months: ");
                    try {
                        input = in.nextLine();
                        years = Integer.parseInt(input);
                        months = true;
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a number.");
                    }
                } while (!months);
                Double monthlyint = interest/100/12;
                for(int i = 1; i <= years; i++ ){
                    balance += deposit*(1+monthlyint);
                    System.out.printf("Month %-3d: $%,8.2f  %n", i, balance);
                }
				do {
					System.out.println("WANT TO PLAY AGAIN? Y/N");
					input = in.nextLine();
					if (input.equalsIgnoreCase("Y")) {
						System.out.println("LETS PLAY AGAIN");
                        yesno = false;
					}if (input.equalsIgnoreCase("N")){
						System.out.println("GAME OVER");
						running = false;

					}else{
						System.out.println("(Y/N) try agian ");
					}	
				} while (yesno);
            } while (running);
        }
    }
}