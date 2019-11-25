package factory_pattern.simpleFactory;

public class Magnate {
    public static void main(String[] args) {
        Car car = Driver.driverCar("benz");
        if (null != car)
            car.drive();
    }
}
