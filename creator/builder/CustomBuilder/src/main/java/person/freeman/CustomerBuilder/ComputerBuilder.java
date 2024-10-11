package person.freeman.CustomerBuilder;

/**
 * 将非必需的属性放在建造者中
 */
public interface ComputerBuilder {
    public void setUsbCount();
    public void setKeyBoard();
    public void setDisplay();
    public Computer getComputer();
}