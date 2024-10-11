package person.freeman.Bridge;

public class LargeCoffee extends Coffee {

    public LargeCoffee(IAdditive coffeeAdditives, ITemperature coffeeTemperature) {
        super(coffeeAdditives, coffeeTemperature);
    }

    @Override
    public void orderCoffee(int count) {
        System.out.println("大杯咖啡, 点了"+count+"杯");
    }
}
