package S2.RE;

abstract class Residential extends Property{
    private int bedCount;
    private int bathCount;
    private int sqFootage;
    
    public Residential() {
        super("",0);
        this.bedCount = 0;
        this.bathCount = 0;
        this.sqFootage = 0;
    }
    
    public Residential(String a, int b, int bedCount, int bathCount, int sqFootage) {
        super(a,b);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
    }
    public int getBedCount() {
        return bedCount;
    }
    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }
    public int getBathCount() {
        return bathCount;
    }
    public void setBathCount(int bathCount) {
        this.bathCount = bathCount;
    }
    public int getSqFootage() {
        return sqFootage;
    }
    public void setSqFootage(int sqFootage) {
        this.sqFootage = sqFootage;
    }

    


    
}
