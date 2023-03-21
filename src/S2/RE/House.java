package S2.RE;

    class House extends Residential {

    private double yardAcres;

    public House() {
        super("", 0, 0, 0, 0);
        this.yardAcres = 0;
    }

    public House(String address, int zip, int bedCount, int bathCount, int sqFootage, double yardAcres) {
        super(address, zip, bedCount, bathCount, sqFootage);
        this.yardAcres = yardAcres;
    }

    public double getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(int yardAcres) {
        this.yardAcres = yardAcres;
    }

    @Override
    double calculateAppraisalPrice() {
        double sqr = 97.00;
        double bed = 10000.00;
        double bath = 12000.00;
        double acy = 460000.00;
        double math = 0;

        math = sqr * getSqFootage() + bed * getBedCount() + bath * getBathCount() + getYardAcres() * acy;

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
            "Yard Size (Acres): %f\n" +
            "------------------------------------------\n" +
            "Appraisal Price: %s\n" +
            "List Price: %s\n" +
            "------------------------------------------\n",
            getAddress(), getZipCode(), getSqFootage(), getBedCount(), getBathCount(), getYardAcres(),
            formattedAppraisalPrice, formattedListPrice
        );
    }


        public int getZipCode() {
            return getZip();
        }

}
