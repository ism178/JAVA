package WEEK07;
import java.util.*;
import java.lang.Math;
public class Lab7b {
   public static void main(String[] args) {
      double res = 0;
      boolean run = true;
      boolean running = true;
      String input = "";
      Scanner in = new Scanner(System.in);
      do{
      String side = getSide(in);
      if(side == "a" || side == "A"){
         res = sideA("c", "b");
      }else if(side == "b" || side == "B"){
         res = sideB("a", "c");
      }else {
         res = sideC("b", "a");
      }			
      System.out.println(res);
         do {
            running = true;
            System.out.println("");
            System.out.println("WANT TO PLAY AGAIN? Y/N");
            input = in.nextLine();
            if (input.equalsIgnoreCase("Y")) {
               System.out.println("LETS PLAY AGAIN");
               running = false;
            }else if (input.equalsIgnoreCase("N")){
               System.out.println("SEE YOU SOON");
               running = false;
               run = false;
            }else{
               System.out.println("(Y/N) try agian ");
            }
      } while (running);
   } while (run);
      }
   private static double sideC(String a, String b) {
      int al = getL(a);
      int bl = getL(b);
      double res = 0;
      double powa = Math.pow(al, 2);
      double powb = Math.pow(bl, 2);
      double less = powa + powb;
      res = Math.sqrt(less);
      return res;
   }
   private static double sideB(String a, String c) {
      int al = getL(a);
      int cl = getL(c);
      double res = 0;
      if (cl < al ) {
         System.out.println("Invalid input: make sure c>a");
      }else{
         double powa = Math.pow(al, 2);
         double powc = Math.pow(cl, 2);
         double less = powc - powa;
         res = Math.sqrt(less);
      }
      return res;
   }
   private static double sideA(String c, String b) {
      int cl = getL(c);
      int bl = getL(b);
      double res = 0;
      if (cl < bl) {
         System.out.println("Invalid input: make sure c>b");
      }else{
         double powc = Math.pow(cl, 2);
         double powb = Math.pow(bl, 2);
         double less = powc - powb;
         res = Math.sqrt(less);
      }
      return res;
      }
   private static int getL(String letter) {
      int fisrt = 0;
      //
      //

      //

      try (//
      Scanner in = new Scanner(System.in)) {
         boolean run = true;
         String input = "";
         do {
            System.out.println("Please enter the length of side " + letter);
            input = in.nextLine();
            try {
               fisrt = Integer.parseInt(input);
               run = false;
            } catch (Exception e) {
               System.out.println("Error: Please enter a number.");
            }
         } while (run);
      }
      return fisrt;
   }
   private static String getSide(Scanner in) {
      Boolean run = true;
      String res = "";
      do {
         System.out.println("Enter side you wish to calculate ");
         String ans = in.nextLine();
         if(ans.equalsIgnoreCase("a")){
            res = "a";
            run = false;
         }else if(ans.equalsIgnoreCase("b")){
            res =  "b";
            run = false;
         }else if(ans.equalsIgnoreCase("c")){
            res = "c";
            run = false;
         }else{
            System.out.println("wrong try again");
         }
      } while (run);
      return res;
   }
}