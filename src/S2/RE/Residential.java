package S2.RE;
import java.util.HashMap;
import java.util.Set;

public abstract class Residential extends Property implements Biddable {
    private int bedCount;
    private int bathCount;
    private int sqFootage;
    private HashMap<String, Double> bids;

    public Residential() {
        super("", 0);
        this.bedCount = 0;
        this.bathCount = 0;
        this.sqFootage = 0;
        this.bids = new HashMap<String, Double>();
    }

    public Residential(String a, int b, int bedCount, int bathCount, int sqFootage) {
        super(a, b);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
        this.bids = new HashMap<String, Double>();
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

    // Biddable interface implementation
    @Override
    public HashMap<String, Double> getBids() {
        return bids;
    }

    @Override
    public Double getBid(String bidder) {
        return bids.get(bidder);
    }

    @Override
    public Set<String> getBidders() {
        return bids.keySet();
    }

    @Override
    public int getBidCount() {
        return bids.size();
    }

    @Override
    public void newBid(String bidder, Double bid) {
        bids.put(bidder, bid);
    }
}
