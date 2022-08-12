package decorationPattern;

public abstract class Coffee {
    String name = "Coffee";

    public String getName() {
        return name;
    }

    public abstract double cost();
}
