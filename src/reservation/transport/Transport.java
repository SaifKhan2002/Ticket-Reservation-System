package reservation.transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Transport {
    private String transportName;
    private ArrayList<Integer> id;
    private ArrayList<String> source = new ArrayList<>(Arrays.asList("Karachi", "Faislabad", "Hyderabad", "Sukkur",
            "Islamabad", "Multan", "Rawalpindi", "Peshawar", "Quetta", "Zhob"));
    private ArrayList<String> destination = new ArrayList<>(Arrays.asList("Hyderabad", "Karachi", "Faislabad,",
            "Islamabad", "Multan", "Rawalpindi", "Peshawar", "Quetta", "Zhob"));
    private ArrayList<Integer> price;

    private final static Random RANDOM = new Random();

    // TODO Date of journey

    public Transport(String transportName) {
        this.transportName = transportName;
    }

    public void add(String source, String destination, int price) {

        this.id.add(RANDOM.nextInt(1000, 10000));
        this.source.add(source);
        this.destination.add(destination);
        this.price.add(price);
    }

    public String getTransportName() {
        return transportName;
    }

    public int getIdAt(int index) {
        try {
            return id.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public String getSourceAt(int index) {
        try {
            return source.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getDestinationAt(int index) {
        try {
            return destination.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return "";
        }
    }

    public int getPriceAt(int index) {
        try {
            return price.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public abstract void booking();

    public abstract void departure();
}
