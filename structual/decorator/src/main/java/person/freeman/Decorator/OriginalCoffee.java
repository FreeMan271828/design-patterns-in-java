package person.freeman.Decorator;

public class OriginalCoffee implements ICoffee {

    @Override
    public void makeCoffee() {
        System.out.print("Original Coffee ");
    }
}
