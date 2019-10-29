package sevenPrinciple.lawOfDemeter;

/**
 * negative example
 */
public class Positive {
    class Computer {
        private void saveData(){
            System.out.println("save data");
        }

        private void killProcess(){
            System.out.println("kill process");
        }

        private void closeScreen(){
            System.out.println("close screen");
        }

        private void powerOff(){
            System.out.println("power off");
        }

        public void shutdown(){
            saveData();
            killProcess();
            closeScreen();
            powerOff();
        }
    }

    class Person {
        private Computer computer = new Computer();

        public void shutdown(){
            computer.shutdown();
        }
    }

}
