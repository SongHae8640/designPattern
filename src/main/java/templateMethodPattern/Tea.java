package templateMethodPattern;

public class Tea extends Beverage{

    @Override
    public void brew(){
        System.out.println("티백 담그기");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬 첨가");
    }
}