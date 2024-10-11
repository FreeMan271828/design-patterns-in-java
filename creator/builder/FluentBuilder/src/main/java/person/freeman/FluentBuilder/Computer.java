package person.freeman.FluentBuilder;

public class Computer {
    private String cpu;
    private String gpu;
    private int usbCount;
    private String keyboard;
    private String display;

    public Computer(Builder builder) {
        cpu = builder.cpu;
        gpu = builder.gpu;
        usbCount = builder.usbCount;
        keyboard = builder.keyboard;
        display = builder.display;
    }

    // 使用静态内部类进行构造
    public static class Builder {
        private String cpu;
        private String gpu;
        private int usbCount;
        private String keyboard;
        private String display;

        // 必须的属性放在构造函数中
        public Builder(String cpu, String gpu) {
            this.cpu = cpu;
            this.gpu = gpu;
        }

        // 可选的属性放在setter中,且使用链式调用
        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
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