package WEEK06;
import java.util.*;
public class Lab6c {

   public static void main(String[] args) {
      boolean running = true;
      Boolean run =  true;
      String input = null;
      int fisrt = 0;
      int second = 0;
      int third = 0;
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

            Boolean answer = isBetween(fisrt, second, third);
            if(answer == true){
               System.out.println( third +" lies between the numbers " + fisrt +" and " + second + ".");
            }else{
               System.out.println(third + " DOES NOT lie between the numbers "+fisrt+" and "+second+".");
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
                   run = false;
               }else{
                   System.out.println("(Y/N) try agian ");
               }
           } while (running);
         } while (run);
      }
   }
   public static Boolean isBetween(int fisrt, int second, int third) {
      boolean amd = true;

      for( int i = fisrt; i <= second; i++){
         if(i == third){
            amd = true;
            break;
         }else{
            amd = false;
         }
      }
      return amd;

   }
}