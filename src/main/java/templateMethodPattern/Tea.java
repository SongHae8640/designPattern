package templateMethodPattern;

public class Tea {

    public void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }


    public void boilWater(){
        System.out.println("물 끓이기");
    }

    public void steepTeaBag(){
        System.out.println("티백 담그기");
    }

    public void pourInCup(){
        System.out.println("컵에 담기");
    }

    public void addLemon(){
        System.out.println("레몬 첨가");
    }
}