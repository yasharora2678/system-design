public class PopUpStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending popup notification for " + notification.getContent());
    }
}
