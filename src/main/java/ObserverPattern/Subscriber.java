package ObserverPattern;

import java.util.HashSet;

public class Subscriber implements Observer{
    private String name;
    private HashSet<Subject> subjects = new HashSet<>();

    public Subscriber(String name) {
        this.name = name;
    }

    public void subscribe(Subject subject){
        subject.register(this);
        this.subjects.add(subject);
    }

    public void cancelSubscription(Subject subject){
        subject.unregister(this);
        this.subjects.remove(subject);
    }

    @Override
    public void update(Subject subject) {
        String message = subject.getMessage();
        System.out.printf("Subscriber(%s).update :: message :%s\n",this.name, message);

    }
}
