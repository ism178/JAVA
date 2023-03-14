package WEEK07;
import java.util.*;

public class Lab7i {
   public static void main(String[] args) {
    String playAgain = "Y";
    while (playAgain.equalsIgnoreCase("Y")) {
        int intNum = getValidInt("Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.");
        System.out.printf("The whole number your entered was: %d.\n", intNum);
        System.out.println("Now we will test your whole number in a math equation...");
        System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
        System.out.println();

        double doubleNum = getValidDouble("Please enter a decimal-point number: ", "Invalid response. Only decimal-point numbers are acceptable.");
        System.out.printf("The float your entered was: %f.\n", doubleNum);
        System.out.println("Now we will test your floating-point number in a math equation...");
        System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
        System.out.println();

        playAgain = getValidYN("Would you like to play again? (Y/N): ", "Invalid response.  Please answer with a 'Y' or 'N'");
        System.out.println();
    }
    System.out.println("Goodbye!");


}

   private static int getValidInt(String string, String string2) {
      
      //
      //
      //

      try (Scanner in = new Scanner(System.in)) {
         String input = "";
         int fisrt= 0;
         boolean run = true;
         do {
         System.out.println(string);
         input = in.nextLine();
         try {
            fisrt = Integer.parseInt(input);
            run = false;
         } catch (Exception e) {
            System.out.println(string2);
         }  
         } while (run);
         return fisrt;
      }
   }

   private static double getValidDouble(String string, String string2) {
      
      try (//
            //
            //
      Scanner in = new Scanner(System.in)) {
         double fisrt= 0 ;
         boolean run = true;
         String input = "";



         do {
            System.out.println(string);
            input = in.nextLine();
            try {
               fisrt = Double. parseDouble(input);
               run = false;
               
            } catch (Exception e) {
               System.out.println(string2);
            }

  } while (run);



         return fisrt;
      }
   }

   private static String getValidYN(String string, String string2) {
      try (//
            //
            //
            //
            //
      Scanner in = new Scanner(System.in)) {
         boolean run = true;
         String input = "";
         String res = "";

         System.out.println(string);
         input = in.nextLine();

  do {  
          if (input.equalsIgnoreCase("Y")) {
            run = false;
            res = "Y";
         }else if (input.equalsIgnoreCase("N")){
            run = false;
            res = "null";
         }else{
            System.out.println(string2);
         }
  
  } while (run);





try {
   
} catch (Exception e) {
   // TODO: handle exception
}

         return res;
      }
   }


}