package DessertShop;

import java.util.*;

public class DessertShop {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		
		Candy c1 = new Candy("Candy Corn", 1.5, .25);
		order1.add(c1);
		
		Candy c2 = new Candy("Gummy Bears", .25, .35);
		order1.add(c2);
		
		Cookie co1 = new Cookie("Chocolate Chip", 6, 3.99);
		order1.add(co1);
		
		IceCream ic1 = new IceCream("Pistachio", 2, .79);
		order1.add(ic1);
		
		Sundae s1 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
		order1.add(s1);
		
		Cookie co2 = new Cookie("Oatmeal Raisin", 2, 3.45);
		order1.add(co2);
		
		Scanner sIn = new Scanner(System.in);    
		String choice;
		DessertItem orderItem;

		boolean done = false;
		while (!done) {
		    System.out.println("\n1: Candy");
		    System.out.println("2: Cookie");            
		    System.out.println("3: Ice Cream");
		    System.out.println("4: Sunday");

		    System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
		    choice = sIn.nextLine();
		    
		    if (choice.equals("")) {
		        done = true;
		    } else {
		        switch (choice) {
		            case "1":            
		                orderItem = userPromptCandy(order1, "Please enter the name of the Candy: ", "Please enter the weight of the Candy: ", "Please enter the price per pound of the Candy: ");
		                order1.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            case "2":            
		                orderItem = userPromptCookie(order1, "Please enter the name of the Cookie: ", "Please enter the Cookie quantity: ", "Please enter the price per dozen of the Cookie: ");
		                order1.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		        	case "3":            
		                orderItem = userPromptIceCream(order1, "Please enter the name of the IceCream: ","Please enter the Scoop count: ","Please enter the price per Scoop: ");
		                order1.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		         	case "4":            
		                orderItem = userPromptSundae(order1, "Please enter the name of the Sundae: ","Please enter the Scoop count: ","Please enter the price per Scoop: ","Please enter the Topping name: ","Please enter the topping price: ");
		                order1.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            	default:            
		                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
		              break;
		        }//end of switch (choice)
		    }//end of if (choice.equals(""))
		}//end of while (!done)
		System.out.println();
		System.out.println(order1.toString());
		
		sIn.close();

    }


	
	private static DessertItem userPromptSundae(Order order1, String s1, String s2, String s3, String s4, String s5) {
		
		Scanner sIn = new Scanner(System.in);
		
		String 	icename = getValidString(sIn,s1);
		int sundaeWeight = getValidInt(sIn, s2, "Error! Enter a valid number: ");
		double pricePerScoop = getValidDouble(sIn, s3, "Error! Enter a valid number: ");
		String iceCreamName = getValidString(sIn, s4);
		double ppp = getValidDouble(sIn, s5, "Error! Enter a valid number: ");
		 
		IceCream c3 = new Sundae(icename, sundaeWeight, pricePerScoop, iceCreamName, ppp);
		return c3;
	}

	private static DessertItem userPromptIceCream(Order a, String n, String w, String p) {


		Scanner sIn = new Scanner(System.in);
		
		String iceCreamName = getValidString(sIn, n);
		 int iceCreamWeight = getValidInt(sIn, w, "Error! Enter a valid number: ");
		 double pricePerScoop = getValidDouble(sIn, p, "Error! Enter a valid number: ");
		 
		 IceCream c3 = new IceCream(iceCreamName, iceCreamWeight, pricePerScoop);
		 return c3;
	}

	private static int getValidInt(Scanner sIn, String w, String string) {
		int ansD = 0;
		boolean valid = false;
		do {
		System.out.println(w);
		if(sIn.hasNextInt()) {
			ansD = sIn.nextInt();
			valid = true;
		} else {
			System.out.println(string);
			valid = false;
			sIn.nextLine();
		}
		}while(!valid);
		return ansD;
	}

	public static double getValidDouble(Scanner doub, String q1, String err) {
		double ansD = 0;
		boolean valid = false;
		do {
		System.out.println(q1);
		if(doub.hasNextDouble()) {
			ansD = doub.nextDouble();
			valid = true;
		} else {
			System.out.println(err);
			valid = false;
			doub.nextLine();
		}
		}while(!valid);
		return ansD;
	}
	
	private static String getValidString(Scanner sIn, String a) { 
		
		boolean run = true;
		String name = "";
	
		
		while(run) {
			System.out.println(a);
			name = sIn.nextLine();
			if (name.equals("")) {
				System.out.println("Please enter a valid name: ");
			} else {
				run = false;
			}
			
		}
		return name;
	}

	private static DessertItem userPromptCandy(Order a, String n, String w, String p) {
		
		Scanner sIn = new Scanner(System.in);
		
		String candyName = getValidString(sIn, n);
		 double candyWeight = getValidDouble(sIn, w, "Error! Enter a valid number: ");
		 double pricePerPound = getValidDouble(sIn, p, "Error! Enter a valid number: ");
		 
		 Candy c3 = new Candy(candyName, candyWeight, pricePerPound);
		 return c3;
	}
	

	private static DessertItem userPromptCookie(Order a, String n, String w, String p) {
		Scanner sIn = new Scanner(System.in);
		
		String cookieName = getValidString(sIn, n);
		 double cookieQty = getValidDouble(sIn, w, "Error! Enter a valid number: ");
		 double pricePerDozen = getValidDouble(sIn, p, "Error! Enter a valid number: ")/12;
		 
		 Candy c3 = new Candy(cookieName, cookieQty, pricePerDozen);
		
		return c3;
	}
	
}
	
	