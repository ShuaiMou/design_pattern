package factory_pattern.simpleFactory;

/**
 * 2.具体产品角色1
 *    工厂类所创建的对象就是此角色的实例。
 */
public class Benz implements Car{
    @Override
    public void drive() {
        System.out.println("drive benz.");
    }
}
