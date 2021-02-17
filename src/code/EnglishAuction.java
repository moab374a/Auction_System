package code;

public class EnglishAuction extends Auction{
    @Override
    public String generateItemString(Item item) {
        checker.checkObject(item);
        return item.getName() +": " + item.getDescription() + " (minimum bidding price: "+ item.getMinPrice()+ " EUR)\n" +
                "No bids placed";
    }
}
