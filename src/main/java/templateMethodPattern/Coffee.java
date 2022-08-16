package templateMethodPattern;

public class Coffee extends Beverage{

    @Override
    public void brew(){
        System.out.println("커피 내리기");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유 첨가");
    }
}