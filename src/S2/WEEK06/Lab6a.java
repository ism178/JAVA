package WEEK06;
import java.util.*;
public class Lab6a {

   public static void main(String[] args) {
      boolean running = true;
      String input = null;
      int fisrt = 0;
      int second = 0;
      int third = 0;
      Boolean run =  true;
      try (Scanner in = new Scanner(System.in)) {
         do {
            do {
               running = true;
               System.out.println("Enter fisrt number ");
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
               System.out.println("Enter second number ");
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
               System.out.println("Enter third number ");
               try {
                  input = in.nextLine();
                  third = Integer.parseInt(input);
                  running = false;
               } catch (Exception e) {
                  System.out.println("Error: Please enter a number.");
               }
            } while (running);
            int pizza = myfunction(fisrt, second, third);
            System.out.println("THE BIGGEST NUMBER; " + pizza);
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
                   run = false;
               }else{
                   System.out.println("(Y/N) try agian ");
               }
           } while (running);
         } while (run);
      }
   }

   public static int myfunction(int fisrt, int second, int third) {
      if(fisrt < second && third < second){
         return second;
      }else if (fisrt < third){
         return third;
      }else{
         return fisrt;
      }
   }
}