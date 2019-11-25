package factory_pattern.factoryMethod;


public class Magnate {
    public static void main(String[] args) {

        //拿到 Benz car的工厂方法
        Driver driver = new BenzDriver();

        //工厂方法生产具体产品
        Car car = driver.DriveCar();

        car.drive();

    }
}
