package person.freeman.Bridge;

public class Sugar implements  ICoffeeAdditives{

    public Sugar() {
        addSomething();
    }

    @Override
    public void addSomething() {
        System.out.println("加糖");
    }
}