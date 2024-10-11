package person.freeman.Decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }
    @Override
    public void makeCoffee() {
        super.makeCoffee();
        addSugar();
    }
    private void addSugar(){
        System.out.print("Add Sugar ");
    }
}