package RealEstate;
import java.util.Scanner;

public class REO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("                    Main Menu");
            System.out.println("----------------------------------------");
            System.out.println("1. Listings");
            System.out.println("2. Bids");
            System.out.println("0. Exit");
            
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    listingsMenu(input);
                    break;
                case 2:
                    bidsMenu(input);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
    
    public static void listingsMenu(Scanner input) {
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("                    Listings");
            System.out.println("----------------------------------------");
            System.out.println("1. Add Listing");
            System.out.println("2. Show Listings");
            System.out.println("3. Auto Populate Listings (Dev tool)");
            System.out.println("0. Go back");
            
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    addListingMenu(input);
                    break;
                case 2:
                    System.out.println("Showing listings...");
                    break;
                case 3:
                    System.out.println("Auto-populating listings...");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
    
    public static void addListingMenu(Scanner input) {
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("                    Add Listing");
            System.out.println("----------------------------------------");
            System.out.println("1. Add House");
            System.out.println("2. Add Condo");
            System.out.println("0. Go back");
            
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Adding house...");
                    break;
                case 2:
                    System.out.println("Adding condo...");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
    
    public static void bidsMenu(Scanner input) {
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("                    Bids");
            System.out.println("----------------------------------------");
            System.out.println("1. Add New Bid");
            System.out.println("2. Show Existing Bids");
            System.out.println("3. Auto Populate Bids (Dev Tool)");
            System.out.println("0. Go back");
            
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Adding new bid...");
                    break;
                case 2:
                    System.out.println("Showing existing bids...");
                    break;
                case 3:
                    System.out.println("Auto-populating bids...");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

}
