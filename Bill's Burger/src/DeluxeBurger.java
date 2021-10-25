public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("DeluxeBurger", "Brown", 10 , "sexy");
        super.addHamburgerAddition1("Chips", 5);
        super.addHamburgerAddition2("Drink", 4.10);
        System.out.println("Deluxe hamburger on a sexy roll with Brown Meat " + ", price is " + 10);
    }

    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

}
