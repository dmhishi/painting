package com.bisonswap.painting;

/**
 * Created by Destiny on 11/9/2017.
 */

public class Component {
    public String name;
    public double length;
    public double width;

    public Component() {
        this.name = "unnamed";
        this.length = 0;
        this.width = 0;
    }

    public Component(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public double getUnitPrice() {
        return 0;
    }

    public double getPrice() {
        return length * width * this.getUnitPrice();
    }
}
