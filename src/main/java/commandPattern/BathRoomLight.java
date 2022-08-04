package commandPattern;

public class BathRoomLight {

    public void on(){
        System.out.println(this.getClass().getName() + " :: " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void off(){
        System.out.println(this.getClass().getName() + " :: " + new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
