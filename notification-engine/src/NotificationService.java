import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    ArrayList<Notification> notifications = new ArrayList<>();
    NotificationObservable  notificationObservable;

    NotificationService(NotificationObservable notificationObservable) {
        this.notificationObservable = notificationObservable;
    }
    void addNotification(Notification notification) {
        notifications.add(notification);
    }

    void sendNotification() {
        for(Notification notification : notifications) {
            notificationObservable.notifyObservers(notification);
        }
    }
}
