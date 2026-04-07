import java.util.*;

abstract class Transport {
    public String trackingId;
    public String destination;

    public Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    public abstract void dispatch();
}

interface GPS {
    String getCoordinates();
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {

    public DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    public void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    @Override
    public String getCoordinates() {
        return "40.7128° N, 74.0060° W";
    }

    @Override
    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}

class Truck extends Transport {

    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    public void dispatch() {
        System.out.println("Truck " + trackingId + " departing...");
    }
}

public class CaseStudy2c {
    public static void main(String[] args) {

        Transport t = new DeliveryDrone("D101", "New York");
        t.dispatch();

        GPS g = new DeliveryDrone("D101", "New York");
        System.out.println(g.getCoordinates());

        Transport t2 = new Truck("T202", "Chicago");

        System.out.println(t instanceof GPS);  
        System.out.println(t2 instanceof GPS); 

        List<Transport> list = new ArrayList<>();
        list.add(new DeliveryDrone("D101", "NY"));
        list.add(new Truck("T202", "LA"));

        System.out.println("\nProcessing all transports:");
        for (Transport tr : list) {
            tr.dispatch();
        }
    }
}