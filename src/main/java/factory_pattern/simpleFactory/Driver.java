package factory_pattern.simpleFactory;

/**
 * 3.工厂类角色
 *
 * 返回对象为抽象产品角色，具有一定的商业逻辑和判断逻辑。
 */

public class Driver {
    public static Car driverCar(String type){
        //判断逻辑，返回具体的产品
        if ("benz".equalsIgnoreCase(type)){
            return new Benz();
        }else if("Bmw".equalsIgnoreCase(type)){
            return new Bmw();
        }else {
            return null;
        }
    }
}
