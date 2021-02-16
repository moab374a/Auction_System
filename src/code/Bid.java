package code;

public class Bid {


    private final long price;
    private final Person bidder;

    public Bid(Person bidder , long price) {
        checker.checkObject(bidder);
        checker.checkLong(price);
        this.price = price;
        this.bidder = bidder;
    }

    public Person getBidder() {
        return bidder;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "code.Bid{" +
                "price=" + price +
                ", bidder=" + bidder +
                '}';
    }
}
