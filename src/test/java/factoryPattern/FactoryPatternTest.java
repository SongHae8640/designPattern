package factoryPattern;

import org.junit.Test;

public class FactoryPatternTest {

    @Test
    public void orderTest(){

        Cafe starbucks = new ShotBaseCafe();
        starbucks.order("아메리카노");
        starbucks.order("아포가토");

        Cafe starbucksR = new DripBaseCafe();
        starbucksR.order("라떼");

    }
}
