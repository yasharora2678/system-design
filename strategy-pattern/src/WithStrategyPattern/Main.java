package WithStrategyPattern;

import WithStrategyPattern.Strategy.EvVehicleStrategy;
import WithStrategyPattern.Strategy.NormalVehicleStrategy;
import WithStrategyPattern.Strategy.SportsVehicleStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle goodsVehicle = new GoodsVehicle(new NormalVehicleStrategy());
        goodsVehicle.drive();

        Vehicle evVehicle = new EvVehicle(new EvVehicleStrategy());
        evVehicle.drive();

        Vehicle offRoadVehicle = new OffRoadVehicle(new SportsVehicleStrategy());
        offRoadVehicle.drive();

        Vehicle sportsVehicle = new SportsVehicle(new SportsVehicleStrategy());
        sportsVehicle.drive();
    }
}
