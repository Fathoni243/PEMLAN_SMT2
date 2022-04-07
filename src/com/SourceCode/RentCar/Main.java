package com.SourceCode.RentCar;

public class Main {
    public static void main(String[] args) {
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AF", "Honda");
        data.addCar("SPORT", "N 2222 AF", "Lamborghini");
        data.addCar("TRUCK", "N 3333 AF", "Suzuki");
        data.addCar("PICK UP", "N 4444 AF", "Mitsubishi");

        data.listOfCar();
        System.out.println();
        
        CarRider ming = new CarRider("Koh Bryan", 19, "08970987678");
        CarRider youhan = new CarRider("Koh Adam", 20, "089876545676");
        CarRider ling = new CarRider("Koh Aldy", 31, "0898765456788");
        CarRider kohFaza = new CarRider("Koh Faza", 29, "0898765456789");

        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.getCarList().get(1), 9);
        arsip.Rent(youhan, data.getCarList().get(2), 3);
        arsip.Rent(ling, data.getCarList().get(1), 1);
        arsip.Rent(kohFaza, data.getCarList().get(3), 10);

        System.out.println();
        arsip.info();
    }   
}
