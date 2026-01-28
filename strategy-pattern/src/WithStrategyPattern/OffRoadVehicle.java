package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
