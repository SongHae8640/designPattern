package factoryPattern;

public abstract class Cafe {

    Coffee order(String menu){
        Coffee coffee = this.createCoffee(menu);

        coffee.grindBean();
        coffee.extract();
        coffee.pureCup();

        return coffee;
    }

    abstract Coffee createCoffee(String menu);
}
