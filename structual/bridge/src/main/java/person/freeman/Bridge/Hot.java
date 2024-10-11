package person.freeman.Bridge;

public class Hot implements ITemperature{

    @Override
    public void showTemperature() {
        System.out.println("hot");
    }
}
