public class Hamburger {
    private String name, meat, breadRollType;
    private double price;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println("Basic hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String name , double price){
        System.out.println("Added " + name + " for an extra " + price);
        this.addition1Name = name;
        this.addition1Price += price;
    }public void addHamburgerAddition2(String name , double price){
        System.out.println("Added " + name + " for an extra " + price);
        this.addition2Name = name;
        this.addition2Price += price;
    }public void addHamburgerAddition3(String name , double price){
        System.out.println("Added " + name + " for an extra " + price);
        this.addition3Name = name;
        this.addition3Price = price;
    }public void addHamburgerAddition4(String name , double price){
        System.out.println("Added " + name + " for an extra " + price);
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        return price + (addition1Price + addition2Price + addition3Price + addition4Price);
    }
}
