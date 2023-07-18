


package S2.RE;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Listings implements Listable {
    
    private static Listings instance = null;
    private HashMap<String, Residential> listings;
    
    public Listings() {
        listings = new HashMap<String, Residential>();
    }
    
    @Override
    public HashMap<String, Residential> getListings() {
        return listings;
    }
    
    @Override
    public Residential getListing(String address) {
        return listings.get(address);
    }
    
    @Override
    public Set<String> getStreetAddresses() {
        return listings.keySet();
    }
    
    @Override
    public Collection<Residential> getResidences() {
        return listings.values();
    }
    
    @Override
    public int getListingCount() {
        return listings.size();
    }
    
    @Override
    public void addListing(String address, Residential property) {
        listings.put(address, property);
    }

    public static Listings getInstance() {
        if (instance == null) {
            instance = new Listings();
        }
        return instance;
    }

    @Override
    public String toString() {
        String result = "Listings:\n";
        for (Residential residence : listings.values()) {
            result += "----------------------------------------\n";
            result += String.format("Residence Type: %s           Address: %s           Zip Code: %s\n",
                                    residence.getClass().getSimpleName(), residence.getAddress(), residence.getZip());
            result += "----------------------------------------\n";
            result += String.format("Sq Footage: %d\nBedrooms: %d\nBathrooms: %d\n",
                                    residence.getSqFootage(), residence.getBedCount(), residence.getBathCount());
            if (residence instanceof House) {
                House house = (House) residence;
                result += String.format("Yard Size (Acres): %f\n", house.getYardAcres());
            } else if (residence instanceof Condo) {
                Condo condo = (Condo) residence;
                result += String.format("Floor Level: %d\n", condo.getFloorLvl());
            }
            result += "------------------------------------------\n";
            result += String.format("Appraisal Price: $%,.2f\nList Price: $%,.2f\n", residence.calculateAppraisalPrice(), residence.getListPrice());
            result += "------------------------------------------\n\n";
        }
        return result;
    }


    
}