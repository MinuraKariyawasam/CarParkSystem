package com.IIT;

public abstract class Vehical {

    private String idPlate;
    private String brand;
    private Date datetime;

    public Vehical(String idPlate, String brand, Date datetime) {
        this.idPlate = idPlate;
        this.brand = brand;
        this.datetime = datetime;
    }

    public String getIdPlate() {
        return idPlate;
    }

    public void setIdPlate(String idPlate) {
        this.idPlate = idPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
