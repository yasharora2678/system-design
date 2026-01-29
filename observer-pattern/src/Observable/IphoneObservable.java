package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {
    List<Observer> observerList = new ArrayList<>();
    Integer stockCount = 0;

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(Integer count) {
        this.stockCount += count;
        this.notifyObserver();
    }

    @Override
    public Integer getData() {
        return this.stockCount;
    }
}
