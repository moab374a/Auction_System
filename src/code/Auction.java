package code;

import java.util.ArrayList;
import java.util.List;

public abstract class Auction {

    private boolean closed;

    private List<Item> allItems;

    private List<Person> bidders;

    public Auction() {
        allItems = new ArrayList<>();
        bidders = new ArrayList<>();
    }

    public void addBid(Item bidItem , String nameOfBidder , long price)
    {

        checker.checkLong(price);checker.checkObject(bidItem);checker.checkString(nameOfBidder);

    }

    public String closeAuction()
    {
        return null;
    }

    public String generateAllBidsString(Item item){
        return "";
    }

    public String generateItemListString(){
        return "";
    }

    public void registerItem(Item item)
    {

        checker.checkObject(item);
    }
    public abstract String generateItemString(Item item);

    public List<Item> getAllItems() {
        return allItems;
    }
}
