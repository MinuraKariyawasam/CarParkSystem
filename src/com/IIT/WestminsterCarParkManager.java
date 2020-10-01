package com.IIT;

import java.util.ArrayList;
import java.util.List;

public class WestminsterCarParkManager implements CarParkManager{

    List<Vehical> vehiclesInformation = new ArrayList<>(20);

    @Override
    public void addNewVehicle(Vehical newVehicle) {
        if (vehiclesInformation.size() < 20){
            vehiclesInformation.add(newVehicle);
            System.out.println("Remaining slots: " + (20 - vehiclesInformation.size()));
        }else{
            System.out.println("There are no lots available");
        }
    }

    @Override
    public void deleteVehicle(String idPlate) {
        boolean IsVehicleInList = false;

        for (Vehical deleteVehicle : vehiclesInformation) {

            if (deleteVehicle.getIdPlate().equals(idPlate)) {
                IsVehicleInList = true;

                vehiclesInformation.remove(deleteVehicle);
                System.out.println();
                if (deleteVehicle instanceof car) {
                    System.out.println(idPlate + "number Car remove successfully.");
                } else if (deleteVehicle instanceof Van) {
                    System.out.println(idPlate + "number Van remove successfully.");
                } else {
                    System.out.println(idPlate + " number Motorbike remove successfully.");
                }
            }

        }

        if (!IsVehicleInList){ System.out.println("ID number" + idPlate + " not in the system."); }
    }

    @Override
    public void listOfVehicle() {

    }

    @Override
    public void vehiclePercentage() {

    }

    @Override
    public void vehicleParkingDuration() {

    }

    @Override
    public void findVehicle(int day, int year) {
        boolean isVehicleInThisDate = false;

        for(Vehical findVehicle : vehiclesInformation){

            if (findVehicle.getDatetime().toString().equals(day + "." + year)){
                isVehicleInThisDate = true;
                System.out.println("Vehicle ID Plate: " + findVehicle.getIdPlate() + "Vehicle Brand: " + findVehicle.getBrand());

                if (findVehicle instanceof car) { System.out.println("Type Of the Vehicle: Car"); }
                else if (findVehicle instanceof Van) { System.out.println("Type Of the Vehicle: Van"); }
                else { System.out.println("Type Of the Vehicle: Motorbike"); }
            }
        }
        if (!isVehicleInThisDate){ System.out.println("There are no vehicle at that day."); }

    }

    @Override
    public void vehicleCharge() {

    }
}
