package person.freeman.Bridge;

public class Sugar implements IAdditive {

    public Sugar() {
        addSomething();
    }

    @Override
    public void addSomething() {
        System.out.println("加糖");
    }
}