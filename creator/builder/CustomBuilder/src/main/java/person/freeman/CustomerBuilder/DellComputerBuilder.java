package person.freeman.CustomerBuilder;

public class DellComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public DellComputerBuilder(String cpu, String ram) {
        computer=new Computer(cpu,ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyBoard() {
        computer.setKeyboard("Dell键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("Dell显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
