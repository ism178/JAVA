package RealEstate;

abstract class House extends Residential{

    private int yardAcres;


    public House() {
        super("", 0, 0, 0, 0);
        this.yardAcres = 0;
    }

    public House(String a, int b, int bedCount, int bathCount, int sqFootage, int yardAcres) {
        super(a, b, bedCount, bathCount, sqFootage);
        this.yardAcres = yardAcres;
    }

    public int getYardAcres() {
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
        double math =0;

        math = sqr * getSqFootage() + bed * getBedCount() + bath * getBathCount() + getYardAcres() * acy;

        return math;

    
}
}