package com.IIT;

public abstract class Van extends Vehical{

    private double cargoVolume;


    public Van(String idPlate, String brand, Date datetime, double cargoVolume) {
        super(idPlate, brand, datetime);
        this.cargoVolume = cargoVolume;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }
}
