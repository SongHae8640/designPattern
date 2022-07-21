package factoryPattern;

import org.junit.Test;

public class FactoryPatternTest {

    @Test
    public void orderTest(){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Cafe gigaCoffee = new Cafe(coffeeFactory);

        gigaCoffee.order("아메리카노");
        gigaCoffee.order("라떼");
        gigaCoffee.order("아포가토");

    }
}
