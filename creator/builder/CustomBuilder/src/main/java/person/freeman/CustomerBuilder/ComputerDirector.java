package person.freeman.CustomerBuilder;

/**
 * 对于创建过程的控制
 */
public class ComputerDirector {
    public void makeComputer(ComputerBuilder computerBuilder){
        computerBuilder.setKeyBoard();
        computerBuilder.setDisplay();
        computerBuilder.setUsbCount();
    }
}
