package WEEK08;

import java.util.*;

public class Lab8b {

	public static void main(String[] args) {


		int max = Integer.MIN_VALUE;
		for (String arg : args) {
			int value = Integer.parseInt(arg);
			if (value > max) {
				max = value;
			}
		}
		System.out.println("The max is " + max);



		try (Scanner in = new Scanner(System.in)) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
		List<Integer> reps = new ArrayList<Integer>();

         String answer = "";
         int number = 0;
         boolean valid = false;
         boolean again = false;
         System.out.println("This program will ask the user to enter a series of numbers.\r\n"
         		+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\r\n"
         		+ "The program will then display the array of numbers and the sum total of those numbers.\r\n");
         while (!valid) {

         	while (true) {

         		try {
         			System.out.print("Please enter a number (or just hit enter to finish): ");
         			answer = in.nextLine();
         			number = Integer.parseInt(answer);
         			nums.add(number);
         		} catch (Exception e) {
         			if (answer.equals("")) {
         				break;
         			}
         			System.out.println("Invalid response. Please enter a valid whole number.");
         		} // end of try & catch

         	} // end of while

			 String array =  "Array IndexItem";
			 String index =  "Item";
			System.out.printf("%s %20s%n", array,index);
			int nsum = mySum(nums);

 // end of for
         	System.out.printf("There are %d items in the ArrayList.%n", nums.size());
         	System.out.printf("The sum total of numbers in the ArrayList is %d.%n", nsum);

			dups(nums,reps);
			if(!reps.isEmpty()){
				System.out.println("The following numbers were duplicated in the ArrayList: "+reps);
			}else{
				System.out.println("There are not duplicated numbers");
			}
			
         	while (!again) {

         		System.out.print("Would you like to play again?");
         		answer = in.nextLine();
         		if (answer.equalsIgnoreCase("y")) {
         			again = true;
					nums.clear();
					reps.clear();
         		} else if (answer.equalsIgnoreCase("n")) {
         			again = true;
         			valid = true;
         		} else {
         			System.out.println("Invalid response: Please answer with a 'Y' or 'N'");
         		} // end of if/else
         	} // end of again
         	again = false;
         } // end of valid while
      }
	}// end of main

	private static void dups(ArrayList<Integer> nums, List<Integer> reps) {
		for(int i = 0; i < nums.size()-1; i++){
			int num = nums.get(i);
			if(nums.subList(i+1,nums.size()).contains(num)){
				if(!reps.contains(num)){
					reps.add(num);
				}
			}
		}
	}

	private static int mySum(ArrayList<Integer> nums) {
		int sum =0;
		for (int i = 0; i < nums.size(); i++) {
			System.out.printf("%d %20s %n", i, nums.get(i));
			sum += nums.get(i);
		}
		return sum;
	}
}// end of class
