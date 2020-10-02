package com.codersbay;

public class Address {
    private int postCode;
    private String street;
    private String city;
    private String houseNr;
    private String doorNr;

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }

    public String getDoorNr() {
        return doorNr;
    }

    public void setDoorNr(String doorNr) {
        this.doorNr = doorNr;
    }

    public Address() {
    }

    public Address(int postCode, String street, String city, String houseNr) {
        this.postCode = postCode;
        this.street = street;
        this.city = city;
        this.houseNr = houseNr;
    }

    public Address(int postCode, String street, String city, String houseNr, String doorNr) {
        this.postCode = postCode;
        this.street = street;
        this.city = city;
        this.houseNr = houseNr;
        this.doorNr = doorNr;
    }

    @Override
    public String toString() {
        String help = this.street;

        if (this.houseNr != null) {
            help += " " + this.houseNr;
        }
        if (this.doorNr != null) {
            help += " door " + this.doorNr;
        }
        help += ", " + this.city;
        if (this.postCode > 0) {
            help += ", " + this.postCode;
        }
        return help;
    }
}
