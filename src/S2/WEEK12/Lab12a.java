package WEEK12;

import java.io.PrintWriter;
import java.util.*;


public class Lab12a{
		public static void main(String[] args) {
		    Scanner sIn = new Scanner(System.in);	
		    ArrayList<String> shoppingList = new ArrayList<String>();
		    String choice;												
		    boolean done = false;
			String fileName = "txt.txt";								
		
		    do{
		        System.out.println();
		        System.out.println("1. Add Items");
		        System.out.println("2. Delete Items");
		        System.out.println("3. Show Items");
		        System.out.println("4. Sort Items");
		        System.out.println("5. Save");
		        System.out.println("6. Exit\n");
		        System.out.print("Please enter a command: ");
		        choice = sIn.nextLine(); 
		        		
		        switch (choice) { 
		            case "1":	
		                System.out.println(addItems(sIn, shoppingList)/2 + " items have been added to your Shopping List.");
		                break;
		            case "2":
		            	System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
		                break;
		            case "3":
		                showItems(shoppingList);
		                break;
		            case "4":
		                sortItems(shoppingList);
		                break;
					case "5":
						saveList(sIn,shoppingList, fileName);
						break;
		            case "6":	
		            	System.out.println("\nGoodbye");
		                done = true;
		                break;
		            default:
		            	System.out.println("Invalid response.  Please enter a choice from the menu (1-6).");
		        }
		    }while(!done);
		}



		private static void saveList(Scanner sIn, ArrayList<String> shoppingList, String file) {

			boolean run = true;

			while(run){
				System.out.println("Are you sure you want to overwrite the file: " + file);
				String input = sIn.nextLine();
				if(input.equalsIgnoreCase("y")){
						
						PrintWriter writer = null;
						
						try {
							writer = new PrintWriter(file);
						} catch (Exception e) {
							System.out.println("ERROR CREATING SAVING THE FILE");
						}
						for (int i = 0; i<shoppingList.size()-1; i+=2) {
							writer.printf("%s %s\n",shoppingList.get(i), shoppingList.get(i+1));
							
						}
						writer.close();
						System.out.println("FILE SAVED");
						run = false;

				}else if(input.equalsIgnoreCase("N")){
						System.out.println("FILE COUNT BE SAVED");
						run = false;
				}else{
					System.out.println("Invalid entry, Answer with (Y/N)");
				}
			}
		}



		public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
			String userInput = "";
			while (true) {
				System.out.print("Add an item to the list (or just hit 'ENTER' when done): \n");
				userInput = sIn.nextLine();
				int index = userInput.indexOf(":");



				if(userInput.contains(":")){
					String item = userInput.substring(0,index).trim();
					String number = userInput.substring(index +1).trim();
					shoppingList.add(item);
					shoppingList.add(number);
					System.out.printf("%s:%s has been added to the Shopping List.\n",item,number);
				}else if(userInput.equals("")) {
					break;
				}else{
					System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");

				}
			}
			return shoppingList.size();
		}





		public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
			String userInput = "";
			int count = 0;
			while (true) {
				try {
					System.out.print("Delete an item from the list (or just hit 'ENTER' when done): ");
					userInput = sIn.nextLine();
					if (userInput.equals("")) {
						break;
					}
					if(shoppingList.contains(userInput)) {
						shoppingList.remove(userInput);
						count += 1;
						System.out.printf("'%s' has been deleted from the Shopping List.\n", userInput);
					} else {
						System.out.printf("Invalid response! '%s' is NOT an item in the list.%n", userInput);
						System.out.print("\nThe Shopping List contains the following items: \n\n");
						System.out.print("[");
						for (int i = 0; i < shoppingList.size(); i++) {
							if (i <shoppingList.size()-1) {
								System.out.printf("%s, ",shoppingList.get(i));
							} else {
								System.out.printf("%s",shoppingList.get(i));
							}
						}
						System.out.print("]\n\n");
					}
				}catch (Exception e) {
				}
			}
			return count;
		}
		public static void showItems(ArrayList<String> shoppingList) {
			System.out.println("----------------");
			System.out.printf("SHOPING LIST\n");
			System.out.println("----------------");
			for(int i = 0; i<shoppingList.size()-1; i+=2){
				System.out.printf("%-10s %s \n", shoppingList.get(i),shoppingList.get(i+1));

			}
			System.out.println("----------------");



		}







		public static void sortItems(ArrayList<String> shoppingList) {
			Collections.sort(shoppingList);
			System.out.print("[");
			for (int i = 0; i < shoppingList.size(); i++) {
				if (i <shoppingList.size()-1) {
					System.out.printf("%s, ",shoppingList.get(i));
				} else {
					System.out.printf("%s",shoppingList.get(i));
				}
			}
			System.out.print("]\n\n");
		}
	}
