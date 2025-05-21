package com.tka.ipl;

public class House {
    private String address;
    private int numberOfRooms;
    private double area;
    private boolean hasGarage;

    public House() {
        // Default constructor
    }

    public House(String address, int numberOfRooms, double area, boolean hasGarage) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
        this.hasGarage = hasGarage;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public boolean isHasGarage() {
        return hasGarage;
    }
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House{address='" + address + "', numberOfRooms=" + numberOfRooms + ", area=" + area + ", hasGarage=" + hasGarage + "}";
    }
}

