import java.util.List;

public class NotificationEngineObserver extends  NotificationObserver {
    List<NotificationStrategy> strategies;

    public NotificationEngineObserver(List<NotificationStrategy> strategies) {
        this.strategies = strategies;
    }

    void update(Notification notification) {
        System.out.println("------ Notification Engine Observer -------");
        sendNotification(notification);
    }

    public void sendNotification(Notification notification) {
        System.out.println("Sending notification via different strategy");
        for (NotificationStrategy strategy : strategies) {
            strategy.sendNotification(notification);
        }
    }
}
