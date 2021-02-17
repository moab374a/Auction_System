package code;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class Auction {

    private boolean closed=false;

    private List<Item> allItems;

    private List<Person> bidders;

    public Auction() {
        allItems = new ArrayList<>();
        bidders = new ArrayList<>();

    }

    public void addBid(Item bidItem , String nameOfBidder , long price)
    {
        checker.checkLong(price);checker.checkObject(bidItem);checker.checkString(nameOfBidder);

        if(this.closed) throw new IllegalStateException();
        if (!checkItem(bidItem.getName())) throw new NoSuchElementException();
        bidders.add(new Person(nameOfBidder));
        allItems.add(bidItem);


    }

    public boolean checkItem(String name){

        for (Item item : allItems) {
            if (item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public String closeAuction()
    {
        if (closed) throw new IllegalStateException();
        return generateItemListString();
    }

    public String generateAllBidsString(Item item){
        checker.checkObject(item);
        StringBuilder names= new StringBuilder();
        names.append("All bids:");

        for (Bid pointer : item.getAllBids()) {
            names.append("\n").append(pointer.toString());
        }

        return names.toString();
    }

    public String generateItemListString(){
        StringBuilder builder= new StringBuilder();

        builder.append("");
        for ( Item item:allItems) {
            builder.append(generateItemString(item)+"\n");
        }

        return builder.toString();
    }

    public void registerItem(Item item)
    {
        checker.checkObject(item);
        if (checkItem(item.getName())) throw new IllegalArgumentException();
        allItems.add(item);
    }
    public abstract String generateItemString(Item item);

    public List<Item> getAllItems() {

        return allItems;
    }
}
