package person.freeman.CustomerBuilder;

public class Computer {
    private String cpu;
    private String gpu;
    private int usbCount;
    private String keyboard;
    private String display;

    //必需的属性放在构造函数中
    public Computer(String cpu, String gpu) {
        this.cpu = cpu;
        this.gpu = gpu;
    }
    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + gpu + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}