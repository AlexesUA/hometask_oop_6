package ua.edu.cbs.lms.hometask_oop_5;

public class Device {
    private String manufacturer;
    private String serialNumber;
    private float price;

    public Device(String manufacturer, String serialNumber, float price){
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public class Monitor{

        Device device;
        private int resolutionX;
        private int resolutionY;

        public Monitor(String manufacturer, String serialNumber, int resolutionX, int resolutionY, float price){
            this.device = new Device(manufacturer, serialNumber, price);
            this.resolutionX = resolutionX;
            this.resolutionY = resolutionY;
        }
    }

    public class EthernetAdapter{

        Device device;
        private int spead;
        private String mac;

        public EthernetAdapter(String manufacturer, String serialNumber, int spead, String mac, float price){
            this.device = new Device(manufacturer, serialNumber, price);
            this.spead = spead;
            this.mac = mac;
        }
    }
}
