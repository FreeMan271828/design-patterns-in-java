package person.freeman.Bridge;

public class Cold implements ITemperature{

    public Cold(){
        showTemperature();
    }

    @Override
    public void showTemperature() {
        System.out.println("加冰");
    }
}
