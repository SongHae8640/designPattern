package factoryPattern;

public class DripBaseCafe extends Cafe{
    @Override
    Coffee createCoffee(String menu) {
        if (menu.equals("라떼")){
            return new DripBasedLatte();
        }else if(menu.equals("아포가토")){
            return new DripBasedAffogato();
        }else if(menu.equals("아메리카노")) {
            return new DripBasedAmericano();
        }
        return null;
    }
}
