package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Item {


    private String name;
    private String description;
    private long minPrice;

    private List<Bid> allBids = new ArrayList<>();

    private Bid highestBid;

    public Item(String name, String description, long minPrice) {
        checker.checkString(name);
        checker.checkString(description);
        checker.checkLong(minPrice);
        this.name = name;
        this.description = description;
        this.minPrice = minPrice;
    }

    public void addBid(Person bidder , long price)
    {
        checker.checkObject( bidder);
        checker.checkLong(price);

    }

    public List<Bid> getAllBids() {
        return allBids;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

    @Override
    public String toString() {
        return "code.Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", minPrice=" + minPrice +
                ", allBids=" + allBids +
                ", highestBid=" + highestBid +
                '}';
    }
}
