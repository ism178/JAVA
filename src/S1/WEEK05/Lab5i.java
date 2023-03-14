package WEEK05;
import java.util.*;
public class Lab5i {
        public static void main(String[] args) {

            boolean running = true;
            boolean yesno = true;
            String input = null;
            int fisrt = 0;
            int second = 0;
            int third = 0;
            try (Scanner in = new Scanner(System.in)) {

            do {
                do {
                    running = true;
                System.out.println("Enter starting number ");
                try {
                    input = in.nextLine();
                    fisrt = Integer.parseInt(input);
                    running = false;
                } catch (Exception e) {
                    System.out.println("Error: Please enter a number.");
                }
                } while (running); 
                do {
                    running = true;
                    System.out.println("Enter ending number ");
                    try {
                        input = in.nextLine();
                        second = Integer.parseInt(input);
                        running = false;
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a number.");
                    }
                    } while (running); 
                do {
                    running = true;
                    System.out.println("Enter the multiplier number ");
                    try {
                        input = in.nextLine();
                        third = Integer.parseInt(input);
                        running = false;
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a number.");
                    }
                } while (running);
                for(int i = fisrt; i <= second; i++){
                int mul = i * third;
                System.out.printf("Multiplying %d by %d is: %d%n", i, third, mul);
                }
                do {
                    running = true;
                    System.out.println("WANT TO PLAY AGAIN? Y/N");
                    input = in.nextLine();
                    if (input.equalsIgnoreCase("Y")) {
                        System.out.println("LETS PLAY AGAIN");
                        running = false;
                    }else if (input.equalsIgnoreCase("N")){
                        System.out.println("GAME OVER");
                        running = false;
                        yesno = false;
                    }else{
                        System.out.println("(Y/N) try agian ");
                    }
                } while (running);
            } while (yesno);
        }
    }
}