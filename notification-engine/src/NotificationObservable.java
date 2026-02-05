import java.util.ArrayList;
import java.util.List;

public class NotificationObservable {
    Notification notification;

    List<NotificationObserver> observers = new ArrayList<NotificationObserver>();
    public void addObserver(NotificationObserver o) {
        observers.add(o);
    }

    public void removeObserver(NotificationObserver o) {
        observers.remove(o);
    }

    public void notifyObservers(Notification notification) {
        for (NotificationObserver o : observers) {
            o.update(notification);
        }
    }

    public Notification getNotification () {
        return notification;
    }

    public void setNotification (Notification notification) {
        this.notification = notification;
//        notifyObservers();
    }
}
