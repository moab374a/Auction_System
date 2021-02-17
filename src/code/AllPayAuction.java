package code;

public class AllPayAuction extends Auction{


    @Override
    public String generateItemString(Item item) {
        checker.checkObject(item);
        return item.getName() +": " + item.getDescription() + " (minimum bidding price: "+ item.getMinPrice()+ " EUR)\n"+
                "Highest bid:"+ item.getHighestBid()+ " EUR by "+item.getMinPrice();
    }
}
