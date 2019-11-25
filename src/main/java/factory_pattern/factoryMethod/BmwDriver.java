package factory_pattern.factoryMethod;

/**
 * 4. 具体工厂角色：
 *  它含有和具体业务逻辑有关的代码。
 */
public class BmwDriver implements Driver{
    @Override
    public Car DriveCar() {
        return new Bmw();
    }
}
