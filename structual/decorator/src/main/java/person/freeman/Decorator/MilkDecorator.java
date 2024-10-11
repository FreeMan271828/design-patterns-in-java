package person.freeman.Decorator;

public class MilkDecorator extends CoffeeDecorator{


    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    private void addMilk(){
        System.out.print("Add milk ");
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        addMilk();
    }
}
