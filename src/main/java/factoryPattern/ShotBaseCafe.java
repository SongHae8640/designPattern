package factoryPattern;

public class ShotBaseCafe extends Cafe{
    @Override
    Coffee createCoffee(String menu) {
        if (menu.equals("라떼")){
            return new ShotBasedLatte();
        }else if(menu.equals("아포가토")){
            return new ShotBasedAffogato();
        }else if(menu.equals("아메리카노")) {
            return new ShotBasedAmericano();
        }
        return null;
    }
}
