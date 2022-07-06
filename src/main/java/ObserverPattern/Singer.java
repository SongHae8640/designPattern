package ObserverPattern;


import java.util.*;

public class Singer implements Subject {
    private String name;
    private Set<Observer> observers = new HashSet<>();
    private List<String> albums;

    public Singer(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        System.out.printf("Singer(%s).unregister :: name=%s\n",this.name,observer.getName());
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String album) {
        for (Observer observer: observers) {
            observer.update(album);
        }
    }

    public void releaseAlbum(String album){
        this.albums.add(album);
        System.out.printf("Singer(%s).releaseAlbum :: album=%s\n",this.name,album);
        this.notifyObserver(album);

    }

}
