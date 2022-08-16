package templateMethodPattern;

public abstract class Beverage {

    final void boilWater(){
        System.out.println("물 끓이기");
    }

    final void pourInCup(){
        System.out.println("컵에 담기");
    }

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

}
