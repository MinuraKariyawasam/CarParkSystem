package com.IIT;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class WestminsterCarParkManager implements CarParkManager{
    private int carCount;
    private int vanCount;
    private int motorbikeCount;
    private int timeDifference;
    private double parkingCharges;

    List<Vehical> vehiclesInformation = new ArrayList<>(20);
    LocalTime currentTime = LocalTime.now();
    int currentDate = LocalDate.now().getDayOfMonth();

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

        if (!IsVehicleInList){ System.out.println("ID number " + idPlate + " not in the system."); }
    }

    @Override
    public void listOfVehicle() {

    }

    @Override
    public void vehiclePercentage() {

        for(Vehical vehicleCount : vehiclesInformation){
            if (vehicleCount instanceof car){ carCount = carCount + 1; }
            else if (vehicleCount instanceof Van){ vanCount = vanCount + 1; }
            else { motorbikeCount = motorbikeCount + 1; }
        }

        // get the percentage
        double carPercentage = (carCount/vehiclesInformation.size()) * 100;
        double vanPercentage = (vanCount/vehiclesInformation.size()) * 100;
        double motorbikePercentage = (motorbikeCount/vehiclesInformation.size()) * 100;

        System.out.println("Car percentage: " + carPercentage);
        System.out.println("Van percentage: " + vanPercentage);
        System.out.println("Motorbike percentage: " + motorbikePercentage);

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
        boolean isVehicleInThisDate = false;

        for (Vehical vehicleDate : vehiclesInformation){

            if (vehicleDate.getDatetime().getDay() == currentDate){
                isVehicleInThisDate = true;
                timeDifference = (currentTime.getHour() - vehicleDate.getDatetime().getHour());
                break;
            }
        }

        if (timeDifference <= 3){ parkingCharges = 3 * timeDifference;}
        else { parkingCharges = 9 + (timeDifference - 3); }

        if (!isVehicleInThisDate){ System.out.println("There are no vehicle at that day."); }

        for (Vehical parkingVehicle : vehiclesInformation){
            System.out.println("ID plate: " + parkingVehicle.getIdPlate() + " final price: " + parkingCharges);
        }
    }
}
