package WEEK12;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;


public class Lab12b{
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
		        System.out.println("6. Open");
		        System.out.println("7. Exit");
		        System.out.print("Please enter a command: ");
		        choice = sIn.nextLine(); 
		        		
		        switch (choice) { 
		            case "1":	
		                System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
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
						openList(sIn,shoppingList, fileName);
						break;
		            case "7":	
		            	System.out.println("\nGoodbye");
		                done = true;
		                break;
		            default:
		            	System.out.println("Invalid response.  Please enter a choice from the menu (1-6).");
		        }
		    }while(!done);
		}



		private static void openList(Scanner sIn, ArrayList<String> shoppingList, String fileName) {
			boolean run = true;
			while(run){
				System.out.println("Are you sure you want to overwrite the current shopping list. Y/N");
				String input = sIn.nextLine();
				if(input.equalsIgnoreCase("y")){
					File inFile = new File(fileName);
					Scanner pf = null;
					String line = null;
					try {
						pf = new Scanner(inFile);
					} catch (Exception e) {
						System.out.println("\nFILE NOT FOUND\n");
						System.exit(1);
					}					
					shoppingList.clear();
					while(pf.hasNext()){
						line = pf.nextLine();
						shoppingList.add(line);
					}
					System.out.println("\nFILE OPENED, LIST CHANGED\n");
					run = false;
		
				}else if(input.equalsIgnoreCase("n")){
					System.out.println("The file wasnt overwrited");
					run = false;

				}else{
					System.out.println("Invalid response. Y/N");
				}
			}
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
						for (int i = 0; i<shoppingList.size(); i++) {
							writer.printf("%s\n",shoppingList.get(i));
							
						}
						writer.close();
						System.out.println("\nFILE SAVED\n");
						run = false;

				}else if(input.equalsIgnoreCase("N")){
						System.out.println("\nFILE COUNT BE SAVED\n");
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
				if(userInput.contains(":")){
					shoppingList.add(userInput);
					String [] item = userInput.split(":");
					System.out.printf("%s %s has been added to the Shopping List.\n",item[1],item[0]);
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
				System.out.print("Delete an item from the list (or just hit 'ENTER' when done): ");
				userInput = sIn.nextLine();
				boolean find = false;
				if(userInput.equals("")){
					break;
				}else {
					find = false;
					for(int i =0; i<shoppingList.size();i++){
						String [] item = shoppingList.get(i).split(":");
						if(item[0].equalsIgnoreCase(userInput)){
							shoppingList.remove(shoppingList.get(i));
							System.out.println("\n"+item[0]+" ITEM DELETED\n");
							count += 1;
							find = true;
						}

					}
					if(!find){
						System.out.printf("\nInvalid response! '%s' is NOT an item in the list.", userInput);
						System.out.print("\nThe Shopping List contains the following items: \n");
						System.out.println(shoppingList);
					}
				}
			}
			return count;
		}
		public static void showItems(ArrayList<String> shoppingList) {
			if(shoppingList.isEmpty()){
				System.out.println("\n\nEMPTY LIST\n");
				
			}else{
				System.out.println("----------------");
				System.out.printf("SHOPING LIST\n");
				System.out.println("----------------");
				for(int i = 0; i<shoppingList.size(); i++){
					String [] item = shoppingList.get(i).split(":");
	
					System.out.printf("%-10s %s \n", item[0],item[1]);
				}
				System.out.println("----------------");
			}
		}
		public static void sortItems(ArrayList<String> shoppingList) {
			Collections.sort(shoppingList);
			System.out.println("\nLIST SORTED\n");
		}
	}
