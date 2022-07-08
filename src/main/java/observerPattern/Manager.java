package observerPattern;

public class Manager implements Observer{
    private String name;
    private Singer singer;

    public Manager(String name, Singer singer) {
        this.name = name;
        this.singer = singer;
        this.singer.register(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update() {
        System.out.printf("Manager(%s).update\n",this.name);
        this.monitorReaction(this.singer.getAlbums().get(0));
    }

    private void monitorReaction(String album) {
        System.out.printf("Manager(%s).monitorReaction :: album=%s\n",this.name,album);
    }

}
