package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    protected List<Observer> list = new ArrayList<>();

    protected void add(Observer observer) {
        this.list.add(observer);
    }

    protected void remove(Observer observer) {
        this.list.remove(observer);
    }

    protected void sendNotifications() {
        this.list.forEach(Observer::update);
    }

}
