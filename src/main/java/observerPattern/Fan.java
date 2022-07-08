package observerPattern;

import java.util.List;

public class Fan implements Observer{
    private String name;
    private Singer singer;

    public Fan(String name, Singer singer) {
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
        System.out.printf("Fan(%s).update\n",this.name);
        listenAllAlbums();
    }

    private void listenAllAlbums() {
        List<String> albums = this.singer.getAlbums();
        for(String album : albums){
            System.out.printf("Fan(%s).listenAllAlbums :: album =%s\n",this.name,album);
        }
    }
}
