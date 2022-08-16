package templateMethodPattern;

public class Coffee extends Beverage{

    public void prepareRecipe(){
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndMilk();
    }

    public void brewCoffee(){
        System.out.println("커피 내리기");
    }

    public void addSugarAndMilk(){
        System.out.println("설탕과 우유 첨가");
    }
}