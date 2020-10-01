package com.IIT;

public class Motorbike extends Vehical{

    private double sizeOfEngine;

    public Motorbike(String idPlate, String brand, Date datetime, double sizeOfEngine) {
        super(idPlate, brand, datetime);
        this.sizeOfEngine = sizeOfEngine;
    }

    public double getSizeOfEngine() {
        return sizeOfEngine;
    }

    public void setSizeOfEngine(double sizeOfEngine) {
        this.sizeOfEngine = sizeOfEngine;
    }
}
