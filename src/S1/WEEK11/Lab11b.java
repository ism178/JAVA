package WEEK11;

import java.util.Scanner;

public class Lab11b {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {

			Boolean run = true;
			System.out.println("This program will show the name of an apostle based on the order they were called with President Nelson as #1");

				while(run){
					String res = in.nextLine();

					String result= "";
					switch (res) {
						case "1":  result = "Russell M. Nelson";
								break;

						case "2":  result = "Dallin H. Oaks";
								break;
								
						case "3":  result = "M. Russell Ballard";
						break;
						
						case "4":  result = "Jeffrey R. Holland";
								break;
								
						case "5":  result = "Henry B. Eyring";
						break;
						
						case "6":  result = "Dieter F. Uchtdorf";
								break;
								
						case "7":  result = "David A. Bednar";
						break;
						
						case "8":  result = "Quentin L. Cook";
								break;
								
						case "9":  result = "D. Todd Christofferson";
						break;

						case "10":  result = "Neil L. Andersen";
						break;

						case "11":  result = "Ronald A. Rasband";
						break;

						case "12":  result = "Gary E. Stevenson";
						break;

						case "13":  result = "Dale G. Renlund";
						break;

						case "14":  result = "Gerrit W. Gong";
						break;

						case "15":  result = "Ulisses Soares";
						break;

						case "":  run = false;
						break;
		
						default: result = "That's not a valid choice. Try again.\nEnter a number between 1 and 15";
						break;
				}
				if(res.equals("")){
					System.out.println("The program its over \n\n");
				}else{
					System.out.println("Number "+ res +": "+ result + "\n");
				}
			}
		}
	}
}