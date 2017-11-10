package com.bisonswap.painting;

/**
 * Created by Destiny on 11/9/2017.
 */

public class Client {
    public String firstName;
    public String lastName;
    public String address;
    public double markupPercentage;

    public Client() {

        this.firstName = "unnamed";
        this.lastName = "unnamed";
        this.address = "unnamed";
        this.markupPercentage = 0;
    }

    public  Client(String firstName, String lastName, String address, double markupPercentage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.markupPercentage = markupPercentage;
    }

}
