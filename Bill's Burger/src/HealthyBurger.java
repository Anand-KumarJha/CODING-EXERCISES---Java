public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("HealthyBurger", meat, price, "sexy");
        System.out.println("Healthy hamburger on a sexy roll" + " with " + meat + ", price is " + price);
    }

    public void addHealthyAddition1(String name, double price){
        System.out.println("Added" + name + " for an extra " + price);
        healthyExtra1Name = name;
        healthyExtra1Price += price;
    }public void addHealthyAddition2(String name, double price){
        System.out.println("Added" + name + " for an extra " + price);
        healthyExtra2Name = name;
        healthyExtra2Price += price;
    }
    @Override
    public double itemizeHamburger(){
        return  super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
    }
}
