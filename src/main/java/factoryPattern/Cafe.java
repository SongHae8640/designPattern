package factoryPattern;

public class Cafe {

    CoffeeFactory coffeeFactory;

    public Cafe(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }

    Coffee order(String menu){
        Coffee coffee = this.coffeeFactory.createCoffee(menu);

        coffee.grindBean();
        coffee.extract();
        coffee.pureCup();

        return coffee;
    }
}
