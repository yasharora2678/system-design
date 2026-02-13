package SingletonApproach1;

public class Main {
    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();
        System.out.println(singleton == singleton2);
    }
}