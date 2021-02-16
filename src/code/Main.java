package code;

public class Main {

    public static void main(String[] args) {

        Person max = new Person("max");
        Item tv = new Item("Tv", "Samsung", 200);
        tv.addBid(max , 300);
        EnglishAuction e1 = new EnglishAuction();
        e1.addBid(tv , "Tv" , 300);











        Item iphone = new Item("iphone", "apple", 600);
        e1.registerItem(tv);

        e1.registerItem(iphone);



        e1.addBid(iphone , "iphone" , 900);










    }
}
