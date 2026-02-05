public abstract class NotificationDecorator implements Notification {
    Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }
}
