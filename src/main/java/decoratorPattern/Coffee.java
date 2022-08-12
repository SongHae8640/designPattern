package decoratorPattern;

public abstract class Coffee {
    String name = "Coffee";

    public String getName() {
        return name;
    }

    public abstract int cost();
}
