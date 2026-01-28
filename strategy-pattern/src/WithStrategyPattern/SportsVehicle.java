package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
