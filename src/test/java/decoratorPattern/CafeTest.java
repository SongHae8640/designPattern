package decoratorPattern;

import org.junit.Test;

public class CafeTest {

    @Test
    public void orderTest(){

        Coffee espresso = new Espresso();
        System.out.println(espresso.getName());
        System.out.println(espresso.cost());

        System.out.println();

        Coffee latte = new Milk(espresso);
        System.out.println(latte.getName());
        System.out.println(latte.cost());

        System.out.println();

        Coffee soyLatte = new Soy(espresso);
        System.out.println(soyLatte.getName());
        System.out.println(soyLatte.cost());

        System.out.println();


        Coffee dripWhippingLatte = new Whipping(new Milk(new Drip()));
        System.out.println(dripWhippingLatte.getName());
        System.out.println(dripWhippingLatte.cost());


    }
}
