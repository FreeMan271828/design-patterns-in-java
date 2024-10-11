package person.freeman.Bridge;

public class LargeCoffee extends Coffee {

    public LargeCoffee(ICoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void orderCoffee(int count) {
        System.out.println("大杯咖啡, 点了"+count+"杯");
    }
}
