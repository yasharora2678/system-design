public class Fish implements LivingThings{
    BreatheImplementor breatheImplementor;

    Fish(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
