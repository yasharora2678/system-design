import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Notification notification = new TimeStampDecorator(new SignatureDecorator(new SimpleNotification()));

        NotificationStrategy emailStrategy = new EmailStrategy();
        NotificationStrategy popUpStrategy = new PopUpStrategy();
        List<NotificationStrategy> strategies = new ArrayList<>();
        strategies.add(emailStrategy);
        strategies.add(popUpStrategy);

        NotificationObserver loggerObserver = new LoggerObserver("LoggingObserver message");
        NotificationObserver notificationEngineObserver = new NotificationEngineObserver(strategies);

        NotificationObservable observable = new NotificationObservable();
        observable.addObserver(loggerObserver);
        observable.addObserver(notificationEngineObserver);

        NotificationService notificationService = new NotificationService(observable);
        notificationService.addNotification(notification);
        notificationService.sendNotification();
    }
}