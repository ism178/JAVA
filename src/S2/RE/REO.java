package S2.RE;
import java.util.Scanner;

public class REO {
    // static variable to store all listings
    private static Listings listings = new Listings();

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
    
    // main menu option 1 - listings menu
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
                    System.out.println(listings.toString());
                    break;
                case 3:
                    autoPopulateListings();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
    
    // listings menu option 1 - add listing menu
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
                    addHouse(input);
                    break;
                case 2:
                    addCondo(input);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
    
// Add listing menu option 1 - Add house
public static void addHouse(Scanner input) {
    System.out.println("----------------------------------------");
    System.out.println("                    Add House");
    System.out.println("----------------------------------------");
    System.out.println("Enter address: ");
    String address = input.next();
    System.out.println("Enter zip code: ");
    int zip = input.nextInt();
    System.out.println("Enter number of bedrooms: ");
    int bedrooms = input.nextInt();
    System.out.println("Enter number of bathrooms: ");
    int bathrooms = input.nextInt();
    System.out.println("Enter square footage: ");
    int sqFootage = input.nextInt();
    System.out.println("Enter yard acres: ");
    int yardAcres = input.nextInt();

    House house = new House(address, zip, bedrooms, bathrooms, sqFootage, yardAcres);

    // Display appraisal price
    System.out.println("Appraisal price: $" + house.getAppraisalPrice());

    // Ask user for list price
    System.out.println("Enter list price: ");
    double listPrice = input.nextDouble();
    house.setListPrice(listPrice);

    // Add house to listings
    listings.addListing(house);
    System.out.println("House added successfully!");
}
    // add listing menu option 2 - add condo
    public static void addCondo(Scanner input) {
        System.out.println("----------------------------------------");
        System.out.println("                    Add Condo");
        System.out.println("----------------------------------------");
        System.out.println("Enter address: ");
        String address = input.next();
        System.out.println("Enter square footage: ");
        double sqft = input.nextDouble();
        System.out.println("Enter number of bedrooms: ");
        int bedrooms = input.nextInt();
        System.out.println("Enter number of bathrooms: ");
        int bathrooms = input.nextInt();
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println("Enter balcony area: ");
        double balconyArea = input.nextDouble();
        
        Condo condo = new Condo(address, sqft, bedrooms, bathrooms, age, balconyArea);
        
        // display appraisal price
        System.out.println("Appraisal price: $" + condo.getAppraisalPrice());
        
        // ask user for list price
        System.out.println("Enter list price: ");
        double listPrice = input.nextDouble();
        condo.setListPrice(listPrice);
        
        // add condo to listings
        listings.addListing(condo);
        System.out.println("Condo added successfully!");
    }
    
    // listings menu option 3 - auto populate listings
    public static void autoPopulateListings() {
        House h1 = new House("123 Main St", 2000, 3, 2, 10, 2);
        h1.setListPrice(300000);
        listings.addListing(h1);
        
        Condo c1 = new Condo("456 Elm St", 1500, 2, 2, 5, 50);
        c1.setListPrice(200000);
        listings.addListing(c1);
        
        House h2 = new House("789 Oak St", 3000, 4, 3, 15, 3);
        h2.setListPrice(450000);
        listings.addListing(h2);
        
        Condo c2 = new Condo("321 Pine St", 1200, 1, 1, 2, 30);
        c2.setListPrice(150000);
        listings.addListing(c2);
        
        System.out.println("Listings auto-populated successfully!");
    }
    
    // main menu option 2 - bids menu
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
    