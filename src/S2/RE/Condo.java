package S2.RE;

public class Condo extends Residential {
    private int floorLvl;

    public Condo() {
        super("", 0, 0, 0, 0);
        this.floorLvl = 0;
    }
    public Condo(String a, int b, int bedCount, int bathCount, int sqFootage, int floorLvl) {
        super(a, b, bedCount, bathCount, sqFootage);
        this.floorLvl = floorLvl;
    }

    public int getFloorLvl() {
        return floorLvl;
    }

    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }
    @Override
    double calculateAppraisalPrice() {
        double sqr = 88.00;
        double bed = 8000.00;
        double bath = 10000.00;
        double lvl = 5000.00;
        double math =0;
        if(getFloorLvl() > 1){
            math = sqr * getSqFootage() + bed * getBedCount() + bath * getBathCount() + lvl * (getFloorLvl() -1);
        }else{
            math = sqr * getSqFootage() + bed * getBedCount() + bath * getBathCount();
        }
        return math;


        
        
    }
    @Override
    public String toString() {
        String formattedAppraisalPrice = String.format("$%,.2f", calculateAppraisalPrice());
        String formattedListPrice = String.format("$%,.2f", getListPrice());

        return String.format(
            "-------------------------------------------------------------------------------------------------------\n" +
            "Residence Type: House           Address: %s           Zip Code: %s\n" +
            "-------------------------------------------------------------------------------------------------------\n" +
            "Sq Footage: %d\n" +
            "Bedrooms: %d\n" +
            "Bathrooms: %d\n" +
            "Floor Lvevel: %d\n" +
            "------------------------------------------\n" +
            "Appraisal Price: %s\n" +
            "List Price: %s\n" +
            "------------------------------------------\n",
            getAddress(), getZipCode(), getSqFootage(), getBedCount(), getBathCount(), getFloorLvl(),
            formattedAppraisalPrice, formattedListPrice
        );
    }
    public int getZipCode() {
        return getZip();
    }

    

}
