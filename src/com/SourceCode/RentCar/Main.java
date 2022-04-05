package com.SourceCode.RentCar;

public class Main {
    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "0970987678");
        CarRider youhan = new CarRider("Bei Youhan", 20, "09876545676");
        CarRider ling = new CarRider("Ling'er", 31, "098765456788");
        CarRider kohFaza = new CarRider("Koh Faza", 31, "098765456788");

        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");

        data.listOfCar();
        System.out.println();

        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        arsip.Rent(kohFaza, data.carList.get(2), 10);

        System.out.println();
        arsip.info();
    }   
}
