package templateMethodPattern;

public abstract class Beverage {

    public void boilWater(){
        System.out.println("물 끓이기");
    }

    public void pourInCup(){
        System.out.println("컵에 담기");
    }

    abstract void prepareRecipe();

}
