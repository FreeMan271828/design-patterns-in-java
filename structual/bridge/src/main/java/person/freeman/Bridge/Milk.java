package person.freeman.Bridge;

public class Milk implements IAdditive {

    public Milk(){
        addSomething();
    }

    @Override
    public void addSomething() {
        System.out.println("加奶");
    }
}
