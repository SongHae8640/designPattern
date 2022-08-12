package decoratorPattern;

public class ColdBrew extends Coffee {

    public ColdBrew(){
        this.name = "ColdBrew";
    }

    @Override
    public int cost() {
        return 5700;
    }
}
