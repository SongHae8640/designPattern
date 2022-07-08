package observerPattern;

public class Reporter implements Observer{
    private String name;
    private Singer singer;

    public Reporter(String name, Singer singer) {
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
        System.out.printf("Reporter(%s).update\n",this.name);
        this.writeArticle(this.singer.getAlbums().get(0));
    }

    private void writeArticle(String album) {
        System.out.printf("Reporter(%s).writeArticle :: album=%s\n",this.name,album);
    }
}
