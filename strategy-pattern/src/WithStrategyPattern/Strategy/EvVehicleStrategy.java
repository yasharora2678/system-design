package WithStrategyPattern.Strategy;

public class EvVehicleStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive: Electric Capability");
    }
}
