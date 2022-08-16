package templateMethodPattern;

import org.junit.Test;

public class BeverageTest {

    @Test
    public void orderTest(){

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println();

        Beverage tee = new Tea();
        tee.prepareRecipe();
    }
}
