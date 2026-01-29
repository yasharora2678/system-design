package Observer;

public class SmsObserver implements Observer {
    String userNumber;

    public SmsObserver(String userNumber) {
        this.userNumber = userNumber;
    }

    public void update() {
        System.out.println("SMS Observer:");
        this.sendSms();
    }

    void sendSms() {
        System.out.println("Sending SMS to " + userNumber);
    }
}
