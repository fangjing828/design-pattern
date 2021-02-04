package design.pattern.creator.facatory.function;

/**
 * Created by fang_j on 2021/02/04.
 */
public class VehicleFactory {
    public static Vehicle instanceOfType(Vehicle.VehicleType type, Vehicle.VehicleColor color) {
        switch (type) {
            case CAR:
                return new Vehicle.Car(color);
            case BUS:
                return new Vehicle.Bus(color);
            case TRUCK:
                return new Vehicle.Truck(color);
            default:
                throw new IllegalArgumentException("Not support for type " + type);
        }
    }

    public static void main(String[] args) {
        {
            Vehicle redCar = VehicleFactory.instanceOfType(Vehicle.VehicleType.CAR, Vehicle.VehicleColor.RED);
        }

        {
            Vehicle redCar = Vehicle.VehicleType.CAR.factory.apply(Vehicle.VehicleColor.RED);
        }
    }
}