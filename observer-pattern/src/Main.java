import Observable.Observable;
import Observer.EmailObserver;
import Observer.Observer;
import Observer.SmsObserver;
import Observable.IphoneObservable;

public class Main {
    public static void main(String[] args) {
        Observer emailObserver = new EmailObserver("9981");
        Observer smsObserver = new SmsObserver("9779958282");

        Observable observable = new IphoneObservable();
        observable.addObserver(emailObserver);
        observable.addObserver(smsObserver);

        observable.setData(10);
    }
}