package S2.RE;
import java.util.HashMap;
import java.util.Random;
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
                    bidsMenu(input, Listings.getInstance());
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
    
 // add listing menu option 1 - add house
 public static void addHouse(Scanner input) {
    System.out.println("----------------------------------------");
    System.out.println("                    Add House");
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
    System.out.println("Enter yard acres: ");
    double yardAcres = input.nextDouble();
    
    House house = new House(address, zipCode, bedrooms, bathrooms, sqft, yardAcres);

    System.out.println("Enter list price: ");
    double listPrice = input.nextDouble();
    house.setListPrice(listPrice);
    
    Listings.getInstance().addListing(address, house);
    System.out.println("House added successfully!\n" + house.toString());
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
    public static void bidsMenu(Scanner input, Listable listings) {
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
                    addBidMenu(input, Listings.getInstance());
                    break;
                case 2:
                    showBidsMenu(input, Listings.getInstance());
                    break;
                case 3:
                    autoPopulateBidsMenu(Listings.getInstance());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
    

    // add bids menu
    public static void addBidMenu(Scanner input, Listings listings) {
        HashMap<String, Residential> properties = listings.getListings();
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("                    Add Bid");
            System.out.println("----------------------------------------");
    
            // Display list of properties with existing bids
            System.out.println("Existing Properties with Bids:");
            for (Residential property : properties.values()) {
                int bidCount = property.getBidCount();
                if (bidCount > 0) {
                    System.out.printf("%s (%d bids)\n", property.getAddress(), bidCount);
                }
            }
    
            // Display list of properties with no bids
            System.out.println("Properties with No Bids:");
            for (Residential property : properties.values()) {
                int bidCount = property.getBidCount();
                if (bidCount == 0) {
                    System.out.println(property.getAddress());
                }
            }
    
            // Prompt user to select a property
            System.out.print("Enter the address of the property to bid on (or 0 to go back): ");
            String address = input.nextLine();
            if (address.equals("0")) {
                return;
            }
            Residential property = properties.get(address);
            if (property == null) {
                System.out.println("Invalid address. Please try again.");
                continue;
            }
    
            // Display property details
            System.out.println("Property Details:");
            System.out.println(property);
    
            // Prompt user to enter bidder name and bid amount
            System.out.print("Enter bidder name: ");
            String bidder = input.nextLine();
            System.out.print("Enter bid amount: ");
            double bidAmount = input.nextDouble();
            input.nextLine(); // consume extra newline character
    
            // Add bid to property
            property.newBid(bidder, bidAmount);
            System.out.println("Bid added successfully.");
        }
    }
        // show bids menu

            
    public static void showBidsMenu(Scanner input, Listings listings) {
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("              Show Bids");
            System.out.println("----------------------------------------");

            // display list of existing residential properties
            int count = 1;
            for (Residential residence : listings.getResidences()) {
                System.out.println(count + ". " + residence.getAddress() + " (" + listings.getListing(residence.getAddress()).getBidCount() + " bids)");
                count++;
            }

            System.out.println("0. Go back");

            int choice = input.nextInt();

            if (choice == 0) {
                return;
            } else if (choice < 1 || choice > listings.getListingCount()) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            // display details of selected residential property and its bids
            Residential selectedResidence = listings.getResidences().toArray(new Residential[0])[choice-1];
            System.out.println("Details for " + selectedResidence.getAddress() + ":");
            System.out.println(selectedResidence.toString());
            System.out.println("Bids:");
            HashMap<String, Double> bids = selectedResidence.getBids();
            for (String bidder : bids.keySet()) {
                System.out.printf("Bidder: %s  Amount: $%,.2f\n", bidder, bids.get(bidder));
            }
            System.out.println("----------------------------------------");
        }
    }

        // auto-populate bids menu
        public static void autoPopulateBidsMenu(Listable listings) {
            Random rand = new Random();
            HashMap<String, Residential> properties = listings.getListings();
            
            for (Residential property : properties.values()) {
                int numBids = rand.nextInt(5) + 1; // generate a random number of bids between 1 and 5
                for (int i = 0; i < numBids; i++) {
                    String[] autoBidders= {"Patric Stewart","Walter Koenig","William Shatner","Leonard Nimoy","DeForect Kelley","James Doohan","George Takei","Majel Barrett","Nichelle Nichol","Jonathan Frank","Marina Sirtis","Brent Spiner","Gates McFadden","Michael Dorn","LeVar Burton","Wil Wheaton","Colm Meaney","Michelle Forbes"};
                    String bidder = autoBidders[rand.nextInt(autoBidders.length)]; // select a random bidder name from the list
                    double bid = property.calculateAppraisalPrice() * (1 + rand.nextDouble() * 0.2); // generate a random bid between 100% and 120% of the appraisal price
                    property.newBid(bidder, bid);
                }
            }
            
            System.out.println("Auto-populate bids completed.");
        }
        
}    

    