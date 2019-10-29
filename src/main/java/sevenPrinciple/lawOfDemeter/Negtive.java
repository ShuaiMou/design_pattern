package sevenPrinciple.lawOfDemeter;

/**
 * negative example
 */
public class Negtive {
    class Computer {
        public void saveData(){
            System.out.println("save data");
        }

        public void killProcess(){
            System.out.println("kill process");
        }

        public void closeScreen(){
            System.out.println("close screen");
        }

        public void powerOff(){
            System.out.println("power off");
        }
    }


    /**
     * 此时， person对于computer的细节知道得太多了。
     * 对于用户来说， 只需要知道关机按钮在哪里就行了， 不需要知道如何保存数据， 关闭进程， 断电这些操作。
     * 如果用户对这些过程使用不当会造成严重对后果。
     */
    class Person {
        private Computer computer = new Computer();

        public void shutdown(){
            computer.saveData();
            computer.killProcess();
            computer.closeScreen();
            computer.powerOff();
        }
    }

}
