package decoratorPattern;

public class Drip extends Coffee {

    public Drip(){
        this.name = "Drip";
    }

    @Override
    public int cost() {
        return 6500;
    }
}
