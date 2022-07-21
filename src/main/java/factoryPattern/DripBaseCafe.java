package factoryPattern;

public class DripBaseCafe extends Cafe{
    @Override
    Coffee createCoffee(Menu menu) {
        if (Menu.LATTE == menu){
            return new DripBasedLatte();
        }else if(Menu.AFFOGATO == menu){
            return new DripBasedAffogato();
        }else if(Menu.AMERICANO == menu) {
            return new DripBasedAmericano();
        }
        return null;
    }
}
