package com.IIT;

public interface CarParkManager {

    void addNewVehicle(Vehical newVehicle);
    void deleteVehicle(String idPlate);
    void listOfVehicle();
    void vehiclePercentage();
    void vehicleParkingDuration();
    void findVehicle(int day, int year);
    void vehicleCharge();

}
