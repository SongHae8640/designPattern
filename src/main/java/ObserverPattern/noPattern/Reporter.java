package ObserverPattern.noPattern;

public class Reporter {
    private String name;

    public Reporter(String name){
        this.name = name;
    }

    public void update(String album){
        System.out.printf("Reporter(%s).update :: album=%s\n",this.name,album);
        this.writeArticle(album);
    }

    private void writeArticle(String album) {
        System.out.printf("Reporter(%s).writeArticle :: album=%s\n",this.name,album);
    }
}
