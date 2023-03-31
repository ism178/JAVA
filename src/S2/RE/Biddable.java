package S2.RE;
import java.util.HashMap;
import java.util.Set;

public interface Biddable {
    HashMap<String, Double> getBids();
    Double getBid(String bidder);
    Set<String> getBidders();
    int getBidCount();
    void newBid(String bidder, Double bid);
}
