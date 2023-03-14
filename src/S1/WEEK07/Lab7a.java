package WEEK07;
import java.time.LocalDate;
import java.util.*;

public class Lab7a {
   public static void main(String[] args) {
      String name = "";
      Boolean running = true;
      Boolean run = true;
      String input = "";
      int fisrt = 0;
      String ans = "";


      try (Scanner in = new Scanner(System.in)) {
      do {

         System.out.println("Please enter the name of a potential student: ");
         name = in.nextLine();
         do {
            running = true;
            System.out.println("Please enter the year the potential student was born: ");
            try {
               input = in.nextLine();
               fisrt = Integer.parseInt(input);
               running = false;
            } catch (Exception e) {
               System.out.println("Error: Please enter a number.");
            }
         } while (running);

         int age = checkEligibility(name, fisrt);

         if(age<5){
         	ans = "Not eligible to attend school";
         }else if(age<12){
         	ans = "Elementary School";
         }else if(age<15){
         	ans = "Jr. High School";
         }else if(age<18){
         	ans = "High School";
         }else{
         	ans = "College";
         }
         System.out.println(name +" is "+ age + " and may attend to "+ ans);


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
}
   public static int checkEligibility(String name, int fisrt){
      int age = calculateAge(fisrt);
      return age;


   }
   public static int calculateAge(int year){
      LocalDate rightnow = LocalDate.now();
      int thisYear = rightnow.getYear();
      int age = thisYear - year;

      return age;

   }

}