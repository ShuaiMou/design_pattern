package factory_pattern.factoryMethod;

/**
 * 2.具体产品角色2
 */
public class Bmw implements Car {
    @Override
    public void drive() {
        System.out.println("drive bmw.");
    }
}
