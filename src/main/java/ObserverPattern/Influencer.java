package ObserverPattern;


import java.util.*;

public class Influencer implements Subject {
    private String name;
    private Set<Observer> observers = new HashSet<>();
    private String message;

    public Influencer(String name) {
        this.name = name;
        this.message = "";
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void postMessage(String message){
        this.message = message;
        System.out.printf("Influencer(%s).postMessage :: message=%s\n",this.name,this.message);
        this.notifyObserver();

    }

}
