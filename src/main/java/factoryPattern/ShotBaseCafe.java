package factoryPattern;

public class ShotBaseCafe extends Cafe{
    @Override
    Coffee createCoffee(Menu menu) {
        if (Menu.LATTE == menu){
            return new ShotBasedLatte();
        }else if(Menu.AFFOGATO == menu){
            return new ShotBasedAffogato();
        }else if(Menu.AMERICANO == menu) {
            return new ShotBasedAmericano();
        }
        return null;
    }
}
