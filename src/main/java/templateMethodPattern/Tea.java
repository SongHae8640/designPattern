package templateMethodPattern;

public class Tea extends Beverage{

    public void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void steepTeaBag(){
        System.out.println("티백 담그기");
    }

    public void addLemon(){
        System.out.println("레몬 첨가");
    }
}