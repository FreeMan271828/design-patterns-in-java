import org.springframework.boot.test.context.SpringBootTest;
import person.freeman.Application.Application;
import person.freeman.CustomerBuilder.*;

@SpringBootTest(classes = {Application.class})
public class CustomBuilderTest {

    @org.junit.jupiter.api.Test
    public void test(){
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder macComputerBuilder = new MacComputerBuilder("i7","4090");
        director.makeComputer(macComputerBuilder);
        Computer computer = macComputerBuilder.getComputer();
        System.out.println(computer.toString());
        ComputerBuilder dellComputerBuilder = new DellComputerBuilder("i7","4090");
        director.makeComputer(dellComputerBuilder);
        computer = dellComputerBuilder.getComputer();
        System.out.println(computer.toString());
    }
}
