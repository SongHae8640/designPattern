package decoratorPattern;

public abstract class OptionDecorator extends Coffee{
    Coffee coffee;
    public abstract String getName();
}
