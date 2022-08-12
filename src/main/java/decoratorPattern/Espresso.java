package decoratorPattern;

public class Espresso extends Coffee {

    public Espresso(){
        this.name = "Espresso";
    }

    @Override
    public int cost() {
        return 4100;
    }
}
