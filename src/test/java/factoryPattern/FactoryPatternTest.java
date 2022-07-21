package factoryPattern;

import org.junit.Test;

public class FactoryPatternTest {

    @Test
    public void orderTest(){

        Cafe starbucks = new ShotBaseCafe();
        starbucks.order(Menu.AMERICANO);
        starbucks.order(Menu.AFFOGATO);

        Cafe starbucksR = new DripBaseCafe();
        starbucksR.order(Menu.LATTE);

    }
}
