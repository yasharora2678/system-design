package Observer;

public class EmailObserver implements Observer {
    String userId;

    public EmailObserver(String userId) {
        this.userId = userId;
    }

    public void update() {
        System.out.println("Email Observer:");
        this.sendMail();
    }

    void sendMail() {
        System.out.println("Sending mail to " + userId);
    }
}
