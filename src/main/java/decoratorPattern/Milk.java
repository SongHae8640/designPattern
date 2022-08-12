package decoratorPattern;

public class Milk extends OptionDecorator{

    public Milk(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost() + 400;
    }

    @Override
    public String getName() {
        return coffee.getName() + ", 우유";
    }
}
