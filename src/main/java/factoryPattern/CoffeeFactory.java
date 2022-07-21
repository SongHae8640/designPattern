package factoryPattern;

public class CoffeeFactory {

    public Coffee createCoffee(String menu){
        Coffee coffee = null;

        if (menu.equals("라떼")){
            coffee = new Latte();
        }else if(menu.equals("아포가토")){
            coffee = new Affogato();
        }else if(menu.equals("아메리카노")) {
            coffee = new Americano();
        }

        return coffee;
    }
}
