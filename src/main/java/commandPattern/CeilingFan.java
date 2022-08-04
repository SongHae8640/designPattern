package commandPattern;

public class CeilingFan {

    public void high(){
        System.out.println(this.getClass().getName() + " :: " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void row(){
        System.out.println(this.getClass().getName() + " :: " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public void off(){
        System.out.println(this.getClass().getName() + " :: " + new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
