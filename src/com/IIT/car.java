package com.IIT;

public class car extends Vehical {
    private int numberOfDoors;
    private String doorColor;

    public car(String idPlate, String brand, Date datetime, int numberOfDoors, String doorColor) {
        super(idPlate, brand, datetime);
        this.numberOfDoors = numberOfDoors;
        this.doorColor = doorColor;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }
}
