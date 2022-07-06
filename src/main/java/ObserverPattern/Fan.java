package ObserverPattern;

public class Fan implements Observer{
    private String name;

    public Fan(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.printf("Fan(%s).update :: message :%s\n",this.name, message);
    }
}
