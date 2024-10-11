import org.springframework.boot.test.context.SpringBootTest;
import person.freeman.Application.Application;
import person.freeman.GenericBuilder.Computer;
import person.freeman.GenericBuilder.GenericBuilder;

@SpringBootTest(classes = Application.class)
public class Test {

    @org.junit.jupiter.api.Test
    public void test(){
        Computer computer = GenericBuilder.of(Computer::new)
                .with(Computer::setCpu, "I9")
                .with(Computer::setGpu, "4080S")
                .with(Computer::setDisplay, "Alienware")
                .build();
    }
}
