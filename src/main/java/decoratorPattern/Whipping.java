package decoratorPattern;

public class Whipping extends OptionDecorator{

    public Whipping(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 200;
    }

    @Override
    public String getName() {
        return this.coffee.getName() + ", 휘핑";
    }
}
