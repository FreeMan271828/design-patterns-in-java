import org.springframework.boot.test.context.SpringBootTest;
import person.freeman.Application.Application;
import person.freeman.Bridge.Coffee;
import person.freeman.Bridge.LargeCoffee;
import person.freeman.Bridge.Milk;

@SpringBootTest(classes = Application.class)
public class Test {

    @org.junit.jupiter.api.Test
    public void test() {
        // 先构建出实现化部分,也就是本质
        // 由于Coffee采用抽象类, 所以可以再增加一个维度(大杯,小杯...)
        Coffee coffee = new LargeCoffee(new Milk());
        // 再使用抽象化部分,选择点了多少杯
        // (符合业务逻辑, 即杯数易变, 口味相对固定)
        coffee.orderCoffee(2);
    }
}
