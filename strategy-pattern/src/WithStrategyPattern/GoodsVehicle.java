package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
