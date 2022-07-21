package factoryPattern;

public class Cafe {

    Coffee order(String menu){
        Coffee coffee = null;

        if (menu.equals("라떼")){
            coffee = new Latte();
        }else if(menu.equals("아포가토")){
            coffee = new Affogato();
        }else if(menu.equals("아메리카노")) {
            coffee = new Americano();
        }
        //메뉴가 추가될때 마다 주문 메서드에 변경이 발생 -> OCP 위배

        coffee.grindBean();
        coffee.extract();
        coffee.pureCup();

        return coffee;
    }
}
