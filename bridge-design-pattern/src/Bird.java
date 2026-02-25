public class Bird implements LivingThings{
    BreatheImplementor breatheImplementor;

    Bird(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
