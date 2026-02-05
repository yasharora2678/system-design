public class SignatureDecorator extends NotificationDecorator{
    SignatureDecorator(Notification notification) {
        super(notification);
    }

    public String getContent() {
        return notification.getContent() + " with signature ";
    }
}
