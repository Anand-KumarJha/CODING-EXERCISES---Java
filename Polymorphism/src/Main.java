public class Main {

    public static void main(String[] args) {
        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());

        Holden holdenCar = new Holden(3,"Holden");
        System.out.println(holdenCar.accelerate());

    }
}
