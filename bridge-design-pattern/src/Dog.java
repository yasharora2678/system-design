public class Dog implements LivingThings{
    BreatheImplementor breatheImplementor;

    Dog(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
