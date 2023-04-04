package ua.edu.cbs.lms.hometask_oop_5;

import java.util.Objects;

public class Device {
    private String manufacturer;
    private String serialNumber;
    private float price;

    private Device(){}

    private Device(String manufacturer, String serialNumber, float price){
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }
    public String toString() {
        return "Device: manufacturer = " + manufacturer + ", serialNumber = " + serialNumber +
                ", price= " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device device)) return false;
        return Float.compare(device.price, price) == 0 && Objects.equals(manufacturer, device.manufacturer)
                && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, serialNumber, price);
    }

    public class Monitor{

        private Device device;
        private int resolutionX;
        private int resolutionY;

        private Monitor(String manufacturer, String serialNumber, int resolutionX, int resolutionY, float price){
            this.device = new Device(manufacturer, serialNumber, price);
            this.resolutionX = resolutionX;
            this.resolutionY = resolutionY;

        }

        public static Monitor createMotitor(String manufacturer, String serialNumber,
                                            int resolutionX, int resolutionY, float price){
            return new Device().new Monitor(manufacturer, serialNumber, resolutionX, resolutionY, price);
        }

        @Override
        public String toString() {
            return device.toString() + ",\n resolutionX= " + resolutionX +", resolutionY= " + resolutionY;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Monitor monitor)) return false;
            return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY && Objects.equals(device, monitor.device);
        }

        @Override
        public int hashCode() {
            return Objects.hash(device, resolutionX, resolutionY);
        }
    }

    public class EthernetAdapter{

        private Device device;
        private int speed;
        private String mac;

        private EthernetAdapter(String manufacturer, String serialNumber, int speed, String mac, float price){
            this.device = new Device(manufacturer, serialNumber, price);
            this.speed = speed;
            this.mac = mac;
        }

        public static EthernetAdapter createEthernetAdapter(String manufacturer, String serialNumber,
                                                    int spead, String mac, float price){
            return new Device().new EthernetAdapter(manufacturer, serialNumber, spead, mac, price);
        }

        @Override
        public String toString() {
            return device.toString() + ",\n spead= " + speed +", mac= " + mac;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof EthernetAdapter that)) return false;
            return speed == that.speed && Objects.equals(mac, that.mac) && Objects.equals(device, that.device) ;
        }

        @Override
        public int hashCode() {
            return Objects.hash(device, speed, mac);
        }
    }
}
