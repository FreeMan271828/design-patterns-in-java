import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import person.freeman.Decorator.*;

@SpringBootTest(classes = Appendable.class)
public class DecoratorTest {

    @Test
    public void test(){
        //原味咖啡
        ICoffee coffee = new OriginalCoffee();
        coffee.makeCoffee();
        System.out.println("");

        //加奶
        coffee = new MilkDecorator(coffee);
        coffee.makeCoffee();
        System.out.println("");

        //加糖
        coffee = new SugarDecorator(coffee);
        coffee.makeCoffee();
        System.out.println("");

    }
}
