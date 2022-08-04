package commandPattern;

public class Light {

    public void onLight(){
        System.out.println(this.getClass().getName() + " :: " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void offLight(){
        System.out.println(this.getClass().getName() + " :: " + new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
