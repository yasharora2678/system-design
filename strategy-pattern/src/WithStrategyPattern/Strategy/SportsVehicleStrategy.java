package WithStrategyPattern.Strategy;

public class SportsVehicleStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive: Sports Capability");
    }
}
