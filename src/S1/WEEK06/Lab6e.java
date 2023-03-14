package WEEK06;
import java.util.*;

public class Lab6e {

   public static void main(String[] args) {
      boolean running = true;
      Boolean run =  true;
      String input = null;
      try (Scanner in = new Scanner(System.in)) {
         do {
            String fisrt = "";
            System.out.println("Enter a sentence ");
            fisrt = in.nextLine();
            String reverse = isReverse(fisrt);
            System.out.println(reverse);
               


            do {
               running = true;
               System.out.println("");
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
public static String isReverse(String fisrt) {
   String str = fisrt;
   int lenght = str.length();
   for (int i = lenght-1; i >=0; i--) {
      System.out.print(str.charAt(i));
   }
   return "";



}

}
