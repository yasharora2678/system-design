public class EmailStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sending email notification  for " + notification.getContent());
    }
}
