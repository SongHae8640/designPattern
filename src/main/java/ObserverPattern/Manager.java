package ObserverPattern;

public class Manager implements Observer{
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String album) {
        System.out.printf("Manager(%s).update :: album :%s\n",this.name, album);
        this.monitorReaction(album);
    }

    private void monitorReaction(String album) {
        System.out.printf("Manager(%s).monitorReaction :: album=%s\n",this.name,album);
    }

}
