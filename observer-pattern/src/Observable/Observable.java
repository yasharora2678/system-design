package Observable;

import Observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    void setData(Integer Count);
    Integer getData();
}
