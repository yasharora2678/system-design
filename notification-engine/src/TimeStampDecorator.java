public class TimeStampDecorator extends NotificationDecorator{
    TimeStampDecorator(Notification notification) {
        super(notification);
    }

    public String getContent() {
        return notification.getContent() + " with timestamp ";
    }
}
