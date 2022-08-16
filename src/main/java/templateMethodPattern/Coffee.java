package templateMethodPattern;

public class Coffee {

    public void prepareRecipe(){
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndMilk();
    }


    public void boilWater(){
        System.out.println("물 끓이기");
    }

    public void brewCoffee(){
        System.out.println("커피 내리기");
    }

    public void pourInCup(){
        System.out.println("컵에 담기");
    }

    public void addSugarAndMilk(){
        System.out.println("설탕과 우유 첨가");
    }
}