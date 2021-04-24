package kz.onggar.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Chat implements Observable {

    List<Observer> observers;
    DataChunk dataChunk;

    public Chat() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this.dataChunk));
    }

    public void setNewDataChunk(DataChunk dataChunk) {
        this.dataChunk = dataChunk;
        notifyObservers();
    }
}
