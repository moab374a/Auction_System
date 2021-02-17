package code;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class Auction {

    private boolean closed;

    private List<Item> allItems;

    private List<Person> bidders;

    public Auction() {
        allItems = new ArrayList<>();
        bidders = new ArrayList<>();
        closed = false;

    }

    public void addBid(Item bidItem , String nameOfBidder , long price)
    {
        this.checkClosed();
        checker.checkLong(price);
        checker.checkObject(bidItem);
        checker.checkString(nameOfBidder);

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

    private void checkClosed(){
        if (this.closed) throw new IllegalStateException();
    }

    public String closeAuction()
    {
        checkClosed();
        this.closed = true;
        return this.generateItemListString();
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

        for ( Item item:allItems) {
            builder.append(generateItemString(item)+"\n");
        }
        return builder.toString();
    }

    public void registerItem(Item item)
    {
        checker.checkObject(item);
        this.checkClosed();

        if(allItems.contains(item)) throw  new IllegalArgumentException();

        for (Item currentItem: allItems) {
            if (currentItem.getName().equals(item.getName()))
            {
                throw new IllegalArgumentException();
            }

        }

        allItems.add(item);
    }
    public abstract String generateItemString(Item item);

    public List<Item> getAllItems() {

        return allItems;
    }
}
