package decoratorPattern;

public class Soy extends OptionDecorator{

    Coffee coffee;

    public Soy(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 600;
    }

    @Override
    public String getName() {
        return this.coffee.getName() + ", 두유";
    }
}
