import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import person.freeman.Application.Application;
import person.freeman.FluentBuilder.Computer;

@SpringBootTest(classes = Application.class)
public class FluentBuilderTest {

    @Test
    public void test(){
        Computer computer = new Computer.Builder("i7","4080")
                // 以下均为可选项
                .setDisplay("KTC")
                .setKeyboard("ATK")
                .setUsbCount(2)
                .build();
        System.out.println(computer.toString());
    }
}
