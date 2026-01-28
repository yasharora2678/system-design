package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class EvVehicle extends Vehicle{
    EvVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
