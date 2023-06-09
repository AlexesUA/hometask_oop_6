package ua.edu.cbs.lms.hometask_oop_5.task2_4;

public class Main {
    public static void main(String[] args) {
        Device.Monitor monitor = Device.Monitor.createMotitor("Samsung", "AB1234567CD",
                1024, 768, 200);

        Device.EthernetAdapter ethernetAdapter= Device.EthernetAdapter.createEthernetAdapter("Intel",
                "AE32A3FFC2", 1000, "AE-32-A3-FF-C2", (float)124.90);


        System.out.println(monitor.toString());
        System.out.println(ethernetAdapter.toString());

        System.out.println(monitor.hashCode());
        System.out.println(ethernetAdapter.hashCode());

        Device.Monitor newMonitor = monitor;

        if(monitor.equals(newMonitor)){ // мені здавалось, що запис (monitor == newMonitor) використовує equals
            System.out.println("Is equals.");
        }
        else {
            System.out.println("Is not equals.");
        }

        Device.EthernetAdapter newEthernetAdapter= Device.EthernetAdapter.createEthernetAdapter("Intel",
                "AE32A3FFC2", 1000, "AE-32-A3-FF-C2", (float)124.90);

        if(ethernetAdapter.equals(newEthernetAdapter)){
            System.out.println("Is equals.");
        }
        else {
            System.out.println("Is not equals.");
        }
    }


}
