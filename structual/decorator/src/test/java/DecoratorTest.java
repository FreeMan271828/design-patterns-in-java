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
        ICoffee milkCoffee = new MilkDecorator(new OriginalCoffee());
        coffee.makeCoffee();
        System.out.println("");
        //加糖
        ICoffee sugarCoffee = new SugarDecorator(new OriginalCoffee());
        coffee.makeCoffee();
        System.out.println("");
        //加糖奶咖啡
        ICoffee sugarMilkCoffee = new SugarDecorator(
                new MilkDecorator(
                        new OriginalCoffee()
                )
        );
        coffee.makeCoffee();
    }
}
