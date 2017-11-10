import com.bisonswap.painting.Client;

import java.util.ArrayList;

/**
 * Created by Destiny on 11/9/2017.
 */

public class Project {
    public String name;
    public Client client;
    public ArrayList<Room> rooms;

    public Project() {
        this.name = "unnamed";
        this.rooms = new ArrayList<>();
    }

    public Project(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public double getPrice() {
        double price = 0;
        for (Room room:rooms) {
            price += room.getPrice();
        }
        return price;
    }

    public double getChargingPrice() {
        return this.getPrice() * this.client.markupPercentage;
    }
}
