package person.freeman.Bridge;

/**
 * 将咖啡的容量作为抽象化部分(大杯，中杯...)，作为本质
 */
public abstract class Coffee {

    protected ICoffeeAdditives coffeeAdditives;

    //使用构造函数注入ICoffeeAdditive,也就是桥接口味和容量
    public Coffee(ICoffeeAdditives coffeeAdditives) {
        this.coffeeAdditives = coffeeAdditives;
    }

    public abstract void orderCoffee(int count);

}
