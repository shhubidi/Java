abstract class Device {
    public String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public abstract void turnOn();
}

interface RemoteControllable {
    void connectToWifi();
}

interface PowerSaving {
    int getEnergyRating();
}

class SmartTV extends Device implements RemoteControllable, PowerSaving {

    public SmartTV(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " TV is booting up...");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connecting to Home_5G...");
    }

    @Override
    public int getEnergyRating() {
        return 5;
    }
}

class ElectricKettle extends Device {

    public ElectricKettle(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " Kettle is heating water...");
    }
}

public class CaseStudy2b {
    public static void main(String[] args) {

        Device d = new SmartTV("Sony");
        d.turnOn();

        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();

    }
}
