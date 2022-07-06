package ObserverPattern.noPattern;

public class Fan {
    private String name;

    public Fan(String name){
        this.name = name;
    }

    public void update(String album){
        System.out.printf("Fan(%s).update :: album=%s\n",this.name,album);
    }

}
