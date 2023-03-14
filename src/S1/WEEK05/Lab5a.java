package WEEK05;



import java.util.*;



public class Lab5a {



   public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = 0;
            int b = 0;
            int c = 0;
            int div;
            String input;
            boolean run = false;
            boolean valid;
            do {
   
                do {
                    valid = false;
                    System.out.println("Enter a number: ");
                    try {
                        input = in.nextLine();
                        a = Integer.parseInt(input);
                        valid = true;
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a number.");
                    }
                } while (!valid);
                do {
                    valid = false;
                    System.out.println("Enter a second number: ");
                    try {
                        input = in.nextLine();
                        b = Integer.parseInt(input);
                        valid = true;
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a number.");
                    }
                } while (!valid);
                do {
                    valid = false;
                    System.out.println("Enter a third number: ");
                    try {
                        input = in.nextLine();
                        c = Integer.parseInt(input);
                        valid = true;
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a number.");
                    }
                } while (!valid);
                
                for (int i = a; i < b; i++) {
                    div = i%c;
                    if (div == 0) {
                        System.out.println(i + " is divisible by " + c);
                        
                    }
                    
                    }
                    System.out.println("Do you want to play again?");
                    input = in.nextLine();
                    if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
                    } else {
                        System.out.println("Error: Please enter 'y' or 'n'.");
                    }
                    
                    if (input.equalsIgnoreCase("n")) {
                        run = true;
                        System.out.println("The game is over. Bye!");
                    }
                }while(!run);
        }
        
        
            
        
        
    }



}