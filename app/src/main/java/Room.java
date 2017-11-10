import com.bisonswap.painting.Component;

import java.util.ArrayList;

/**
 * Created by Destiny on 11/9/2017.
 */

public class Room {
    public ArrayList<Component> components;

    public  Room() {
        this.components = new ArrayList<>();
    }

    public double getPrice() {
        double price = 0;
        for (Component component: components) {
            price += component.getPrice();
        }
        return price;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }
}
