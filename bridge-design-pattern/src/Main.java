public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(new LandBreatheImplementor());
        Fish fish = new Fish(new WaterBreatheImplementor());
        Bird bird = new Bird(new AirBreatheImplementor());

        dog.breatheProcess();
        fish.breatheProcess();
        bird.breatheProcess();
    }
}