package design.pattern.creator.facatory.function;

import java.util.function.Function;

/**
 * Created by fang_j on 2021/02/04.
 */
public class Vehicle {
    private VehicleColor color;

    public Vehicle(VehicleColor color) {
        this.color = color;
    }

    static class Car extends Vehicle {
        public Car(VehicleColor color) {
            super(color);
        }
    }

    static class Bus extends Vehicle {
        public Bus(VehicleColor color) {
            super(color);
        }
    }

    static class Truck extends Vehicle {
        public Truck(VehicleColor color) {
            super(color);
        }
    }

     enum VehicleType {
        CAR(Car::new), BUS(Bus::new), TRUCK(Truck::new);

         public final Function<VehicleColor, Vehicle> factory;

         VehicleType(Function<VehicleColor, Vehicle> factory) {
             this.factory = factory;
         }
     }

     enum VehicleColor {
        RED, BLUE
     }
}
