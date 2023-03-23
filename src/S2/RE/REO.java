package S2.RE;
import java.util.Scanner;

public class REO {
    // static variable to store all listings
    // private static Listings listings = new Listings();

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
                    Listings listings = Listings.getInstance();
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
    
<<<<<<< HEAD
// Add listing menu option 1 - Add house
public static void addHouse(Scanner input) {
=======
 // add listing menu option 1 - add house
 public static void addHouse(Scanner input) {
>>>>>>> 3d9b9097df34b3a9be1d90666c7da03eeb3c0ed6
    System.out.println("----------------------------------------");
    System.out.println("                    Add House");
    System.out.println("----------------------------------------");
    System.out.println("Enter address: ");
    String address = input.next();
    System.out.println("Enter zip code: ");
<<<<<<< HEAD
    int zip = input.nextInt();
=======
    int zipCode = input.nextInt();
    System.out.println("Enter square footage: ");
    int sqft = input.nextInt();
>>>>>>> 3d9b9097df34b3a9be1d90666c7da03eeb3c0ed6
    System.out.println("Enter number of bedrooms: ");
    int bedrooms = input.nextInt();
    System.out.println("Enter number of bathrooms: ");
    int bathrooms = input.nextInt();
<<<<<<< HEAD
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
=======
    System.out.println("Enter yard acres: ");
    double yardAcres = input.nextDouble();
    
    House house = new House(address, zipCode, bedrooms, bathrooms, sqft, yardAcres);

    System.out.println("Enter list price: ");
    double listPrice = input.nextDouble();
    house.setListPrice(listPrice);
    
    Listings.getInstance().addListing(address, house);
    System.out.println("House added successfully!\n" + house.toString());
>>>>>>> 3d9b9097df34b3a9be1d90666c7da03eeb3c0ed6
}
    // add listing menu option 2 - add condo
    public static void addCondo(Scanner input) {
        System.out.println("----------------------------------------");
        System.out.println("                    Add Condo");
        System.out.println("----------------------------------------");
        System.out.println("Enter address: ");
        String address = input.next();
        System.out.println("Enter zip code: ");
        int zipCode = input.nextInt();
        System.out.println("Enter square footage: ");
        int sqft = input.nextInt();
        System.out.println("Enter number of bedrooms: ");
        int bedrooms = input.nextInt();
        System.out.println("Enter number of bathrooms: ");
        int bathrooms = input.nextInt();
        System.out.println("Enter floor level: ");
        int floorLevel = input.nextInt();
        
        Condo condo = new Condo(address, zipCode, bedrooms, bathrooms, sqft, floorLevel);
        
        // display appraisal price
        System.out.println("Appraisal price: $" + condo.calculateAppraisalPrice());
        
        // ask user for list price
        System.out.println("Enter list price: ");
        double listPrice = input.nextDouble();
        condo.setListPrice(listPrice);
        
        // add condo to listings
    Listings.getInstance().addListing(address, condo);
    System.out.println("House added successfully!\n" + condo.toString());
    }
    
    public static void autoPopulateListings() {
        Listings reoListings = Listings.getInstance();
        int currentSize = reoListings.getListings().size();
        
        House house1 = new House("34 Elm",95129, 3, 2, 2200, .2);
        house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("34 Elm", house1);
        
        House house2 = new House("42 Hitchhikers",95136, 4, 3, 2800, .3);
        house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("42 Hitchhikers", house2);
        
        Condo condo1 = new Condo("4876 Industrial", 95177, 3, 1, 1800, 3);
        condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("4876 Industrial", condo1);
        
        House house3 = new House("2654 Oak",84062, 5, 53, 4200, .5);
        house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("2654 Oak", house3);
        
        Condo condo2 = new Condo("9875 Lexington",84063, 2, 1, 1500, 1);
        condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("9875 Lexington", condo2);
        
        Condo condo3 = new Condo("3782 Market", 84066, 3, 1, 1800, 2);
        condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("3782 Market", condo3);
        
        House house4 = new House("7608 Glenwood", 84055, 6, 3, 3900, .4);
        house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("7608 Glenwood", house4);
        
        House house5 = new House("1220 Apple", 84057, 8, 7, 7900, 1);
        house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
        reoListings.addListing("1220 Apple", house5);
    
        int newSize = reoListings.getListings().size();
        System.out.printf("Added %d new listings. Total listings: %d\n", newSize - currentSize, newSize);
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
}
    