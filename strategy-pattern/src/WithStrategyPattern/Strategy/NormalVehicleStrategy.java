package WithStrategyPattern.Strategy;

public class NormalVehicleStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive: Normal Capability");
    }
}
