public class LoggerObserver extends NotificationObserver{
    Notification message;

    public LoggerObserver(String message) {
//        this.message = message;
    }

    void update(Notification notification) {
        System.out.println("------ Logger Observer -----");
        this.message = notification;
        logMessage();
    }

    public void logMessage() {
        System.out.println(message.getContent());
    }
}
