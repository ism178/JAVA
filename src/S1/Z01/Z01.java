package Z01;

import java.util.ArrayList;
import java.util.Scanner;



public class Z01 {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		ArrayList<Integer> list = new ArrayList<Integer>();
		String input;												
		boolean run = true;	
		boolean tri = true;
		int num = 0;
		System.out.println("In this program, you will enter a list of numbers.");


		do {
			System.out.println("Please enter a number (or hit the <Enter> key to stop):");
			input = in.nextLine();
			try {
				num = Integer.parseInt(input);
				tri = true;

				
			} catch (Exception e) {
				tri = false;
			}
			if(input.equals("")){
				run = false;

			}else if(tri){
				addNumbers(num, list);

			}else{
				System.out.println(input + " Its not a number");

			}
	
			
		} while (run);


		int total = list.size();
		System.out.println("\n\nThe total of the items on the list is: " + total);

		int max = largestNumber(list);
		System.out.println("The biggest number in the list is: "+max);

		int sum = sum(list);
		System.out.println("The total of the items on the list is: "+ sum);












	}

	private static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (Integer nums : list){
			sum += nums;

		}
		return sum;
	}

	private static int largestNumber(ArrayList<Integer> list) {
		int max = 0;
		for (Integer nums : list){
			if(nums > max){
				max = nums;
			}
		}
		return max;
	}

	private static void  addNumbers(int num, ArrayList<Integer> list) {

		list.add(num);

	}
}
